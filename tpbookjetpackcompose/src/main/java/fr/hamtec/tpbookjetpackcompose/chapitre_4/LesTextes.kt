package fr.hamtec.tpbookjetpackcompose.chapitre_4

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fr.hamtec.tpbookjetpackcompose.ui.theme.AppTheme

@Composable
fun SingleText() {
    Text(text = "We all live in a yellow submarine")
}

@Preview(showBackground = true)
@Composable
fun VoirPreview() {
    AppTheme {
        SingleText()
    }
}