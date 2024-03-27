package fr.hamtec.demoviewmodel.ui
//- GameStatus est une fonction composable qui affiche le score du jeu en bas de l'écran. La fonction
//- composable contient un composable Text dans une Card. Pour l'instant, le score est codé en dur pour être 0.

/**
 * Classe de données qui représente l'état de l'interface utilisateur du jeu
 */
data class GameUiState(
        val currentScrambledWord: String = "",
        val currentWordCount: Int = 1,
        val score: Int = 0,
        val isGuessedWordWrong: Boolean = false,
        val isGameOver: Boolean = false
)