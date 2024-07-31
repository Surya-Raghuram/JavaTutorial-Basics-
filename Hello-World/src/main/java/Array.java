import java.util.Arrays;
import java.util.Scanner;

class Array {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // char vowels[] = new char[5];
    
    // vowels[0] = 'a';
    // vowels[1] = 'e';
    // vowels[2] = 'i';
    // vowels[3] = 'o';
    // vowels[4] = 'u';
    //we can print indiividual elements of an array, to print the entire array, we have to convert the array to a string

    //we can also use charAt() to print individual elements of an array

    //we can also define array in one line
    System.out.println("How man numbers do you want to enter?");
    int length = scanner.nextInt();
    scanner.nextLine();
    
    char vowels[] = new char[length];
    if(length !=0){
      for(int i = 0; i < length; i++){
        System.out.printf("Enter number %d: ", i + 1);
        String j = scanner.next();
        vowels[i] = j.charAt(0);  
        scanner.nextLine();
      }
    } else{
      System.out.println("Can't make an Array with 0 elements");
    }  
    //we can use .sort to sort them
    Arrays.sort(vowels);
  System.out.println(Arrays.binarySearch(vowels, 'b'));
  //if the key value doesn't exist, it will return a negative number, if it does exist, it will return the index of the key value
  // The negative value is: -(where it would be inserted) - 1
  } 
}