import java.util.Scanner;

class Input03 {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner sc = new Scanner(System.in);

    // Find and print the sum of three integers entered by the user
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println(a + b + c);

    // Remember to close the Scanner
    sc.close();
  }
}
