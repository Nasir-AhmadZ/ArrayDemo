package ie.atu;
import java.util.Scanner;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] ArrayDemo;
        int index=100,i=0;
        Scanner scanner = new Scanner(System.in);

        ArrayDemo= new int[10];
        for (int x:ArrayDemo)
        {
            if(x>9)
            {
                System.out.println("Please enter a new number");
                index=scanner.nextInt();
                break;
            }
            ArrayDemo[i]=index;
            index+=100;
            System.out.println("Element at index "+i+" is "+ArrayDemo[i]);
            i++;
        }
        index=100;
        System.out.println("\n\n");
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
