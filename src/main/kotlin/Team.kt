package `11_generics_and_utility_classes`

import `11_generics_and_utility_classes`.warrior.*
import kotlin.random.Random

class Team(teamSize: Int, val teamName: String) {
    var team = mutableListOf<AbstractWarrior>()

    init {
        for (warrior in 0 until teamSize) {
            val chance = Random.nextInt(0, 100)
            when {
                chance <= 5 -> team.add(Doomguy())
                chance <= 10 -> team.add(General())
                chance <= 20 -> team.add(Captain())
                else -> team.add(Soldier())
            }
        }
        println("\n$teamName")
        team.forEach { println("Rank: ${it.rank}, health: ${it.maxHP.toInt()}") }
    }

    val currentHP: Double
        get() = team.sumOf { it.currentHP }

    val currentSize: Int
        get() = team.size

    val emptyTeam: Boolean
        get() = team.isEmpty()

    fun removeDead() {
        team.removeAll { it.isKilled }
    }
}