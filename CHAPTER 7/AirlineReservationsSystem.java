package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineReservationsSystem {

    public static void main(String[] args) {

        boolean[] planeSeat = {false, false, false, false, false, false, false, false, false, false};

        Scanner userInput = new Scanner(System.in);
        int counter = 0;
        int count = 0;
        int count1 = 5;
        while (counter < 10) {
            System.out.print("Please type 1 to book a seat in First Class or type 2 to book a seat in Economy class: ");
            int reply = userInput.nextByte();
            if (reply == 1) {
                planeSeat[count] = true;
                System.out.println("=======================================================================================\nThanks for booking...Your boarding pass is:\nSeat number: " + count + "\nClass: First class section \uD83D\uDE0A " + "\n========================================================================================");
                count++;
                counter++;

                if (count == 5) {
                    System.out.println("Sorry...the first class section is already filled up.\nWould you like to book a seat in the economy class section? \nType 1 for YES\nType 2 for No");
                    reply = userInput.nextByte();

                    if (reply == 2){
                        System.out.println("Next flight leaves in 3 hours");
                        break;
                    }

                    if (reply == 1) {
                        if (planeSeat[9]) {
                            System.out.println("Sorry that class has been fully booked as well");
                            System.out.println(Arrays.toString(planeSeat));
                            break;
                        }
                    }
                }
            }else{
                if (reply == 2) {
                    planeSeat[count1] = true;
                    System.out.println("=======================================================================================\nThanks for booking...Your boarding pass is:\nSeat number: " + count1 + "\nClass: Economy class section \uD83D\uDE0A " + "\n========================================================================================");
                    count1++;
                    counter++;

                    if (count1 == 10) {
                        System.out.println("Sorry...the second class section is already filled up.\nWould you like to book a seat in the first class section? \nType 1 for YES\nType 2 for No");
                        reply = userInput.nextByte();

                        if (reply == 2){
                            System.out.println("Next flight leaves in 3 hours");
                            break;
                        }

                        if (reply == 1){
                            if (planeSeat[4]){
                                System.out.println("Sorry that class has been fully booked as well");
                                System.out.println(Arrays.toString(planeSeat));
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}