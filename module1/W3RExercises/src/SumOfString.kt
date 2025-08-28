import java.lang.Character.isDigit

//Write a Kotlin recursive function to calculate the sum of all digits in a string.

//Note: The solution below will read 11 as 1+1

fun main()  {

    val inputString: String = "This is my 1st string that contains numbers like 2, 7 and 9. " +
            "Those are the only 4 numbers in this string"   //1+2+7+9+4 = 23
    printString(inputString)

}

fun printString(inputString: String) {
    var sumOfDigits: Int = 0
    for (i in inputString) {
        if (isDigit(i)) {
            sumOfDigits = Character.getNumericValue(i) + sumOfDigits
        }
    }
    println("Sum of the digits in the string is $sumOfDigits")
    return
}


