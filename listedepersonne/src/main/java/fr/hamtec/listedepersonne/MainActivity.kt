package fr.hamtec.listedepersonne

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fr.hamtec.listedepersonne.ui.theme.ChatAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChatAppTheme {
                    MyScreen( )
                }
            }
        }
    }


@Composable
fun MyScreen() {
// ! ne cosomme pas beaucoup
LazyColumn {
    items(Data.listePersons){fullName ->
        PersonneItem(fullName = fullName)
    }
}
// ! Consomme beaucoup si la liste est grande
//    Column( modifier = Modifier
//        .fillMaxSize()
//        .verticalScroll(rememberScrollState())
//    ){
//        Data.listePersons.forEach{
//            PersonneItem(fullName = it)
//        }
//    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ChatAppTheme {
        MyScreen()
    }
}