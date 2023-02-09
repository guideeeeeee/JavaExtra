import java.util.Scanner;
public class calculator {
    /*"Write a program in Java that calculates and outputs the average of a list of integers.
     The list will be of unknown length, 
    and the integers will be read in from the user until they enter a negative number."*/
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        int [] num = new int[];
        int i= 0 ;
        boolean x = true;
        while (x==true){
            
            System.out.println("Enter number as a integer:");
            num[i] = sn.nextInt();
            i = i+1;
        }
        sn.close();
    }
}
