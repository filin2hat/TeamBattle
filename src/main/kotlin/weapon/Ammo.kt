package `11_generics_and_utility_classes`.weapon

import `11_generics_and_utility_classes`.giveMeChance
import kotlin.math.floor
import kotlin.random.Random

enum class Ammo(
    private val damageAmmo: Double,
    private val criticalDamageRatio: Double,
    private val criticalDamageChancePercent: Int
) {
    JACKETED_BULLET(3.1, 1.2, 13),
    EXPANSION_BULLET(4.3, 1.4, 20),
    ARMOR_PIERCING_BULLET(10.7, 2.1, 10),
    EXPLOSIVE_BULLET(25.8, 3.5, 5);

    //расчет общего урона
    fun getDamage(): Double {
        return if (criticalDamageChancePercent.giveMeChance()) getDamageAmmo() * criticalDamageRatio
        else getDamageAmmo()
    }

    //расчет урона пули
    private fun getDamageAmmo(): Double {
        val maxDamageAmmo = damageAmmo + 1.5
        return floor(Random.nextDouble(damageAmmo, maxDamageAmmo) * 100.0) / 100.0
    }
}
