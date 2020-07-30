package main.java;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Roulette {

    public static void main (String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int betChoice;
        double amountToBet = 0;
        String numberType = null;

        final String BARBARA = "Barbara";


        ReadFromFile getFile = new ReadFromFile();
        List<String> nameList = getFile.readFromFile();

        //Print out names from nameList
        nameList.forEach(System.out::println);

        for (String name : nameList) {
            betChoice = input.nextInt();
            amountToBet = input.nextDouble();


            if (betChoice % 2 == 0 && name.equalsIgnoreCase(BARBARA)) {
                numberType = "Even";
                System.out.println(name + " " + numberType + " " + amountToBet);
            } else if (betChoice % 2 != 0 && name.equalsIgnoreCase(BARBARA)){
                numberType = "Odd";
                System.out.println(name + " " + numberType + " " + amountToBet);
            } else {

                System.out.println(name + " " + betChoice + " " + amountToBet);
            }
        }


    }
}
