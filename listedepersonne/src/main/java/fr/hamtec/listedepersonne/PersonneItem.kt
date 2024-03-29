package fr.hamtec.listedepersonne

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.hamtec.listedepersonne.ui.theme.ChatAppTheme
import kotlin.random.Random

@Composable
fun PersonneItem(fullName: String){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable {  }
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .padding(8.dp)
                .clip(RoundedCornerShape(50))
                .background(Color(Random.nextInt()))
        ){
            Text(
                text = fullName.first().uppercase(),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.align(Alignment.Center)
                )
        }
        Text(
            text = fullName,
            style = MaterialTheme.typography.labelLarge,
            fontWeight = FontWeight.Bold
        )
    }
}
@Preview(showBackground = true)
@Composable
fun PersonsgPreview() {
    ChatAppTheme {
        PersonneItem(fullName = "Hamid Bouadelatour")
    }
}