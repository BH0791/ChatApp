package fr.hamtec.tpbookjetpackcompose.chapitre_3

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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
fun UserBadge(username : String) {
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

@Preview(showBackground = true)
@Composable
fun UserBadgePreview() {
    //UserBadge(username = "Louis Hamstrong")
    //DemoTypeSafeModifier()
    //DemoPlacementAvecBox()
    //DemoPlacementBoxBaseLigne()
    DemoPlacementBoxBase()
}