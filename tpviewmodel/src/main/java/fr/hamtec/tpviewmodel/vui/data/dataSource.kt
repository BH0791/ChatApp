package fr.hamtec.tpviewmodel.vui.data

object dataSource {

    private val listPersons = listOf("Alain", "Armand", "louis", "Philipe", "Jean")
    val randomPerson = listPersons.random()
    // ** cette fonction permetra a générer des person aléatoire
    fun randomPerson() = listPersons.random()
}