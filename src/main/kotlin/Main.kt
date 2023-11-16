

fun main() {
    val options = arrayOf("Rock","Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}
fun getGameChoice(optionsParam: Array<String>): String {
    return optionsParam[(Math.random() * optionsParam.size).toInt()]
}

fun getUserChoice(optionsParam: Array<String>):String{
    var isValidChoice = false
    var userChoice = ""
    //loop until the user enters a valid choice
    while (!isValidChoice){
        //Ask the user for their choice
        print("Please enter on of the following:")
        for (item in optionsParam) print(" $item ")
        print(".")
        //read user input
        val userInput = readLine()
        //validate user input
        if (userInput !=null && userInput in optionsParam){
            isValidChoice = true
            userChoice = userInput
        }
        //if choice is invalid inform the user
        if (!isValidChoice) println("You must enter a valid choice")
    }
    return userChoice
}

fun printResult(userChoice:String, gameChoice: String){
    //The result
    //The variable declaration has been lifted
    val result: String = if (userChoice == gameChoice) "Tie!"
    else if((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper"))
        "You win!"
    else "You Lose!"

    //print result
    println("You choose $userChoice . I choose $gameChoice . $result ")
}
//The above code is case-sensitive how can it be optimized

//userInput = userInput.capitalize()