//Kotlin Program: Lambda expression to check if a number is even

fun main()  {
    val isThisEven = { x: Int ->
        Boolean
        if (x % 2 == 0) {
            println("$x is even")
        } else println("$x is odd")
    }

    isThisEven(1)
    isThisEven(10)
}