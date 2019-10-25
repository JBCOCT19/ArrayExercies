/*
 * Declare and Print the integer arrays below:
    5 number of positive numbers
    5 number of negative numbers
    5 number of odd numbers
    5 number of even numbers
 */


import java.lang.reflect.Array;

public class ArrayExcercies {
    public static void main(String args[]) {
        int posNos[] = {41, 51, 61, 71, 81};
        int negNos[] = {-1, -2, -3, -4, -5};
        int oddNos[] = {1, 3, 5, 7, 9};
        int evenNos[] = {2, 4, 6, 8, 10};

        // print out the content of posNo array
        System.out.print("Positive Number: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(posNos[i] + ", ");
        }
        System.out.println("]");

        //print out the content of negNo array
        System.out.print("Negative Number: [");
        for (int i = 0; i < 5; i++)
            System.out.print(negNos[i] + ", ");
        System.out.println("]");

        //print out the content of oddNo array
        System.out.print("Odd Number: [");
        for (int i = 0; i < 5; i++)
            System.out.print(oddNos[i] + ", ");
        System.out.println("]");

        //print out the content of evenNo array
        System.out.print("Even Number: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(evenNos[i] + ", ");
        }

        System.out.println("]");
    }
}
