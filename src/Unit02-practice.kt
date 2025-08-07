import java.security.KeyStore

class `Unit02-practice` {
}
fun main()  {
    // Assignment 1
    println("Assignment 1")
    println(daysInWeek)
    val daysInWeek = 7

    // Assignment 2
    println("Assignment 2")
    var userScore = 0
    userScore = userScore+10
    println(userScore)

    // Assignment 3
    println("Assignment 3")
    print("Enter width: ")
    val widthFloat = readLine()?.toFloat() ?: 0F

    print("Enter height: ")
    val heightFloat = readLine()?.toFloat() ?: 0F

    val area = widthFloat * heightFloat
    println("Area of square is $area")

    // Assignment 4
    println("Assignment 4")
    val pi : Double = 3.14159
    println(pi)

    // Assignment 5
    // Variable 'name' of string type for storing user's name
    println("Assignment 5")
    var name: String
    name = "username"
    println(name)

    //Assignment 6
    println("Assignment 6")
    val isEven: Int = 26%1
    println(isEven)

    //Assignment 7
    println("Assignment 7")
    val firstName: String = "Ed"
    val lastName: String = "Sheeran"
    val fullName: String = "$firstName $lastName"
    println(fullName)

    //Assignment 8
    println("Assignment 8")
    // Original code with error
    /*
    val balance = 100
    balance = 120 // Error here
    println(balance)
    */
    //Balance is set as a constant and therefore cannot be changed.
    //Change val to var and we're golden
    var balance = 100
    balance = 120
    println("Balance is $balance")


    //Assignment 9
    println("Assignment 9")
    val myAgeLow = 17
    val myAgeHigh = 71
    val requiredAge = 18
    print("Is 17 old enough to enter? ")
    println(myAgeLow >= requiredAge)
    print("Is 71 old enough to enter? ")
    println(myAgeHigh >= requiredAge)

    //Assignment 10
    println("Assignment 10")
    /*
    Display the initial price of an item at a percentage discount
    price is the non-discounted price
    discount is the discount in percentage, i.e. 10 = 10%
    calculate the final price by multiplying the original price with (1 - discount percentage) using the formula
    final price = original price * (1 - (discount / 100 ))
    */
    val price = 21.50F
    val discount = 10F // value in percentage
    val finalPrice = price * ( 1 - (discount / 100))
    println("The discounted price is $finalPrice")

    //Assignment 11
    println("Assignment 11")
    val isUserOneActive: Boolean = true
    val isUserTwoActive: Boolean = false
    println("Is User 1 Active? $isUserOneActive")
    println("Is User 2 Active? $isUserTwoActive")

    //Assignment 12
    println("Assignment 12")
    val temperature = 10
    val hotOrCold = if(temperature > 20) "It is warm" else "It is cold"
    println(hotOrCold)

    //Assignment 13
    println("Assignment 13")
    val applesInBasket = 10
    val additionalApples = 5
    println("Total number of apples is " + (applesInBasket + additionalApples))

    //Assignment 14
    println("Assignment 14")
    val key: Boolean = true
    val password: Boolean = true
    val willDoorOpen = if(key == true and password == true) "The door will open" else "The door won't open"
    println(willDoorOpen)

    //Assignment 15
    println("Assignment 15")
    var messageCount = 1
    messageCount++
    println(messageCount)

}