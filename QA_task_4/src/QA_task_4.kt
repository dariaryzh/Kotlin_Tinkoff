fun main() {
    val firstArray = arrayOf(-8, 55, -1, 15, -5, 0, -5, -55, 18)
    print(replaceNegatives(firstArray).joinToString())
}

fun replaceNegatives(firstArray: Array<Int>): Array<Int> {
    val arrayAnswer = Array(firstArray.size) { 0 }
    var i = 0
    var j = firstArray.size - 1
    for (a in firstArray) {
        if (a < 0) {
            arrayAnswer[i] = a
            i++
        } else {
            arrayAnswer[j] = a
            j--
        }
    }
    return arrayAnswer
}