package com.select;

/**
 * Created by gnsad on 6/29/2018.
 */

import jdk.internal.util.xml.impl.Input;

import java.util.*;

public class Hangman {
    String word[] = {"japan", "qatar", "syria", "mongolia", "india", "bahrain"};

    void showMenu() {
        int option;
        Scanner sc = new Scanner(System.in);

        System.out.println("------Menu------");
        System.out.println("1. PLay");
        System.out.println("2. Instructions");
        System.out.println("3. Exit");
        System.out.println("\n Choose the option: ");
        option = sc.nextInt();

        switch (option) {
            case 1:
                playGame();
                break;
            case 2:
                instructGame();
                break;
            case 3:
                exitGame();
                break;
            default:
                System.out.println("Incorrect menu option");
                showMenu();
                break;
        }

    }

    void playGame() {
        int len, i, j, count = 0, rnd = 0, flag = 0;
        String choice, temp;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        len = word[rnd].length();
        char[] newString = new char[len];


        StringBuffer wrgString = new StringBuffer();

        for (j = 0; j < len; j++) {
            System.out.println("_ ");
        }
        System.out.println();


        do {
            flag = 0;
            System.out.print("\n\nEnter your guess");
            String ch = sc.nextLine().toLowerCase();

            count++;


            for (i = 0; i < len; i++) {
                if (word[rnd].charAt(i) == ch.charAt(0)) {
                    newString[i] = word[rnd].charAt(i);
                    flag = 1;
                }
            }

            if (flag == 0)

            {
                flag = 1;
                wrgString.append(ch + ",");
                System.out.println("\nMisses: " + wrgString);
            }
            System.out.println(newString);
            temp = new String(newString);


            if (word[rnd].equals(temp)) {
                System.out.println("-----------Congatrs you won the game-----------");
                System.out.println("Do you want to play again (Y/N)");
                choice = sc.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    playGame();
                } else {
                    showMenu();
                }
            }
        }
        while (flag != 0);
    }

    public void instructGame() {
        System.out.println("instructGame method is invoked");
    }

    public void exitGame() {
        System.out.println("exitGame method is invoked");
        System.exit(0);
    }


    public static void main(String[] args) {
        Hangman hg = new Hangman();
        hg.showMenu();
    }


}





