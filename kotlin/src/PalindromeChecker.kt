fun palindromeChecker() {
    val word = readlnOrNull()
    val wordBackwards = word?.reversed()
    if (word == wordBackwards) {
        println(true)
    }
    else {
        println(false)
    }
}