fun longestWordInSentence() {
    val sentence = readlnOrNull()
    val words = sentence?.split(" ")
    var longest = 0

    if (words != null) {
        for(word in words) {
            if(word.length > longest) {
                longest = word.length
            }
        }
    }
    println(longest)
}