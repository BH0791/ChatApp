package fr.hamtec.chatapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.hamtec.chatapp.ui.theme.ChatAppTypography
import fr.hamtec.chatapp.ui.theme.lato

@Composable
fun Screen(name : String) {
    Column(
        modifier = Modifier
            .border(
                width = 2.dp,
                color = MaterialTheme.colorScheme.secondary,
                shape = MaterialTheme.shapes.small
            )
    ) {
        Text(
            text = "Screen $name!",
            modifier = Modifier
                .background(Color.Red)
                .border(
                    2.dp,
                    Color.Yellow
                )
                .padding(5.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun MyPreview() {
    Screen(name = "Screen: Hello")
}