package bai3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu menu=new Menu();
        Scanner scan=new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Input: ");
            System.out.println("2. View: ");
            System.out.println("3. Remove, update: ");
            System.out.println("4. Searching by code : ");
            System.out.println("5. Searching from to : ");
            System.out.println("6. Sorting : ");
            System.out.println("7. Calculate : ");
            System.out.println("9.Write");
            System.out.println("10.Read");
            System.out.println("0. Exit : ");
            choice=scan.nextInt();
            switch (choice){
                case 1:
                    menu.input();
                    break;
                case 2:
                    menu.output();
                    break;
                case 3:
                    menu.update();
                    break;
                case 4:
                    menu.search();
                    break;
                case 6:
                    menu.sort();
                    break;
                case 9:{
                    menu.write();
                    break;
                }
                case 10:{
                    menu.read();
                    break;
                }
            }
        } while (choice!=0);
    }
}
