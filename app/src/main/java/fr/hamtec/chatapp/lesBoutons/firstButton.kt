package fr.hamtec.chatapp.lesBoutons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyFirtButton(){
    Column {
        Spacer(modifier = Modifier.padding(50.dp))

        var clickNumber by remember {
            mutableStateOf(0)
        }
        Button(onClick = {clickNumber ++}) {
            Text(text = "Cliqué ${clickNumber} fois")
        }
    }
}