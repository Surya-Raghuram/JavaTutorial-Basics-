import java.util.Scanner;

class Main {
  static String test = "Hello World";
  
  public static void main(String[] args){
    int number1 = 5;
    double number2 = number1;
    //This is implicit conversion of datatypes, no loss will happen

    double number3 = 5.8;
    int number4 = (int)number3;
    //This is explicit conversion of datatypes, loss will happen
    
    int number = 12;
    number = number + 5;
    //number += 5 or just number++ can be used to increment the value of number by 1 but to use this and print in same line of code, use     System.out.println(++number) and not System.out.println(number++) because the value of number will be incremented first and then printed in the first case

    //Logical Processing in Java
    int age1 = 25;
    
    System.out.println(age1 >= 18 && age1 <= 40);
    // && indcates 'and' and || indicates 'or'
    // ! indicates 'not' 

    // string operators
    String name = "Sarah";
    int age = 28;
    String school = "University of Lagos";

    String formated = String.format("Hi I am %s, and I am %d years old. I study in %s.", name,age,school);
    System.err.println(formated.toUpperCase());
    // .length() is used to find the length of a string
    // .toUppercase() is used to convert a string to uppercase

    // User Input
    Scanner scanner = new Scanner(System.in);

    //println is used to print a string and then a new line, print will not create a new line
    System.out.print("What is your name? \n");
    String name1 = scanner.nextLine();
    
    //printf is used to print and use format specifiers (%s) in the same line
    System.out.printf("Hi %s. How old are you? \n", name1);
    int age2 = scanner.nextInt();
    scanner.nextLine(); //This is to clean the input buffer
    System.out.printf("%d is a great age to start programming. All the best! \n", age2);
    
    //When using nextline() after nextInt(), use scanner.nextLine() to clear the input buffer
    //we can also only use nextline(), and later convert it to the datatype we want to use
    System.out.println("What language do you prefer?");
    String language = scanner.nextLine();
    System.out.printf("%s is a very good programming language", language);
    
    scanner.close();
  }
}