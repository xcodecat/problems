fun fizzbuzz() {
    /*
    This is the FizzBuzz Problem, present in many Coding Interviews.
    You need to write a program that counts from 1 to 100. But, there's a twist:
        - Numbers multiples of 3: print "Fizz".
        - Numbers multiples of 5: print "Buzz".
        - Numbers multiples of both 3 and 5: print "FizzBuzz".
     */
    for(i in 1.. 100) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}