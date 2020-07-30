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


        ReadFromFile getFile = new ReadFromFile();
        List<String> nameList = getFile.readFromFile();

        //Print out names from nameList
        nameList.forEach(System.out::println);

        for (String name : nameList) {
            betChoice = input.nextInt();
            amountToBet = input.nextDouble();

            System.out.println(name + betChoice + amountToBet);
        }


    }
}
