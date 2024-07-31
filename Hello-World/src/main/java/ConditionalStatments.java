import java.util.Scanner;

class ConditionalStatements{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double number1 = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Enter the second number: ");
    double number2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("What operation do you want to perform? ");
    String operation = scanner.nextLine();

    //Switch case(only works with strings if java ver 1.7 or higher, we can use default in switch, and break the code )
    // switch(operation){
    //   case "sum":
    //     System.out.printf(number1 + number2)
    // }   break;
    //   default:
    //     System.out.printf("%s is not a supported operation", operation);
    
    // .equals() is used to compare two strings, if integers we can use ==.
    if (operation.equals("sum")){
      System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
    } else if (operation.equals("subraction")){
      System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
    } else if (operation.equals("multiplication")){
      System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
    } else if (operation.equals("division")){
      System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
    }
    else {
      System.out.printf("%s is not a supported operation", operation);
    }
    //we can use double if's or else if, but if we want same else, its better to use else if

    scanner.close();
  }
}