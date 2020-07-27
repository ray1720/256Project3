
import java.util.*; 


public class Project3 {

  public static void main(String[] args) {


    Scanner user_input = new Scanner(System.in);
      System.out.println("This program will calculate what you would make if you worked 24/7 for the rest of your life (assuming an 80 year life)");
      System.out.println("input your current age");
      int age = user_input.nextInt();
      System.out.println("input your hourly pay rate (without $)");
      float rate = user_input.nextFloat();
      float totalValue = lifeValue(age, rate);
      System.out.println("If you never stopped working you would make " + totalValue + " dollars");
    }
  
  public static float yearly(float pay) {
    return (pay*24*365);
  }
  public static int remainingLife(int age) {
    return 80 - age;
  }

  public static float lifeValue(int age, float pay) {
    return yearly(pay) * remainingLife(age);
  }
    }


  


