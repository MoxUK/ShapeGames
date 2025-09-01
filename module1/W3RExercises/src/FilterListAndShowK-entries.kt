// Write a Kotlin program that implements a lambda expression to filter a list of strings.
// It returns only strings starting with the letter 'K'.

fun main()  {
    val listOfWords= listOf("Aardwark", "Icecream", "Box", "Laptop", "Cup", "Kotlin", "Koolaid",
        "Charger", "keychain", "Desk fan", "Monitor", "knife", "Mouse pad")


    val filteredList = listOfWords.filter { it.startsWith("k") || it.startsWith("K") }
    println(filteredList)


}