package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] ArrayDemo;
        int index=100;

        ArrayDemo= new int[10];
        for (int x:ArrayDemo)
        {
            if(x>9)
            {
                break;
            }
            ArrayDemo[x]=index;
            index+=100;
            System.out.println("Element at index "+x+" is "+ArrayDemo[x]);
        }




        }
    }
