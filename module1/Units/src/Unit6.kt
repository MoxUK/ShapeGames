//Loops
/**
 * Basic form:
 * for (variable in sequence)   {
 * // instructions to report
 * }
 */

fun main()  {
    unit6task1()
    unit6task2()

}
fun unit6task1()    {
    println("\nFor loop - i in range from 1 to 9")
    for (i in 1..9) {
        println("$i \t")
    }
    println("\nFor loop - var a + 1 run 9 times in loop")
    for (i in 1 .. 9)   {
        var a = i + 1
        println("$a \t")
    }
}

/* Matrix
        (0,0)   (1,0)   (2,0)
        ---------------------
(0,0)    1      2       3
(0,1)    4      5       6
(0,2)    7      8       9

    (0,0) = 1
    (1,0) = 2
    (2,0) = 3
    (0,1) = 4
    (1,1) = 5
    (2,1) = 6
    (0,2) = 7
    (1,2) = 8
    (2,2) = 9

 */

fun unit6task2()    {
    println("\nNested For loops")
    for (i in 1 .. 3)   {
        for (j in 1 .. 3)   {
            print("${i * j} \t")
        }
        println()
    }
}