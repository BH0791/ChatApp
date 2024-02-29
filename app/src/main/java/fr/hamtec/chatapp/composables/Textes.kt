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

//@Composable
//fun UserBadge(
//    username : String,
//    modifier : Modifier = Modifier
//) {
//    Row(
//        modifier = modifier
//    ) {
//        Icon(
//            imageVector = Icons.Rounded.Person,
//            contentDescription = null,
//            modifier = Modifier
//                .size(20.dp)
//                .border(
//                    width = 1.dp,
//                    color = Color(0xFFFF7043),
//                    shape = CircleShape
//                )
//                .padding(2.dp)
//        )
//        Text(
//            text = username,
//            modifier = Modifier.padding(start = 4.dp)
//        )
//    }
//}

@Composable
fun Message(modifier : Modifier = Modifier) {
    Row (
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ){
        Column (
            modifier = modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(4.dp)

        ){
            UserBadge(username = "Me", modifier =  Modifier.align(Alignment.End)
            )
            MessageContent("Louis", "61.6 pm")
        }
        //ReadStatusIcon()
    }
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
//            color = MaterialTheme.colorScheme.primary,
//            style = MaterialTheme.typography.headlineSmall,
//            fontSize = 18.sp
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