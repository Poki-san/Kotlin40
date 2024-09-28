//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Задание 1")
    val array = arrayOf(2, 4, 7, 1, 2, 4)
    val mp = countValues(array)
    println(mp)

    println("\nЗадание 2")
    print("Введите текст: ")
    val src = readln()

    var people = mutableMapOf(1 to "Иван", 2 to "Петр",3 to "Лида", 4 to "Петр", 5 to "Анна")
    people = removesMap(people, src) as MutableMap<Int, String>
    println(people)

    println("\nЗадание 3")
    val personHashMap = hashMapOf(
        1 to Person("Олег", 23, "Програмист"),
        2 to Person("Ира", 24, "Маркетолог"),
        3 to Person("Саша", 27, "SMM-специалист"),
        4 to Person("Юра", 23, "Специалист по продажам"),
        5 to Person("Соня", 23, "HR - менеджер"),
    )
    println(personHashMap)
}
fun <K> countValues(array:Array<K>):Map<K,Int>{
    val map = HashMap<K,Int>()

    for (i in array){
        var count = 0
        for (j in array) if (i == j) count++
        map[i] = count
    }

    return map
}

fun removesMap(map:MutableMap<Int,String>, src:String): Map<Int, String> {
    return map.filterValues { it != src }
}

data class Person(val name:String, val age:Int, val position:String)