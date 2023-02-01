package com.adriaanbf04.tema07.UtillsAdri;
import java.util.Scanner;
import com.adriaanbf04.tema07.UtillsAdri.IO;
public class Menu {
    private int maxOptions;
    private String title;


    public Menu(String title, int maxOptions) {
        this.title = title;
        this.maxOptions = maxOptions;
    }

    public int executeFourOptions(String optOne, String optTwo, String optThree, String optFour) {
        boolean valid;
        int optionChoosed;
        do {
            System.out.println("************************");
            System.out.println("***" + this.title + "***");
            System.out.println("************************");
            System.out.println(optOne);
            System.out.println(optTwo);
            System.out.println(optThree);
            System.out.println(optFour);
            System.out.println("-------------------------");
            System.out.println("0. Exit");

            optionChoosed = IO.readNumber("Choose an option", 0);
            valid = optionChoosed >= 0 && optionChoosed <= maxOptions;
            if (!valid) {
                System.out.println("Number out of range. Try again");
            }
        }while(!valid);
        return optionChoosed;
    }

    public int executeForThree(String optOne, String optTwo, String optThree) {
        boolean valid;
        int optionChoosed;
        do {
            System.out.println("************************");
            System.out.println("***" + this.title + "***");
            System.out.println("************************");
            System.out.println(optOne);
            System.out.println(optTwo);
            System.out.println(optThree);
            System.out.println("-------------------------");
            System.out.println("0. Exit");

            optionChoosed = IO.readNumber("Choose an option", 0);
            valid = optionChoosed >= 0 && optionChoosed <= maxOptions;
            if (!valid) {
                System.out.println("Number out of range. Try again");
            }
        }while(!valid);
        return optionChoosed;
    }

    public int executeForTwo(int maxOptions, String optOne, String optTwo) {
        boolean valid;
        int optionChoosed;
        do {
            System.out.println("************************");
            System.out.println("***" + this.title + "***");
            System.out.println("************************");
            System.out.println(optOne);
            System.out.println(optTwo);
            System.out.println("-------------------------");
            System.out.println("0. Exit");

            optionChoosed = IO.readNumber("Choose an option", 0);
            valid = optionChoosed >= 0 && optionChoosed <= maxOptions;
            if (!valid) {
                System.out.println("Number out of range. Try again");
            }
        }while(!valid);
        return optionChoosed;
    }

    public int executeForOne(int maxOptions, String optOne) {
        boolean valid;
        int optionChoosed;
        do {
            System.out.println("************************");
            System.out.println("***" + this.title + "***");
            System.out.println("************************");
            System.out.println(optOne);
            System.out.println("-------------------------");
            System.out.println("0. Exit");

            optionChoosed = IO.readNumber("Choose an option", 0);
            valid = optionChoosed >= 0 && optionChoosed <= maxOptions;
            if (!valid) {
                System.out.println("Number out of range. Try again");
            }
        }while(!valid);
        return optionChoosed;
    }
}