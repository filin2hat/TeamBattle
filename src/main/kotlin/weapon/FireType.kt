package `11_generics_and_utility_classes`.weapon


sealed class FireType(shots: Int) {
    object SingleShooting : FireType(1)
    data class BurstShooting(val shots: Int) : FireType(shots)
}
