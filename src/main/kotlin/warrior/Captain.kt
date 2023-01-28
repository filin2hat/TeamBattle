package `11_generics_and_utility_classes`.warrior

import `11_generics_and_utility_classes`.weapon.AbstractWeapon
import `11_generics_and_utility_classes`.weapon.Weapons

class Captain : AbstractWarrior() {
    override val chanceAvoidHit: Int = 30
    override var isKilled: Boolean = false
    override val accuracy: Int = 40
    override val weapon: AbstractWeapon = Weapons.createPistol()
    override val maxHP: Double = 200.0
    override var currentHP = maxHP
    override val rank = "Capitan"
}