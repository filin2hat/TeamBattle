package `11_generics_and_utility_classes`

class Stack<T> {
    private val listItems: MutableList<T> = mutableListOf()

    fun push(item: T) {
        listItems.add(item)
    }

    fun pop(): T? {
        if (!isEmpty()) {
            val elem = listItems.getOrNull(listItems.lastIndex)
            listItems.removeAt(listItems.lastIndex)
            return elem
        }
        return null
    }


    fun isEmpty(): Boolean {
        return listItems.size == 0
    }

    fun count(): Int = listItems.count()

}