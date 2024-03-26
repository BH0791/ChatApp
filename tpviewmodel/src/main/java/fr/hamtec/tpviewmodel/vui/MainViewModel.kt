package fr.hamtec.tpviewmodel.vui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import fr.hamtec.tpviewmodel.vui.data.dataSource

class MainViewModel: ViewModel() {


    val uiState: MutableState<UIState> = mutableStateOf(UIState())

    // ** Logique des événement opéré selon les événements envoyer par l'utilisateur
    init {
        onUiEvent(UiEvent.OnInit)
    }
    fun onUiEvent(uiEvent: UiEvent){
        when(uiEvent){
            is UiEvent.OnInit -> {
                uiState.value = UIState(
                        dataSource.randomPerson, 0
                )
            }
            is UiEvent.OnGenerateClick -> {
                uiState.value = UIState(
                        // ** dataSource.randomPerson ==>> il faut une fonction
                        dataSource.randomPerson(), uiState.value.clickNumber + 1
                )
            }
        }
    }
}