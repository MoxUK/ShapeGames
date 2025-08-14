fun main()  {
    println("Practice for Unit 4 to 7")
    println("\nSection 1 Task 1")
    section1task1()
    println("\nSection 1 Task 2")
    section1task2()
    println("\nSection 2 Task 1")
    section2task1()
    println("\nSection 2 Task 2")
    section2task2()
    println("\nSection 3 Task 1")
    section3task1()
    println("\nSection 3 Task 2")
    section3task2()
    println("\nSection 4 Task 1")
    section4task1()
    println("\nSection 4 Task 2")
    section4task2()
    println("\nSection 5 Task 1")
    section5task1()
    println("\nSection 5 Task 2")
    section5task2()
    //println("\nTest Code and Scratch pad")
    //testCode()
}

fun section1task1() {
    /*
    Write a program that checks if a number is positive, negative, or zero.
    Print a message for each case.
    val number = -3
     */
    val number: Int = -3
    if (number > 0){
        println("The number $number is positive")
    } else if (number < 0){
        println("The number $number is negative")
    }
    else {
        println("The number is zero")
    }
}

fun section1task2() {
    /*
   Check if a number is even or odd. Print the result
    val number = 7
     */
    val number: Int = 7
    if (number%2 == 0){
        println("The number $number is even")
    }
    else {
        println("The number $number is odd")
    }
}

fun section2task1() {
    /*
    Write a program that takes a variable grade (Int) from 1 to 5 and prints:
    "Excellent" for 5
    "Good" for 4
    "Okay" for 3
    "Bad" for 2
    "Terrible" for 1
    val grade = 4
     */
    val grade: Int = 4
    when(grade) {
        1 -> {
            println("The grade is $grade - Terrible")
        }
        2 -> {
            println("The grade is $grade - Bad")
        }
        3 -> {
            println("The grade is $grade - Okay")
        }
        4 -> {
            println("The grade is $grade - Good")
        }
        5 -> {
            println("The grade is $grade - Excellent")
        }
        else -> {
            println("The grade is out of range")
        }
    }
}

fun section2task2() {
    /*
    Task 2:
    Take a variable month (Int) from 1 to 12 and print the season ("Winter", "Spring", "Summer", "Autumn").
    Use when and ranges.
    val month = 7
     */
    val month: Int = 7
    val seasons = listOf("Winter", "Spring", "Summer", "Autumn")
    when(month) {
        in 1 .. 3 -> println("The month ($month) is in the ${seasons[0]}")
        in 4 .. 6 -> println("The month ($month) is in the ${seasons[1]}")
        in 7 .. 9 -> println("The month ($month) is in the ${seasons[2]}")
        in 10 .. 12 -> println("The month ($month) is in the ${seasons[3]}")
        !in 1 .. 12 -> println("This is not a valid month")
    }
}

fun section3task1() {
    /*
    Print all numbers from 1 to 10 using a for loop.
     */
    for (i in 1..10) {
        println("$i \t")
    }
}

fun section3task2() {
    /*
    Print the multiplication table for 5 (from 1 to 10), like:
    5 x 1 = 5
    5 x 2 = 10
    ...
    5 x 10 = 50
     */
    val number: Int = 5

    for (i in 1 .. 10)   {
        print("$number x $i = ${number * i}\n")
    }
}

fun section4task1() {
    /*
Print all even numbers from 2 to 20 using a range and a loop.
 */
    for (i in 2..20) {
        if (i % 2 == 0) {
            print("$i\n")
        }
    }
    // Alternative solution:
    println("\nAlternate Solution")
    for (i in 2..20 step 2) {
        print("$i\n")
    }
}

fun section4task2() {
    /*
    Print numbers from 10 down to 1 using a reversed range.
     */
    for (i in 10 downTo 1) {
        println("$i \t")
    }
}

fun section5task1() {
    /*
    Create an array of names ("Tom", "Sam", "Bob").
    Print each name on a new line using a loop.
     */
    val names = arrayOf("Tom", "Sam", "Bob")
    for(name in names) {
        print("$name \n")
    }
}

fun section5task2() {
    /*
    Create an array of 5 numbers.
    Print the sum of all numbers in the array.
     */
    val numbers: Array<Int> = arrayOf(1, 3, 7, 11, 13)

    //Solution 1
    var sumOfNumbers: Int = 0
    for(i in numbers) {
        sumOfNumbers = sumOfNumbers+i
    }
    println("1. The sum of the numbers in the array is $sumOfNumbers")

    //Solution 2
    println("2. The sum of the numbers in the array is ${numbers.sum()}")
}

//end of practice
fun testCode()  {
}