package `11_generics_and_utility_classes`.warrior

interface Warrior {
    var isKilled: Boolean
    val chanceAvoidHit: Int
    fun toAttack(warrior: Warrior)
    fun takeDamage(damage: Double)
}