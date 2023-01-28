package `11_generics_and_utility_classes`.warrior

import `11_generics_and_utility_classes`.weapon.AbstractWeapon
import `11_generics_and_utility_classes`.weapon.Weapons

class General : AbstractWarrior() {
    override val chanceAvoidHit: Int = 40
    override var isKilled: Boolean = false
    override val accuracy: Int = 50
    override val weapon: AbstractWeapon = Weapons.createRevolver()
    override val maxHP: Double = 300.0
    override var currentHP = maxHP
    override val rank = "General"
}