package fr.hamtec.tpviewmodel.vui.data

object dataSource {
    private val listPersons = listOf("Alain", "Armand", "louis", "Philipe", "Jean")
    val randomPerson = listPersons.random()
    fun randomPerson() = listPersons.random()
}