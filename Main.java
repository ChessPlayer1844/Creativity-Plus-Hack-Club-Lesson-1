import java.io.*;
import java.time.Year;

public class Main {
  public static void main(String[] args) throws IOException {

    System.out.println(" ");
    System.out.println("Hello world!");
    System.out.println(" ");

    System.out.println("My name is OmyDaGreat");
    System.out.println(" ");

    int age = 12;
    System.out.print("My age is ");
    System.out.println(age);
    System.out.println(" ");

    boolean filledAttendance = true;
    System.out.println("I have filled the attendance.");
    System.out.println(filledAttendance);
    System.out.println(" ");

    int y = 1;
    int x = y;

    int sum = x + y;
    System.out.print("The sum of 1 and 1 is ");
    System.out.print(sum);
    System.out.println(".");
    System.out.println(" ");

    boolean isGreater = x > y;
    System.out.println("1 is greater than 1.");
    System.out.println(isGreater);
    System.out.println(" ");
    System.out.println(" ");

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("\033[0;1m" + "Input Something: ");
    String name = stdin.readLine();
    System.out.println(name);
  }
}