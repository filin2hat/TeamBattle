package `11_generics_and_utility_classes`.warrior

import `11_generics_and_utility_classes`.weapon.AbstractWeapon
import `11_generics_and_utility_classes`.weapon.Weapons

class Doomguy : AbstractWarrior() {
    override val chanceAvoidHit: Int = 50
    override var isKilled: Boolean = false
    override val accuracy: Int = 60
    override val weapon: AbstractWeapon = Weapons.createRocketLauncher()
    override val maxHP: Double = 400.0
    override var currentHP = maxHP
    override val rank = "Doomguy"
}