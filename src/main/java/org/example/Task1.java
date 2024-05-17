package org.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> currentWords = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("next")) {
                lines.add(String.join(" ", currentWords));
                currentWords.clear();
            } else if (input.equals("end")) {
                lines.add(String.join(" ", currentWords));
                break;
            } else {
                currentWords.add(input);
            }
        }

        BufferedWriter csvWriter = new BufferedWriter(new FileWriter("output.csv"));
        for (String line : lines) {
            csvWriter.write(line);
            csvWriter.write(",\n");
        }
    }
}