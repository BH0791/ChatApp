package fr.hamtec.chatapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fr.hamtec.chatapp.composables.Screen
import fr.hamtec.chatapp.gestionEtat.MyClick
import fr.hamtec.chatapp.ui.theme.ChatAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChatAppTheme {
                //! Pour styliser une partie de l'application, il suffit d'englober le composant racine
                //Screen(name = "Androiddddd")
                //SingleText()
                //MessageContent(text = "je suis arrivé à la maison hamidb @gmail.com", time = "6:31 pm")
                //MyFirtButton()
//                Log.i("HAMID", "Thread ====>> " + Thread.currentThread().name)
//                Log.i("HAMID", "Thread ====>> " + MaCoroutines())
                MyClick()
            }

        }
    }
}

// ** C'est que pour la preview et rien d'autre **
// ** @Preview a plusieur arguments
@Preview(showBackground = true)
@Composable
fun MyPreview() {
    // + J'ai placé un nom dans la ressource string.xml
    //! MyMethode(stringResource(id = R.string.nom))
    Screen(name = "Screen: Hello")
}