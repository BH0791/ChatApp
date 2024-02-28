package fr.hamtec.chatapp.composables

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fr.hamtec.chatapp.R

@Composable
fun MonTexte() {
    Text(
        text = stringResource(id = R.string.nom),
        color = Color(0xFF2196F3),
        style = TextStyle(color = Color.DarkGray)
    )
}

@Composable
fun TonText() {
    Text(
        text = "Louis Armstrong",
        color = colorResource(id = R.color.purple_500)
    )
}

@Composable
fun MessageContent(
    text: String,
    time: String,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .border(
                width = 2.dp,
                color = MaterialTheme.colorScheme.secondary,
                shape = MaterialTheme.shapes.small
            )
            .padding(8.dp)

    ) {
        Text(
            text = text,
            color = MaterialTheme.colorScheme.primary,
            fontSize = 18.sp
        )
        Text(
            text = time,
            modifier = Modifier.align(Alignment.End),
            fontSize = 12.sp,
            fontWeight = FontWeight.Light,
            fontStyle = FontStyle.Italic
        )
    }

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
@Preview(showBackground = true)
@Composable
fun AffichemessageContent() {
    MessageContent("You like potato", "6:31 pm")
}