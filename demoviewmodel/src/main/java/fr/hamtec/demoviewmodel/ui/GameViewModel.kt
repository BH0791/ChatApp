package fr.hamtec.demoviewmodel.ui

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import fr.hamtec.demoviewmodel.data.allWords
import fr.hamtec.demoviewmodel.data.MAX_NO_OF_WORDS
import fr.hamtec.demoviewmodel.data.SCORE_INCREASE
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * Conteneurs d'états
 * ViewModel contenant les données de l'application et les méthodes pour traiter les données
 */
class GameViewModel : ViewModel() {


    /**
     * État de l'interface utilisateur du jeu
     * StateFlow est un flux observable de conteneur de données qui émet les mises à jour de l'état
     * actuel et du nouvel état. Sa propriété value reflète la valeur de l'état actuel. Pour mettre
     * à jour l'état et l'envoyer au flux, attribuez une nouvelle valeur à la propriété de valeur de
     * la classe MutableStateFlow.
     * Dans Android, StateFlow fonctionne bien avec les classes qui doivent conserver un état immuable
     * observable. Un StateFlow peut être exposé à partir de GameUiState afin que les composables
     * puissent écouter les mises à jour de l'état de l'interface utilisateur et faire en sorte que
     * l'état de l'écran survive aux changements de configuration.
     */
    private val _uiState = MutableStateFlow(GameUiState())
    val uiState: StateFlow<GameUiState> = _uiState.asStateFlow()

    var userGuess by mutableStateOf("")
        private set

    /**
     * Ensemble de mots utilisés dans le jeu,
     * la propriété currentWord pour servir d'ensemble modifiable qui stockera les mots utilisés
     * dans le jeu.
     */
    private var usedWords: MutableSet<String> = mutableSetOf()

    /**
     * Pour enregistrer le mot mélangé
     */
    private lateinit var currentWord: String

    /**
     * Bloc init au GameViewModel et appelle resetGame() à partir de celui-ci.
     */
    init {
        resetGame()
    }

    /*
     * Réinitialise les données du jeu pour redémarrer le jeu.
     * permettant d'initialiser le jeu. Vous utiliserez cette fonction plus tard pour démarrer et
     * redémarrer le jeu. Dans cette fonction, effacez tous les mots de l'ensemble usedWords et
     * initialisez _uiState.
     * Choisissez un nouveau mot pour currentScrambledWord avec pickRandomWordAndShuffle().
     */
    fun resetGame() {
        usedWords.clear()
        _uiState.value = GameUiState(currentScrambledWord = pickRandomWordAndShuffle())
    }

    /*
     * Mettre à jour l'estimation de l'utilisateur
     */
    fun updateUserGuess(guessedWord: String){
        userGuess = guessedWord
    }

    /*
     * Checks if the user's guess is correct.
     * Increases the score accordingly.
     */
    fun checkUserGuess() {
        if (userGuess.equals(currentWord, ignoreCase = true)) {
            // User's guess is correct, increase the score
            // and call updateGameState() to prepare the game for next round
            val updatedScore = _uiState.value.score.plus(SCORE_INCREASE)
            updateGameState(updatedScore)
        } else {
            // User's guess is wrong, show an error
            _uiState.update { currentState ->
                currentState.copy(isGuessedWordWrong = true)
            }
        }
        // Reset user guess
        updateUserGuess("")
    }

    /*
     * Passer au mot suivant
     */
    fun skipWord() {
        updateGameState(_uiState.value.score)
        // Réinitialiser la supposition de l'utilisateur
        updateUserGuess("")
    }

    /*
     * Picks a new currentWord and currentScrambledWord and updates UiState according to
     * current game state.
     */
    private fun updateGameState(updatedScore: Int) {
        if (usedWords.size == MAX_NO_OF_WORDS){
            //Last round in the game, update isGameOver to true, don't pick a new word
            _uiState.update { currentState ->
                currentState.copy(
                        isGuessedWordWrong = false,
                        score = updatedScore,
                        isGameOver = true
                )
            }
        } else{
            // Normal round in the game
            _uiState.update { currentState ->
                currentState.copy(
                        isGuessedWordWrong = false,
                        currentScrambledWord = pickRandomWordAndShuffle(),
                        currentWordCount = currentState.currentWordCount.inc(),
                        score = updatedScore
                )
            }
        }
    }

    /**
     * Méthode d'assistance pour lire le mot actuel shuffleCurrentWord() en mode aléatoire, qui
     * accepte une String et renvoie la String dans un ordre aléatoire
     */
    private fun shuffleCurrentWord(word: String): String {
        val tempWord = word.toCharArray()
        // Mots mêlés
        tempWord.shuffle()
        while (String(tempWord) == word) {
            tempWord.shuffle()
        }
        return String(tempWord)
    }

    /**
     * Méthode d'assistance pour choisir un mot aléatoire dans la liste et le lire en mode aléatoire.
     * Continuez à prendre un nouveau mot au hasard jusqu'à ce que vous obteniez un mot qui n'a jamais
     * été utilisé auparavant.
     */
    private fun pickRandomWordAndShuffle(): String {
        //- Continuez à prendre un nouveau mot au hasard jusqu'à ce que vous obteniez un mot qui n'a jamais été utilisé auparavant.
        currentWord = allWords.random()
        return if (usedWords.contains(currentWord)) {
            pickRandomWordAndShuffle()
        } else {
            usedWords.add(currentWord)
            shuffleCurrentWord(currentWord)
        }
    }
}