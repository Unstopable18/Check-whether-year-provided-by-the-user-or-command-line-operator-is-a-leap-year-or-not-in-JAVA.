import java.util.Scanner;
public class leap 
{
    public static void main(String[] args) 
    {
      int year;
      boolean leap = false;
      Scanner scanner = new Scanner(System.in);
      System.out.println("********************");
      System.out.println("Enter Year: ");
      year = scanner.nextInt();
      System.out.println("********************");
      if (year % 4 == 0) 
        {
            if (year % 100 == 0) 
            {
                if (year % 400 == 0)
                leap = true;
                else
                leap = false;
            }
            else
            leap = true;
        }
      else
        leap = false;
  
      if (leap)
        System.out.println(year + " is a leap year.");
      else
        System.out.println(year + " is not a leap year.");
        System.out.println("********************");
    }
  }