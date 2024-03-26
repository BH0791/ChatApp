## Démonstration de ViewModel

WordsData.kt

Ce fichier contient la liste des mots utilisés dans le jeu, ainsi que des constantes pour le nombre maximal de mots par partie et le nombre de points gagnés par le joueur pour chaque mot trouvé.

MainActivity.kt

Ce fichier contient principalement du code généré à partir d'un modèle. Le composable GameScreen est affiché dans le bloc setContent{}.

GameScreen.kt

Tous les composables de l'interface utilisateur sont définis dans le fichier GameScreen.kt. Les sections suivantes vous présentent quelques fonctions modulables.

GameStatus

GameStatus est une fonction composable qui affiche le score du jeu en bas de l'écran. La fonction composable contient un composable Text dans une Card. Pour l'instant, le score est codé en dur pour être 0.

GameLayout

GameLayout est une fonction composable qui affiche la fonctionnalité principale du jeu, qui comprend le mot mélangé, les instructions du jeu et un champ de texte qui accepte les propositions de l'utilisateur.

GameScreen

Le composable GameScreen contient les fonctions composables GameStatus et GameLayout, le titre du jeu, le nombre de mots et les composables des boutons Submit (Envoyer) et Skip (Ignorer).

