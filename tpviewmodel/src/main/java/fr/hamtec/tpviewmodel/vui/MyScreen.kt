package fr.hamtec.tpviewmodel.vui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

// ** Graphiques ça va contenir tout l'écran UI de notre app
@Composable
fun MyScreen(viewModel : MainViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {

    val uiState = viewModel.uiState

    Box(
            modifier = Modifier.fillMaxSize()   //! Toute la largeur de l'écran
    ) {

        Column(
                modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                    text = uiState.value.currentName,
                    fontSize = 25.sp
            )
            Button(
                    onClick = { viewModel.onUiEvent((UiEvent.OnGenerateClick)) }
            ) {
                Text(
                        text = "Générer (Déjà ${uiState.value.clickNumber} fois"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyScreen()
}