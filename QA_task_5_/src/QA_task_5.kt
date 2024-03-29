val scan = java.util.Scanner(System.`in`)

fun main() {
    println("Введите натуральное число n <= 1000")
    var n = scan.nextInt()
    println(numberIntoWords(n))
}

fun numberIntoWords(n: Int): String{
    var s: String
    if (n < 1 || n > 1000){
        s = "Данные введены неверно"
    } else {
        if (n == 1000) {
            s = "тысяча"
        } else {
            s = ""
            when (n / 100) {
                1 -> s = "сто"
                2 -> s = "двести"
                3 -> s = "триста"
                4 -> s = "четыреста"
                5 -> s = "пятьсот"
                6 -> s = "шестьсот"
                7 -> s = "семьсот"
                8 -> s = "восемьсот"
                9 -> s = "девятьсот"
            }
            if ((n >= 100) && (n % 100 >= 10)) {
                s += " "
            }
            when ((n % 100) / 10) {
                2 -> s = s + "двадцать"
                3 -> s = s + "тридцать"
                4 -> s = s + "сорок"
                5 -> s = s + "пятьдесят"
                6 -> s = s + "шестьдесят"
                7 -> s = s + "семьдесят"
                8 -> s = s + "восемьдесят"
                9 -> s = s + "девяносто"
            }
            if ((n % 100 >= 10) && (n % 100 < 20)) {
                when (n % 100) {
                    10 -> s = s + "десять"
                    11 -> s = s + "одиннадцать"
                    12 -> s = s + "двенадцать"
                    13 -> s = s + "тринадцать"
                    14 -> s = s + "четырнадцать"
                    15 -> s = s + "пятнадцать"
                    16 -> s = s + "шестнадцать"
                    17 -> s = s + "семнадцать"
                    18 -> s = s + "восемнадцать"
                    19 -> s = s + "девятнадцать"
                }
            } else {
                if ((n % 10 != 0) && ((n % 100 >= 20) || (n >= 100))) {
                    s += " "
                }
                when (n % 10) {
                    1 -> s = s + "один"
                    2 -> s = s + "два"
                    3 -> s = s + "три"
                    4 -> s = s + "четыре"
                    5 -> s = s + "пять"
                    6 -> s = s + "шесть"
                    7 -> s = s + "семь"
                    8 -> s = s + "восемь"
                    9 -> s = s + "девять"
                }
            }
        }
    }
    return s
}
