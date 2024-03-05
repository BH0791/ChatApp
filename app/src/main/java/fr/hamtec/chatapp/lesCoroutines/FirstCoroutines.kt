package fr.hamtec.chatapp.lesCoroutines

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.runtime.Composable
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun MaCoroutines() : String {

    GlobalScope.launch {
        delay(5000)
        Log.i("HAMID", "<<==== Thread ====>> "+ Thread.currentThread().name)
    }



    return "Ma coroutine"
}