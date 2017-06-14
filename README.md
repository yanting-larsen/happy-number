# happy-number

A happy number is a positive integer for which the sum of the squares of the digits eventually leads to 1.
Example of a happy number: 31 => 3^2 + 1^2 => 10 => 1^2 + 0^2 = 1
Example of an unhappy number: 4 => 16 => 37 => 58 => 89 => 145 => 42 => 20 >= 4

## Task:

    # Write a program in Java that prints the first happy numbers in natural order found within the range 1 - 1000 to the console.
    # Use automated test coverage
    # Build instructions: Gradle.

 ## Solution:

    1) Split the number to digits
    2) Square each digits
    3) Summarize the squares of its digits
    4) If the result is 1, then the number is happy; if the result is 4, then the number is unhappy; if the result is neither 1 nor 4, repeat the previous steps 1-3 until reach the result.
    5) Loop through all the happy number within 1-1000 and print them out to console.

## How to run:

    # gradle run
![screenshot from 2017-06-14 09 37 17](https://user-images.githubusercontent.com/17611844/27121182-807b40e4-50e6-11e7-9ee5-173f0a22f0e6.png)
![screenshot from 2017-06-14 09 40 02](https://user-images.githubusercontent.com/17611844/27121206-990f7d6e-50e6-11e7-8367-045270590f27.png)

    # gradle test
![screenshot from 2017-06-14 09 38 44](https://user-images.githubusercontent.com/17611844/27121219-a7bc040e-50e6-11e7-9ab9-85e819aee8e2.png)

## Reference:
    
    # Happy Number: 
[https://en.wikipedia.org/wiki/Happy_number](url)

    # Gradle Build Tool User Guide: 
[https://docs.gradle.org/current/userguide/userguide.html](url)

    # Logging while testing through Gradle: 
[https://stackoverflow.com/questions/9356543/logging-while-testing-through-gradle](url)
    

