package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] ArrayDemo;
        int x,index=100;

        ArrayDemo= new int[10];
        for (x=0;x<11;x++)
        {
            ArrayDemo[x]=index;
            index+=100;
            System.out.println("Element at index "+x+" is "+ArrayDemo[x]);
        }




        }
    }
