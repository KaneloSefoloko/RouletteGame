package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {

    public List<String> readFromFile () throws IOException {
        //Load a file from a classPath
        FileReader readFile = new FileReader("PLAYER_NAMES.txt");
        BufferedReader bufferedReader = new BufferedReader(readFile);
        List<String> nameList = new ArrayList<>();

        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.length() != 0) {
                nameList.add(line);
            }
        }
        bufferedReader.close();

        return nameList;
    }
}
