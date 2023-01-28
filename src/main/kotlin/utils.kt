package `11_generics_and_utility_classes`

import kotlin.random.Random

fun Int.giveMeChance(): Boolean {
    return this >= Random.nextInt(0, 100)
}