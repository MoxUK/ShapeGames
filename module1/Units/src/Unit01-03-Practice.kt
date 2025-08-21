class `Unit02-practice` {
}
fun main()  {
    var assignmentNum: Int = 1

    // Assignment 1
    println("Assignment $assignmentNum")
    assignmentNum++
    val daysInWeek = 7
    println(daysInWeek)


    // Assignment 2
    println("Assignment $assignmentNum")
    assignmentNum++
    var userScore = 0
    userScore = userScore+10

    println(userScore)

    // Assignment 3
    println("Assignment $assignmentNum")
    assignmentNum++
    print("Enter width: ")
    val widthFloat = readLine()?.toFloat() ?: 0F

    print("Enter height: ")
    val heightFloat = readLine()?.toFloat() ?: 0F

    val area = widthFloat * heightFloat
    println("Area of square is $area")

    // Assignment 4
    println("Assignment $assignmentNum")
    assignmentNum++
    val pi : Double = 3.14159
    val piFloat : Float = 3.14159F
    println(pi)

    // Assignment 5
    // Variable 'name' of string type for storing user's name
    println("Assignment $assignmentNum")
    assignmentNum++
    var name: String
    name = "username"
    println(name)

    //Assignment 6
    println("Assignment $assignmentNum")
    assignmentNum++
    //Fie's solution
    var numberA = 25;
    var isEven : Boolean = numberA % 2 == 0;
    println("Is the number even? $isEven")

    //val isEven: Int = 25%1
    //println(isEven)

    //Assignment 7
    println("Assignment $assignmentNum")
    assignmentNum++
    val firstName: String = "Ed"
    val lastName: String = "Sheeran"
    val fullName: String = "$firstName $lastName"
    println(fullName)

    //Assignment 8
    println("Assignment $assignmentNum")
    assignmentNum++
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
    println("Assignment $assignmentNum")
    assignmentNum++
    val myAgeLow = 17
    val myAgeHigh = 71
    val requiredAge = 18
    print("Is 17 old enough to enter? ")
    println(myAgeLow >= requiredAge)
    print("Is 71 old enough to enter? ")
    println(myAgeHigh >= requiredAge)

    //Assignment 10
    println("Assignment $assignmentNum")
    assignmentNum++
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
    println("Assignment $assignmentNum")
    assignmentNum++
    val isUserOneActive: Boolean = true
    val isUserTwoActive: Boolean = false
    println("Is User 1 Active? $isUserOneActive")
    println("Is User 2 Active? $isUserTwoActive")

    //Assignment 12
    println("Assignment $assignmentNum")
    assignmentNum++
    val temperature = 10
    val hotOrCold =
        if
                (temperature > 20) "It is warm"
        else
            "It is cold"
    println(hotOrCold)
    //Alt solution
    println("The water temperature ${if (temperature > 20) "is warm" else "is cold"}")

    //Assignment 13
    println("Assignment $assignmentNum")
    assignmentNum++
    val applesInBasket = 10
    val numberOfBaskets = 2
    val additionalApples = 5
    println("Total number of apples is " + (numberOfBaskets * applesInBasket + additionalApples))

    //Assignment 14
    println("Assignment $assignmentNum")
    assignmentNum++
    val key: Boolean = true
    val password: Boolean = true
    val willDoorOpen = if(key == true && password == true) "The door will open" else "The door won't open"
    println(willDoorOpen)

    //Assignment 15
    println("Assignment $assignmentNum")
    assignmentNum++
    var messageCount = 1
    messageCount++
    println(messageCount)

}
