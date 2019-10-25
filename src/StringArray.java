import java.util.Scanner;

public class StringArray {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);

        int sum = 0, usrNo;
        double avg;

        System.out.println("How many number would you like to enter?");
        usrNo = keybd.nextInt();
        keybd.nextLine();

        int intArray[] = new int[usrNo];

        sum = 0;
        for (int i = 0; i < usrNo; i++) {
            System.out.println("Enter a number: ");
            intArray[i] = keybd.nextInt();
            sum += intArray[i];
            keybd.nextLine();
        }
        avg = sum / (usrNo * 1.0);
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + avg);
    }
}
