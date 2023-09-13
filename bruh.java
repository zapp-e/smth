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
    int x = scan.nextInt();
    int y = scan.nextInt();
    int z = scan.nextInt();

    System.out.println("The sum of these integers is: ");
    System.out.print(x + y + z);
    
    
  }
}