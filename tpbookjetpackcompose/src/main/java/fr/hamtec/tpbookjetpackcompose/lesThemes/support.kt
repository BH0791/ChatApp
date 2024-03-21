package fr.hamtec.tpbookjetpackcompose.lesThemes

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.hamtec.tpbookjetpackcompose.ui.theme.ChatAppTheme

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

@Preview(showBackground = true, showSystemUi = false)
@Composable

fun TPPreview() {
    ChatAppTheme {
        UserBadge("Louis Hamstrong")
    }
}