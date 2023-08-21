def factorial(n) {
    if (n == 0 || n == 1) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}

def number = 5
println "Factorial of $number is ${factorial(number)}"
