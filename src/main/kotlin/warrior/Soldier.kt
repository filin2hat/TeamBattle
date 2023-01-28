package `11_generics_and_utility_classes`.warrior

import `11_generics_and_utility_classes`.weapon.AbstractWeapon
import `11_generics_and_utility_classes`.weapon.Weapons

class Soldier : AbstractWarrior() {
    override val chanceAvoidHit: Int = 20
    override var isKilled: Boolean = false
    override val accuracy: Int = 30
    override val weapon: AbstractWeapon = Weapons.createRifle()
    override val maxHP: Double = 100.0
    override var currentHP = maxHP
    override val rank = "Soldier"
}