package Chapter6;

import java.util.Scanner;

public class ReversingDigits {

    public int reverseNumGetter(int num) {

        int revNum = 0;
        while (num > 0) {
            int r = num % 10;
            revNum = revNum * 10 + r;
            num /= 10;
        }
        return revNum;
    }
}