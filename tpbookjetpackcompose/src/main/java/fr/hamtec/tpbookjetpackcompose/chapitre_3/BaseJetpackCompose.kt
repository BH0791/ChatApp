package fr.hamtec.tpbookjetpackcompose.chapitre_3

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.People
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.hamtec.tpbookjetpackcompose.ui.theme.AppTheme
import fr.hamtec.tpbookjetpackcompose.ui.theme.JetchatTheme
import fr.hamtec.tpbookjetpackcompose.ui.theme.JetchatTypography

@Composable
fun UserBadgeV1(username : String) {
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
fun UserBadge(username : String, modifier : Modifier = Modifier) {
    Row(modifier = modifier) {
        Icon(
            imageVector = Icons.Rounded.People,
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
fun message(modifier : Modifier = Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(10.dp)
            ,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            UserBadge(
                username = "Louis Hamstrong",
                modifier = modifier.align(Alignment.Start)
            )
            UserBadge(
                username = "Me",
                modifier = modifier.align(Alignment.End)
            )
            MessageContent("Je suis à la maison avec mon @copain", "6:52 pm")
        }
    }
}

@Composable
fun MessageContent(
    message : String,
    time : String,
    modifier : Modifier = Modifier
) {
    Column(
        modifier = modifier
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.secondary,
                shape = MaterialTheme.shapes.small
            )
            .padding(8.dp)
    ) {
        Text(
            text = message.highlighMentions(
                /*color = MaterialTheme.colorScheme.primary*/
                color = MaterialTheme.colorScheme.secondary
            )
        )
        Text(
            text = time,
            modifier = Modifier.align(Alignment.End),
            style = JetchatTypography.bodyMedium,
            color =  MaterialTheme.colorScheme.error
        )
    }
}

fun String.highlighMentions(color : Color) : AnnotatedString {
    val words : List<String> = this.split(" ")
    return buildAnnotatedString {
        words.forEachIndexed { index, word ->
            if (word.startsWith("@")) {
                withStyle(style = SpanStyle(color = color)) {
                    append(word)
                }
            } else {
                append(word)
            }
            if (index < words.count() - 1) {
                append(" ")
            }
        }
    }
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
                .border(
                    width = 1.dp,
                    color = Color(0xFF527526)
                )
        )
        Text(
            text = "Potato",
            modifier = Modifier
                .weight(1f)
                .border(
                    width = 1.dp,
                    color = Color(0xFFFF7526)
                )
        )
    }
}

@Composable
fun DemoPlacementAvecBox() {
    Row(Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .size(80.dp, 40.dp)
                .alignBy { it.measuredHeight / 1 }
                .background(Color.Magenta)
        )
        Box(
            modifier = Modifier
                .size(80.dp, 20.dp)
                .alignBy { it.measuredHeight / 2 }
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(20.dp, 20.dp)
                .background(Color.Blue)
        )
    }
}

@Composable
fun DemoPlacementBoxBaseLigne() {
    Row((Modifier.fillMaxWidth())) {
        Box(
            modifier = Modifier
                .size(80.dp, 40.dp)
                .alignBy { it.measuredHeight / 3 }
                .background(Color.Magenta)
        )
        Box(
            modifier = Modifier
                .size(80.dp, 20.dp)
                .alignBy { it.measuredHeight / 2 }
                .background(Color.Green)
        )
    }
}

@Composable
fun DemoPlacementBoxBase() {
    Row(Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .size(80.dp, 40.dp)
                .alignBy { it.measuredHeight / 1 }
                .background(Color.Magenta)
        )
        Box(
            modifier = Modifier
                .size(80.dp, 20.dp)
                .alignBy { it.measuredHeight / 2 }
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(20.dp, 20.dp)
                .background(Color.Blue)
        )
    }
}

@Composable
fun GoodText(text : String, modifier : Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun UserBadgePreview() {

    AppTheme {
        //UserBadge(username = "Louise Hamstrong")
        //DemoTypeSafeModifier()
        //DemoPlacementAvecBox()
        //DemoPlacementBoxBaseLigne()
        //DemoPlacementBoxBase()
        //GoodText(text = "Hello momo")
        message()
        //MessageContent("Ivan", "5:21 mp")
    }
}
