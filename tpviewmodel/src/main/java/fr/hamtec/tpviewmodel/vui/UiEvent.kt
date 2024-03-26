package fr.hamtec.tpviewmodel.vui

// ** Tous les éléments de l'écran action
sealed class UiEvent {
    // ** Dans Kotlin, les objets sont utilisés pour créer des instances singleton ou pour regrouper
    // ** des fonctionnalités associées. Nous pouvons accéder et utiliser sans effort les objets de
    //  **l’instance singleton sans avoir besoin de modèles singleton explicites ou de déclarations statiques.
    // ** Il est pratique d’utiliser des objets pour maintenir un état global, fournir des fonctionnalités
    // ** centralisées ou gérer des opérations à l’échelle de l’application.

    object OnInit: UiEvent()    // **class object, cette classe va hériter de la classe UiEvent sans paramètre
    object OnGenerateClick: UiEvent()
}