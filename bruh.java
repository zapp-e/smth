import java.util.Scanner;

class bruh
{
  public static void main(String[] args) 
  {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Whats your favorite color?");
    String color = scan.nextLine();

    System.out.println("Your favorite color is: " + color);

    System.out.println("List 3 integers");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    System.out.println(a + b + c);
    
    
  }
}