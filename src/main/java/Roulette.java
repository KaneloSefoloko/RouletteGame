package main.java;

import java.io.IOException;
import java.util.List;

public class Roulette {

    public static void main (String[] args) throws IOException {

        ReadFromFile getFile = new ReadFromFile();
        List<String> nameList = getFile.readFromFile();

        //Print out names from nameList
        nameList.forEach(System.out::println);
    }
}
