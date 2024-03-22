package fr.hamtec.tpbookjetpackcompose.lesThemes

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fr.hamtec.tpbookjetpackcompose.ui.theme.ChatAppTheme
import fr.hamtec.tpbookjetpackcompose.ui.theme.AppTheme

@Composable
fun UserBadge(

    username : String,
    modifier : Modifier = Modifier
) {
    Row(
        modifier = modifier
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.tertiary,
                shape = MaterialTheme.shapes.small
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = username,
            modifier = Modifier.padding(start = 4.dp),
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
fun MessageContent(
    text : String,
    time : String,
    modifier : Modifier = Modifier
) {
    Column(
        modifier = modifier
            .border(
                width = 2.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = MaterialTheme.shapes.small
            )
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = text,
            color = MaterialTheme.colorScheme.tertiary,
            fontSize = 20.sp
        )
        Text(
            text = time,
            modifier = Modifier.align(Alignment.End),
            color = MaterialTheme.colorScheme.primary,
            fontSize = 12.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Light
        )
        Text(
            text = "Hello",
            modifier = Modifier.align(Alignment.End),
            color = MaterialTheme.colorScheme.secondary,
            style = MaterialTheme.typography.titleLarge
        )
    }
}

@Preview(showBackground = true)
@Composable

fun TPPreview() {
    AppTheme {
//        UserBadge("Louis Hamstrong")
        MessageContent(text = "You like potato and I like potahto", time = "6:31 pm")
    }
}