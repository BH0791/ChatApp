package fr.hamtec.tpbookjetpackcompose.chapitre_4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.ConnectedTv
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.hamtec.tpbookjetpackcompose.R

@Composable
fun SimpleButton() {
    Button(
        modifier = Modifier.height(80.dp),
        onClick = { /*TODO*/ },
        elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 6.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray, contentColor = Color.Black),
        contentPadding = PaddingValues(8.dp)
    ) {
        Icon(
            Icons.Default.ConnectedTv,
            contentDescription = null,
            modifier = Modifier.padding(end = 16.dp)
        )
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "Lecture en cours - 90%",
                textAlign = TextAlign.Center
            )
            Text(
                text = "TV salon",
                style = MaterialTheme.typography.bodyMedium
            )

        }
        Icon(
            Icons.Default.ChevronRight,
            contentDescription = null,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}
@Composable
fun SimpleIconButton(){
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            imageVector = Icons.Default.Send,
            contentDescription = stringResource(id = R.string.cd_send),
            tint = Color.Red,
            modifier = Modifier.size(25.dp)

        )
    }
}
@Composable
fun FilledButtonExample(onClick : () -> Unit) {
    Button(onClick = { onClick() }) {
        Text("Filled")
    }
}
@Composable
fun SimpleFABButton(){
    FloatingActionButton(onClick = { /*TODO*/ },
        containerColor = Color(0xFFFF5247),
        contentColor = Color.White,
        shape = MaterialTheme.shapes.extraLarge
        ) {
        Icon(
            imageVector = Icons.Default.Message,
            contentDescription = stringResource(id = R.string.cd_send)
        )
    }
}
@Composable
fun SimpleExtendedFABButton(){
    ExtendedFloatingActionButton(
        onClick = { /*TODO*/ },
        shape = MaterialTheme.shapes.large,
        containerColor = Color(0xFFFF52FF),
        contentColor = Color.Black,

    ) {
        Icon(
            imageVector = Icons.Default.Message,
            contentDescription = null
        )
        Text(text = "Nouveau message")
    }
}
@Preview(showBackground = true)
@Composable

fun SimpleButtonPreview() {
    SimpleExtendedFABButton()
}