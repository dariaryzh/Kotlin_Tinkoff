val scan = java.util.Scanner(System.`in`)

fun main(args:Array<String>) {
    print("Введите трёхзначное число: ")
    var num = scan.nextInt()
    print(reverseNumber(num))
    //println(answer)
}
/*
internal fun reverseNumber(num: Int) : Int{
    var hundreds = num % 10 * 100
    var tens = num / 10 % 10 *10
    var units = num / 100
    return hundreds + tens + units
}
*/
internal fun reverseNumber(num: Int) : String{
    var reversed : Int
    if (num > 100 && num < 999){
        var hundreds = num % 10 * 100
        var tens = num / 10 % 10 *10
        var units = num / 100
        reversed = hundreds + tens + units
        return "Перевёрнутое число: $reversed"
    } else {
        return "Данные введены неверно"
    }
}