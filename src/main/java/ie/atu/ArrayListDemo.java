package ie.atu;
import java.util.Scanner;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArrayListDemo {
    public static void main(String[] args) {

        int index=100;
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> AnArray = new ArrayList<Integer>(10);

        for (int y=0;y<11;y++)
        {
            if(y>9)
            {
                System.out.println("Please enter a new number");
                index=scanner.nextInt();
            }
            AnArray.add(index);
            System.out.println("Element at index "+y+" is "+AnArray.get(y));
            index+=100;
        }





        }
    }
