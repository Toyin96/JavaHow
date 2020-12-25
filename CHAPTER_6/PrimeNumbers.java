package Chapter6;

import java.util.Scanner;

    public class PrimeNumbers {

        public boolean primeNumChecker(int num) {

            for (int counter = 1; counter < num; counter++) {

                if (counter == 1) {
                    continue;
                }

                if (num % counter == 0) {
                    return false;
                }
            }
            return true;
        }
    }