package fr.hamtec.tpbookjetpackcompose.gestionClick

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyScreen_1() {
    Column {
        var clickNumber : MutableState<Int> = remember {
            mutableStateOf(0)
        }
        Button(onClick = { clickNumber.value ++ }) {
            Text(text = "Cliqué ${clickNumber.value}")
        }
    }
}

// ! import androidx.compose.runtime.getValue et import androidx.compose.runtime.setValue
@Composable
fun MyScreen_2() {
    Column {
        var clickNumber by remember {
            mutableStateOf(0)
        }
        Button(onClick = { clickNumber ++ }) {
            Text(text = "Cliqué $clickNumber")
        }
    }
}

// ** rememberSaveable ==> Permet de garder la valeur de la variable à la rotation de l'écran
@Composable
fun MyScreen() {
    var clickNumber by rememberSaveable {
        mutableStateOf(0)
    }
    Column {
        Text(text = "Vous avez cliqué $clickNumber fois")
        IncrementButton(clickNumber, {clickNumber++})
    }
}

@Composable
fun IncrementButton(clickNumber: Int, onIncrement : () -> Unit) {

    Button(onClick = onIncrement) {
        Text(text = "Cliquer")
    }
}

@Preview(showBackground = true)
@Composable
fun MyScreenPreview() {
    MyScreen()
}