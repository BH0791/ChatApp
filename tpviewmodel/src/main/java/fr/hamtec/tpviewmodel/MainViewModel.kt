package fr.hamtec.tpviewmodel

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val listPersons = listOf("Alain", "Armand", "louis", "Philipe", "Jean")
    val randomPerson = listPersons.random()
}