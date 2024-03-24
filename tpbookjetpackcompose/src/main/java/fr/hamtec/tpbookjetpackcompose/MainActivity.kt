package fr.hamtec.tpbookjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import fr.hamtec.tpbookjetpackcompose.chapitre_3.UserBadgeV1
import fr.hamtec.tpbookjetpackcompose.lesThemes.MessageContent
import fr.hamtec.tpbookjetpackcompose.ui.theme.AppTheme
import fr.hamtec.tpbookjetpackcompose.ui.theme.ChatAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChatAppTheme {
                //UserBadgeV1(username = "HamidB")
                MessageContent(text = "Hello manolo", time = "2:45 mp")
            }
        }
    }
}

