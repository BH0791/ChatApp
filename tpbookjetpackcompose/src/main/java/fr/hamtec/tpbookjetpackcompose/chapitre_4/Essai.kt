package fr.hamtec.tpbookjetpackcompose.chapitre_4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Essai(
        modifier : Modifier = Modifier
) {
    
    Box(modifier) {
        Text(text = "Essai")
    }
}

@Preview(showBackground =true , name = "Essai")
@Composable
private fun PreviewEssai() {
    Essai()
}