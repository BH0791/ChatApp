package fr.hamtec.chatapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen(name : String){
    Text(
        modifier = Modifier
            .background(Color.Red)
            .padding(5.dp),
        text =  "Screen $name!",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )
}