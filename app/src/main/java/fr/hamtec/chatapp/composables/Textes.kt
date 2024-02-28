package fr.hamtec.chatapp.composables

import android.annotation.SuppressLint
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import fr.hamtec.chatapp.R

@Composable
fun MonTexte() {
    //Text(text = "Hello HamidB")
    Text(
        text = stringResource(id = R.string.nom),
        color = Color(0xFF2196F3),
        style = TextStyle(color = Color.DarkGray)
    )
}

@Composable
fun TonText() {
    Text(
        text = "Simple text",
        color = colorResource(id = R.color.purple_500)
    )
}

@Preview(showBackground = true)
@Composable
fun AffichemonTexte() {
    MonTexte()
}

@Preview(showBackground = true)
@Composable
fun AfficheTonTexte() {
    TonText()
}