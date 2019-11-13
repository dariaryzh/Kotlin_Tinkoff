fun main() {
    print("Введите число: ")
    val num: String? = readLine()
    print(checkInput(num))
}

internal fun checkInput(num: String?): String {
    return when (num?.toIntOrNull()) {
        null -> "$num не является числом"
        else -> "Вы ввели число: $num"
    }
}