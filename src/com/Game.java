package com;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {

    static String[] array = {"Apple", "Galaxy", "Whisper", "Journey", "Velocity", "Horizon", "Echo", "Marvel", "Quantum", "Nebula", "Cascade"};
    public static void main(String[] args) throws InterruptedException {
        System.out.println(1);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(2);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(3);
        TimeUnit.SECONDS.sleep(1);
        Random random = new Random();
        for( String word: array){
            System.out.print( array[random.nextInt(array.length)] + ' ');
        }
        System.out.println();

        double start = LocalTime.now().toNanoOfDay();

        Scanner sc = new Scanner(System.in);
        String typedWords = sc.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double elapsedTime = end - start;
        double seconds = elapsedTime / 1000000000.0;
        int numChars = typedWords.length();
        int wmp = (int) ((((double) numChars / 5) / seconds) * 60);

        System.out.println("Your wpm is " + wmp + "!");

    }
}