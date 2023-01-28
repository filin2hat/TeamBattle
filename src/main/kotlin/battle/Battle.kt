package `11_generics_and_utility_classes`.battle

import `11_generics_and_utility_classes`.Team

class Battle(teamSize: Int) {

    private val team1 = Team(teamSize, "BEARS TEAM")
    private val team2 = Team(teamSize, "BULLS TEAM")

    private val isGameOver: Boolean
        get() = team1.emptyTeam || team2.emptyTeam

    fun getBattleStatus(): BattleState {
        if (isGameOver) {
            when {
                team1.emptyTeam && team2.emptyTeam -> {
                    println(BattleState.Draw(team1, team2).stateInfo)
                    return BattleState.Draw(team1, team2)
                }

                !team1.emptyTeam && team2.emptyTeam -> {
                    println(BattleState.Team1Win(team1, team2).stateInfo)
                    return BattleState.Team1Win(team1, team2)
                }

                team1.emptyTeam && !team2.emptyTeam -> {
                    println(BattleState.Team2Win(team1, team2).stateInfo)
                    return BattleState.Team2Win(team1, team2)
                }
            }
        }
        println(BattleState.Progress(team1, team2).progressInfo)
        return BattleState.Progress(team1, team2)
    }

    fun battleIterator() {
        if (!isGameOver) {
            team1.team.forEach { it.toAttack(team2.team.random()) }
            team2.team.forEach { it.toAttack(team1.team.random()) }
            team1.removeDead()
            team2.removeDead()
        } else getBattleStatus()
    }
}