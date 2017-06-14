# happy-number

# A happy number is a positive integer for which the sum of the squares of the digits eventually leads to 1.

# Example of a happy number: 31 => 3^2 + 1^2 => 10 => 1^2 + 0^2 = 1
# Example of an unhappy number: 4 => 16 => 37 => 58 => 89 =>145 => 42 => 20 >= 4

# Task:
    # Write a program in Java that prints the first happy numbers in natural order found within the range 1 - 1000 to the console.
    # Use automated test coverage
    # Build instructions: Gradle.

 # Solution:
    # Split the number to digits
    # Square each digits
    # Summarize the squares of its digits
    # If the result is 1, then the number is happy; if the result is 4, then the number is unhappy; if the result is neither 1 nor 4, repeat the previous steps 1-3 untill get the result either 1 or 4.
    # Loop through all the happy number within 1-1000 and print them out to console.

# How to run:
    # gradle run
    # gradle test
