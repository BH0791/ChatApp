package fr.hamtec.chatapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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

@Composable
fun DemoModifierOrder() {
    Text(
        text = "Tomato",
        modifier = Modifier
            .background(Color.Gray)
            .padding(10.dp)
            .background(Color.White)
    )
}

@Composable
fun DemoTypeSafeModifier() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Tomato",
            modifier = Modifier
                .weight(1f)
                .background(Color.Yellow)
        )
        Text(
            text = "Tomato",
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
fun UserBadge(
    username : String,
    modifier : Modifier = Modifier) {

    Row {
        Icon(
            imageVector = Icons.Rounded.Person,
            contentDescription = null,
            modifier = Modifier
                .size(20.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFFFF7043),
                    shape = CircleShape
                )
                .padding(2.dp)
        )
        Text(
            text = username,
            modifier = Modifier.padding(start = 4.dp)
        )
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

@Composable
fun Message(modifier : Modifier = Modifier) {
    Row (
        modifier = Modifier.border(1.dp, Color.Yellow),
        horizontalArrangement = Arrangement.spacedBy(10.dp)

    ){
        Column (
            modifier = modifier.border(2.dp, Color(0xFF000000)),
            verticalArrangement = Arrangement.spacedBy(4.dp)

        ){
//            UserBadge(username = "Me", modifier =  Modifier.align(Alignment.End))
            MessageContent("Louis", "61.6 pm")
            MessageContent("Louis", "61.6 pm")
            UserBadge(username = "Me", Modifier.align(Alignment.End).border(5.dp, Color(0xFFFF4585)))
            UserBadge(username = "Me", Modifier.align(Alignment.End).border(5.dp, Color(0xFFFF4585)))
            UserBadge(username = "Me", Modifier.align(Alignment.End).border(5.dp, Color(0xFFFF4585)))
        }
        //ReadStatusIcon(modifier = Modifier.size(16.dp).align(Alignment.Bottom))
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewDemoModifier() {
//    DemoModifierOrder()
//    DemoTypeSafeModifier()
//    UserBadge(username ="Louis Armstrong")
//    UserBadge(username = "Me")
//    MessageContent(text = "je suis arrivé à la maison", time = "6:31 pm")
    Message()
}