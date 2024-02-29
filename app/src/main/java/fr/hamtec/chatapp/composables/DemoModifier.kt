package fr.hamtec.chatapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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

@Preview(showBackground = true)
@Composable
fun PreviewDemoModifier() {
//    DemoModifierOrder()
//    DemoTypeSafeModifier()
    UserBadge(username ="Louis Armstrong")
//    UserBadge(username = "Me")
}