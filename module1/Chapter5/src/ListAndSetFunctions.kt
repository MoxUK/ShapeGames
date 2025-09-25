fun main()  {
    val numbers = listOf(1, 2, 3, 4)
    val people = listOf("Tom", "Sam", "Bob", "Alex", "Bob")
    println(numbers)
    println(people)

    for (person in people)  {
        println("Hello $person")
    }

    val first = people.get(0)
    val second = people[1]  // Use index position direct instead of 'get'
    val outOfRange = people.getOrNull(5) // fails gracefully if index > length
    val outOfRange2 = people.getOrElse(7)   {println ("Out of Range")} //assigns else value/action if index > length

    val subPeople = people.subList(1, 2) // Use subList to get a range from the list
    println(subPeople)

    val numbers2 = mutableListOf(5, 6, 7)
    println(numbers2)
    numbers2.add(4)
    println(numbers2)
    numbers2.add(0,100)
    println(numbers2)
    numbers2.remove(6) //remove element matching value (NOT index)
    println(numbers2)
    numbers2.remove(42)
    println(numbers2)

    val a: Iterable<Int>
    val b: MutableIterable<Int>

    val numbersSet = setOf(5,6,7) //list must contant unique val; setOF(5,6,7,6) would still yield (5,6,7)
    val peopleSet = setOf("Tom","Sam","Bob","Alex","Bob")
    println(numbersSet)
    // println(peopleSet)
    // for (p in peopleSet) println(p)
    // peopleSet.forEach { person -> println(person) }

    val uniquePeople = people.toSet()
    println(uniquePeople)

    println("---------------------------")

    val people2 = setOf("Tom", "Sam", "Alex", "Bob", "Alice")
    val employee = listOf("Tom", "Sam", "Kate", "Mike")


    val all = people2.union(employee) //same as: people2 union employee
    println(all)
    val common = people2.intersect(employee) //same as: people2 intersect employee
    println(common)
    val different = employee.subtract(people2) //same as: employee subtract people2
    println(different)

    val numbersSet1: HashSet<Int> = hashSetOf(5, 6, 7)
    val numbersSet2: LinkedHashSet<Int> = linkedSetOf(1, 2, 3)
    val numbersSet3: MutableSet<Int> = mutableSetOf(1,2,3)



}