package fr.hamtec.chatapp.composables

//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Composable
//fun MonTexte() {
//    Text(
//        text = stringResource(id = R.string.nom),
//        color = Color(0xFF2196F3),
//        style = TextStyle(color = Color.DarkGray)
//    )
//}






//@Preview(showBackground = true)
//@Composable
//fun AffichemonTexte() {
//    MonTexte()
//}

@Preview(showBackground = true)
@Composable
fun AfficheTonMessage() {
    MessageContent(text = "Je suis le professeur", time = "6:55 pm")
}
//@Preview(showBackground = true)
//@Composable
////fun AffichemessageContent() {
//    MessageContent("You like potato", "6:31 pm")
//}