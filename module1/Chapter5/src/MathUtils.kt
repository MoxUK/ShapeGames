/** 2. Math Utilities
* Create a class called MathUtils.
* Add a function that takes a list of integers and returns the sum of all even numbers in the list.
*/

fun main()  {
    val mathUtils: MathUtils = MathUtils()
    val numbers = listOf(1,2,3,4,5,6)
    val sum = mathUtils.sumOfEvens(numbers)

    println(sum)
}

class MathUtils {
    fun sumOfEvens(numbers: List<Int>): Int    {
        val filtered = numbers.filter {it % 2 == 0}
        println(filtered)
        return numbers.filter  {it % 2 == 0}.sum()
    }
}