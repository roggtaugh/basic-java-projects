import java.util.Scanner;
public class Calculator{
    static Scanner sc = new Scanner(System.in);
    static double result = 0;
  public static void calc(){
      System.out.println("enter the number : ");
      result = sc.nextDouble();
      System.out.println("enter operator : ");
      String opt = sc.next();
      if(opt.equals("+")){
          addition();
      } else if (opt.equals("-")) {
          subtraction();
      }
      else if (opt.equals("*")) {
          multiplication();
      }
      else if (opt.equals("/")) {
          division();
      }
      else if (opt.equals("=")) {
          results();
      }
      else {
          System.out.println("invalid input");
      }
  }
  public static void addition(){
      System.out.println("enter the number : ");
      double num = sc.nextDouble();
      result = result + num;
      System.out.println("enter operator : ");
      String opt = sc.next();
      if(opt.equals("+")){
          addition();
      } else if (opt.equals("-")) {
          subtraction();
      }
      else if (opt.equals("*")) {
          multiplication();
      }
      else if (opt.equals("/")) {
          division();
      }
      else if (opt.equals("=")) {
          results();
      }
      else {
          System.out.println("invalid input");
      }
  }
    public static void subtraction(){
        System.out.println("enter the number : ");
        double num = sc.nextDouble();
        result = result - num;
        System.out.println("enter operator : ");
        String opt = sc.next();
        if(opt.equals("+")){
            addition();
        } else if (opt.equals("-")) {
            subtraction();
        }
        else if (opt.equals("*")) {
            multiplication();
        }
        else if (opt.equals("/")) {
            division();
        }
        else if (opt.equals("=")) {
            results();
        }
        else {
            System.out.println("invalid input");
        }
    }
    public static void multiplication(){
        System.out.println("enter the number : ");
        double num = sc.nextDouble();
        result = result * num;
        System.out.println("enter operator : ");
        String opt = sc.next();
        if(opt.equals("+")){
            addition();
        } else if (opt.equals("-")) {
            subtraction();
        }
        else if (opt.equals("*")) {
            multiplication();
        }
        else if (opt.equals("/")) {
            division();
        }
        else if (opt.equals("=")) {
            results();
        }
        else {
            System.out.println("invalid input");
        }
    }
    public static void division(){
        System.out.println("enter the number : ");
        double num = sc.nextDouble();
        result = result / num;
        System.out.println("enter operator : ");
        String opt = sc.next();
        if(opt.equals("+")){
            addition();
        } else if (opt.equals("-")) {
            subtraction();
        }
        else if (opt.equals("*")) {
            multiplication();
        }
        else if (opt.equals("/")) {
            division();
        }
        else if (opt.equals("=")) {
            results();
        }
        else {
            System.out.println("invalid input");
        }
    }
    public static void results(){
      System.out.println(result);
    }

    public static void main(String[] args) {
        calc();
    }
}