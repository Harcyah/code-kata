package com.harcyah.kata.codingbat.logic1.fizzString2;

public class FizzString2 {

    public String fizzString2(int n) {
        if (n % 3 == 0)
            if (n % 5 == 0)
                return "FizzBuzz!";
            else
                return "Fizz!";
        else if (n % 5 == 0)
            return "Buzz!";
        else
            return n + "!";
    }

}
