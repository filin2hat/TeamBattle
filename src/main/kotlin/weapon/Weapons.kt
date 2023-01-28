package `11_generics_and_utility_classes`.weapon

import `11_generics_and_utility_classes`.Stack

object Weapons {
    fun createPistol(): AbstractWeapon {

        return object : AbstractWeapon() {
            override val maxAmmoInClip: Int = 13
            override var fireType: FireType = FireType.SingleShooting
            override var ammoClip: Stack<Ammo> = Stack()
            override var clipIsEmpty: Boolean = true
            override fun createRequiredType(): Ammo {
                return Ammo.JACKETED_BULLET
            }

            override fun reloadWeapon(): Stack<Ammo> {
                val clip = Stack<Ammo>()
                for (cell in 1..maxAmmoInClip) {
                    clip.push(createRequiredType())
                }
                ammoClip = clip
                clipIsEmpty = false
                return clip
            }

            override fun getAmmoToShot(): Ammo? {
                return ammoClip.pop()
            }
        }
    }

    fun createRevolver(): AbstractWeapon {
        return object : AbstractWeapon() {
            override val maxAmmoInClip: Int = 6
            override var fireType: FireType = FireType.SingleShooting
            override var ammoClip: Stack<Ammo> = Stack()
            override var clipIsEmpty: Boolean = true

            override fun createRequiredType(): Ammo {
                return Ammo.ARMOR_PIERCING_BULLET
            }

            override fun reloadWeapon(): Stack<Ammo> {
                val clip = Stack<Ammo>()
                for (cell in 1..maxAmmoInClip) {
                    clip.push(createRequiredType())
                }
                ammoClip = clip
                clipIsEmpty = false
                return clip
            }

            override fun getAmmoToShot(): Ammo? {
                return ammoClip.pop()
            }
        }
    }

    fun createRifle(): AbstractWeapon {
        return object : AbstractWeapon() {
            override val maxAmmoInClip: Int = 30
            override val fireType: FireType = FireType.BurstShooting(4)
            override var ammoClip: Stack<Ammo> = Stack()
            override var clipIsEmpty: Boolean = true

            override fun createRequiredType(): Ammo {
                return Ammo.EXPANSION_BULLET
            }

            override fun reloadWeapon(): Stack<Ammo> {
                val clip = Stack<Ammo>()
                for (cell in 1..maxAmmoInClip) {
                    clip.push(createRequiredType())
                }
                ammoClip = clip
                clipIsEmpty = false
                return clip
            }

            override fun getAmmoToShot(): Ammo? {
                return ammoClip.pop()
            }
        }
    }

    fun createRocketLauncher(): AbstractWeapon {
        return object : AbstractWeapon() {
            override val maxAmmoInClip: Int = 4
            override var fireType: FireType = FireType.SingleShooting
            override var ammoClip: Stack<Ammo> = Stack()
            override var clipIsEmpty: Boolean = true

            override fun createRequiredType(): Ammo {
                return Ammo.EXPLOSIVE_BULLET
            }

            override fun reloadWeapon(): Stack<Ammo> {
                val clip = Stack<Ammo>()
                for (cell in 1..maxAmmoInClip) {
                    clip.push(createRequiredType())
                }
                ammoClip = clip
                clipIsEmpty = false
                return clip
            }

            override fun getAmmoToShot(): Ammo? {
                return ammoClip.pop()
            }
        }
    }
}