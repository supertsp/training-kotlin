package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
//    println(
//        "                                                                                SECRET: $secret \n" +
//        "                                                                                 GUESS: $guess"
//    )
    val CHECKED = '#'
    var rightPosition = 0
    var wrongPosition = 0
    var secretList = secret.toMutableList()
    var guessList = guess.toMutableList()

    //finding equals
    for ((index, element) in secretList.withIndex()) {
        if (element == guessList[index]) {
            rightPosition++
            secretList[index] = CHECKED
            guessList[index] = CHECKED
        }
    }

    //finding different order
    for ((indexSelected, elementSelected) in secretList.withIndex()) {
        if (elementSelected == CHECKED) continue

        for ((indexCurrent, elementCurrent) in guessList.withIndex()) {
            if (elementCurrent == CHECKED) continue

            if (elementSelected == elementCurrent) {
                wrongPosition++
                secretList[indexSelected] = CHECKED
                guessList[indexCurrent] = CHECKED
                break
            }
        }
    }

    return Evaluation(rightPosition, wrongPosition)
}

/**

Letters: A, B, C, D, E, F

SECRET     GUESS       RIGHT   WRONG
ABCD       ABCD        4       0
ABCD       CDBA        0       4
ABCD       ABDC        2       2
AABC       ADFE        1       0
AABC       ADFA        1       1
AABC       DFAA        0       2
AABC       DEFA        0       1

 */