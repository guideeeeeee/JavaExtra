import java.util.Scanner;

public class LargestAndSecondLargest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] numbers = new int[4];

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      numbers[i] = scan.nextInt();
    }

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int number : numbers) {
      if (number > largest) {
        secondLargest = largest;
        largest = number;
      } else if (number > secondLargest) {
        secondLargest = number;
      }
    }

    System.out.println("The largest number is: " + largest);
    System.out.println("The second largest number is: " + secondLargest);
  }
}