package `11_generics_and_utility_classes`.battle

import `11_generics_and_utility_classes`.Team

sealed class BattleState {
    open val stateInfo: String
        get() = when (this) {
            is Draw -> "\nTeam ${team1.teamName} vs team ${team2.teamName}: DRAW WON!"
            is Team1Win -> "\nTeam ${team1.teamName} vs team ${team2.teamName}: ${team1.teamName} WON!"
            is Team2Win -> "\nTeam ${team1.teamName} vs team ${team2.teamName}: ${team2.teamName} WON!"
            is Progress -> "\nBattle in progress..."
        }

    class Draw(val team1: Team, val team2: Team) : BattleState()

    class Team1Win(val team1: Team, val team2: Team) : BattleState()

    class Team2Win(val team1: Team, val team2: Team) : BattleState()

    class Progress(private val team1: Team, private val team2: Team) : BattleState() {
        val progressInfo: String
            get() = "\n${team1.teamName} - total HP: ${team1.currentHP.toInt()}" +
                    "\n${team1.teamName} - unit(s): ${team1.currentSize}" +
                    "\n${team2.teamName} - total HP: ${team2.currentHP.toInt()}" +
                    "\n${team2.teamName} - unit(s): ${team2.currentSize}"
    }
}
