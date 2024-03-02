package fr.hamtec.chatapp.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import fr.hamtec.chatapp.R
import fr.hamtec.chatapp.ui.theme.fira_code

@Composable
fun SingleText() {
    Text(
        text = "Police",
        fontSize = 30.sp,
        color = Color.Blue,
        fontWeight = FontWeight.Medium,
        fontFamily = fira_code,
    )
}

@Composable
private fun SingleTextRessource() {
    Text(
        text = stringResource(id = R.string.yellow_submarine)

    )
}

@Composable
private fun TextParamOverride() {
    Text(
        text = stringResource(id = R.string.yellow_submarine),
        color = Color.Yellow,
        style = TextStyle(color = Color.Red)

        )
}

@Preview(showBackground = true)
@Composable
fun AfficheMessage() {
    SingleText()
}