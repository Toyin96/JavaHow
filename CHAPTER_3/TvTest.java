// This is a driver class named TvTest for class Tv
// This program was written by Toyin Onagoruwa (Lord Toyin Tenjin) on 14/11/2020
import java.sql.SQLOutput;
import java.util.Scanner;
public class TvTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            Tv newTv = new Tv();

        System.out.print("Enter the name you want to call your Tv: ");
            String name = input.next();
                newTv.setTvName(name);

        System.out.printf("Congratulations! %s Tv has been created! %n", newTv.getTvName());
            if (newTv.isOn() == false) {
                System.out.print("Tv is turned off by default. ");
            } else {
                System.out.print("Tv is turned on");
            }

        System.out.print("To turn on your TV, press 1: ");
            int prompt = input.nextInt();
            if (prompt == 1) {
                System.out.printf("Your Tv has been turned on and the default volume is: %d%n", newTv.getTvVolume());
                System.out.println("You can set your tv volume between 1 - 10, enter your desired number: ");
            int volFig = input.nextInt();
            if (volFig >= 1 || volFig <= 10) {
                newTv.setVolume(volFig);
                System.out.printf("Your new volume is: %d%n", newTv.getTvVolume());
            }
        } else {
            System.out.print("You entered an invalid number hence Tv remains off!");
        }


        System.out.println("Press 1 to increase or press 2 to decrease your Tv set volume: ");
            prompt = input.nextInt();
            if (prompt == 1) {
                newTv.increaseVolume(newTv.getTvVolume());
            } else if (prompt == 2) {
                newTv.reduceVolume(newTv.getTvVolume());
            } else {
                System.out.println("You entered an invalid number! volume can only be increased by addition of 1");
            }

        System.out.println("To navigate to the channel menu, press 1: ");
            int channelInput = input.nextInt();
                if (channelInput == 1){
                    System.out.println("Welcome to the channels section! Enter any channel name of your choice to proceed: ");
                    String userInput = input.next();
                    newTv.setChannel(userInput);
                    System.out.printf("Welcome to %s! Warning! viewer's discretion is advised! %n", newTv.getChannel());

                        System.out.println("To view the channel list, enter 3 ");
                            int response = input.nextInt();
                            if (response == 3){
                        System.out.printf("Welcome to the channel menu! Here are the available channels below: %n%s%n", newTv.getChannelMenu());
                            }else{
                        System.out.println("oh gosh! You entered the wrong input. Program terminates....");
                        }
                }else{
                    System.out.println("You entered an invalid input!");
                }

//                  System.out.println("To turn off your Tv set, enter : ");
//                  String end = input.nextLine();
//                  newTv.isOn();





    } // End of main method
}// End of class TvTest
