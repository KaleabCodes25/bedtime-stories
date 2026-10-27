package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BedTimeStories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("which story would you like to read:Gold for -> Goldilock Hansel -> Hansel and Gretel or Mary -> Mary had a little lamb: ");
        String answer = input.next().toLowerCase().trim();
        input.nextLine();

        switch (answer){
            case "gold" -> answer = "goldilocks.txt";
            case "hansel" -> answer = "hansel_and_gretel.txt";
            case "mary" -> answer = "mary_had_a_little_lamb.txt";
            default -> System.out.println("Please type the specified options!");
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(answer));
            String line;
            int counter = 1;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(counter + ". " + line);
                counter++;
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Something went wrong, check again");
        }



    }


}
