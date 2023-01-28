package `11_generics_and_utility_classes`.weapon

import `11_generics_and_utility_classes`.Stack

abstract class AbstractWeapon {
    abstract val maxAmmoInClip: Int
    abstract val fireType: FireType
    abstract var ammoClip: Stack<Ammo>
    abstract var clipIsEmpty: Boolean

    abstract fun createRequiredType(): Ammo
    abstract fun reloadWeapon(): Stack<Ammo>
    abstract fun getAmmoToShot(): Ammo?
}