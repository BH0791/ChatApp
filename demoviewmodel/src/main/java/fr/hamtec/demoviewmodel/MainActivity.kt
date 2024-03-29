package fr.hamtec.demoviewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.hamtec.demoviewmodel.ui.GameScreen
import fr.hamtec.demoviewmodel.ui.theme.ChatAppTheme
//- Ce fichier contient principalement du code généré à partir d'un modèle. Le composable GameScreen
//- est affiché dans le bloc setContent{}.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChatAppTheme {
                Surface(
                        modifier = Modifier.fillMaxSize()
                ) {
                    GameScreen()
                }
            }
        }
    }
}
