package fr.hamtec.chatapp.gestionEtat

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import fr.hamtec.chatapp.composables.Screen

@Composable
fun MyClick(){
    var clickNumber by rememberSaveable {
        mutableStateOf(0)
    }
    Column {
        Text(text = "Vous avez cliqué $clickNumber fois")
        IncrementButton(clickNumber, {clickNumber++})
    }
}

@Composable
fun IncrementButton(clickNumber: Int, onIncrement: () -> Unit) {
    Button(
        onClick = onIncrement,
        colors = if (clickNumber > 5) ButtonDefaults.buttonColors(Color.Yellow)else
        ButtonDefaults.buttonColors()
    ) {
        Text(text = "Cliquer")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewClick() {
    MyClick()
}
