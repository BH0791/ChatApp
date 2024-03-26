package fr.hamtec.tpviewmodel.vui

// ** Tous les éléments de l'écran action
sealed class UiEvent {
    object OnInit: UiEvent()    // **class object, cette classe va hériter de la classe UiEvent sans paramètre
    object OnGenerateClick: UiEvent()
}