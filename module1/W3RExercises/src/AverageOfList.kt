//Write a Kotlin program that implements a lambda expression to calculate the average of a list of numbers.

fun main()  {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)   // 36 / 8

    val averageOfValuesInList: (List<Int>) -> Double = { numbers ->
        val sum = numbers.sum()
        println("Sum of list = $sum")
        println("Elements in list = ${numbers.size}")
        sum.toDouble() / numbers.size //convert the sum of the list to Double and divide with count of numbers on list
    }

    val result = averageOfValuesInList(numbers)
    println("Average of numbers in list is $result")

}
