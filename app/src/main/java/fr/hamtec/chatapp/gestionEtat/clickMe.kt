package fr.hamtec.chatapp.gestionEtat

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import fr.hamtec.chatapp.composables.Screen

@Composable
fun MyClick(){
    var clickNumber by remember {
        mutableStateOf(0)
    }
    Column {
        Text(text = "Vous avez cliqué $clickNumber fois")
        IncrementButton(clickNumber, {clickNumber++})
    }
}

@Composable
fun IncrementButton(clickNumber: Int, onIncrement: () -> Unit) {
    Button(onClick = onIncrement) {
        Text(text = "Cliquer")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewClick() {
    MyClick()
}
