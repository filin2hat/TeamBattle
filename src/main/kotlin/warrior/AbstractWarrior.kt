package `11_generics_and_utility_classes`.warrior

import `11_generics_and_utility_classes`.giveMeChance
import `11_generics_and_utility_classes`.weapon.AbstractWeapon
import `11_generics_and_utility_classes`.weapon.FireType

abstract class AbstractWarrior : Warrior {

    abstract override val chanceAvoidHit: Int
    abstract override var isKilled: Boolean
    abstract val maxHP: Double
    abstract val accuracy: Int
    abstract val weapon: AbstractWeapon
    abstract var currentHP: Double
    abstract val rank: String


    override fun toAttack(warrior: Warrior) {
        if (weapon.clipIsEmpty || weapon.ammoClip.isEmpty()) {
            weapon.reloadWeapon()
            println("\n$rank reloaded weapon!")
            weapon.clipIsEmpty = false
            return
        }
        if (!warrior.chanceAvoidHit.giveMeChance() && this.accuracy.giveMeChance()) {
            when (weapon.fireType) {
                is FireType.BurstShooting -> {
                    for (shot in 1..(weapon.fireType as FireType.BurstShooting).shots) {
                        weapon.getAmmoToShot()?.let { warrior.takeDamage(it.getDamage()) }
                    }
                }

                FireType.SingleShooting -> weapon.getAmmoToShot()?.let { warrior.takeDamage(it.getDamage()) }
            }
            println("\n$rank attacks!")
        }
    }

    override fun takeDamage(damage: Double) {
        currentHP -= damage
        if (currentHP <= 0) isKilled = true
    }
}