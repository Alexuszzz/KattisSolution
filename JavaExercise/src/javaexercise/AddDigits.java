package javaexercise;

import java.util.Scanner;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit. leetcode 258
 */

public class AddDigits {

    public int addDigits(int num){
        if (num < 10)
            return num;
        else if (num % 9 == 0)
            return 9;
        else
            return num % 9;

    }
}
