val scan = java.util.Scanner(System.`in`)

fun main() {
    println("Введите номер месяца:")
    var numberOfMonth = scan.nextInt()
    print(printSeason(numberOfMonth))
}

internal fun printSeason(numberOfMonth: Int): String {
    return when (numberOfMonth) {
        1, 2, 12 -> "Зима"
        3, 4, 5 -> "Весна"
        6, 7, 8 -> "Лето"
        9, 10, 11 -> "Осень"
        else -> "Данные введены неверно"
    }
}