package fr.hamtec.chatapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DemoModifierOrder(){
    Text(text = "Tomato",
        modifier = Modifier
            .background(Color.Gray)
            .padding(10.dp)
            .background(Color.White))
}

@Composable
fun DemoTypeSafeModifier(){
    Row(
        modifier = Modifier.fillMaxWidth()
    ){
        Text(
            text = "Tomato",
            modifier = Modifier.weight(1f)
        )
        Text(
            text = "Tomato",
            modifier = Modifier.weight(1f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDemoModifier(){
//    DemoModifierOrder()
    DemoTypeSafeModifier()
}