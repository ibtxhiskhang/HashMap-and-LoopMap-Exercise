import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class Main {


public static void main(String [] args) {

////PROBLEM NUMBER ONE: FIVE RANDOM NUMBERS

//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Put in any 5 number that you want!");
//    int myNumber1 = scanner.nextInt();
//    int myNumber2 = scanner.nextInt();
//    int myNumber3 = scanner.nextInt();
//    int myNumber4 = scanner.nextInt();
//    int myNumber5 = scanner.nextInt();
//    List<Integer> arrNumbers = new ArrayList<> ();
//
//    arrNumbers.add(myNumber1);
//    arrNumbers.add(myNumber2);
//    arrNumbers.add(myNumber3);
//    arrNumbers.add(myNumber4);
//    arrNumbers.add(myNumber5);
//    System.out.println(arrNumbers);
//    int sum = 0, product = 1, max = arrNumbers.get(0), min = arrNumbers.get(0);
//    for(int i = 0; i < 5; i++) {
//        sum += arrNumbers.get(i);
//        product *= arrNumbers.get(i);
//        max = Math.max(max, arrNumbers.get(i));
//        min = Math.min(min, arrNumbers.get(i));
//    }
//// printing the output.
//    System.out.println("The sum is: " + sum);
//    System.out.println("The product is: " + product);
//    System.out.println("The Max is: " + max);
//    System.out.println("The Min is: " + min);
//}



//PROBLEM NUMBER TWO : CARS


    // Creating the Hashmap with Keys: Model, and Value: Make
    //We defined the type of information by using <String, string> because both the make and model are string values.
    //We  named our hashmap VEHICLES
    HashMap<String, String> vehicles = new HashMap <String, String> ();
    vehicles.put("Cybertruck", "Tesla");
    vehicles.put("X6", "BMW");
    vehicles.put("R8", "Audi");
    vehicles.put("Tundra", "Toyota");
    vehicles.put("Wrangler", "Jeep");

    // Greets the user, and allows user to put their name and model of car they're looking for.
    System.out.println("Hi, welcome to our dealership.");
    Scanner scan1 = new Scanner(System.in);
    System.out.println("What is your name?");
    String yourName = scan1.next();
    System.out.println("Hello " + yourName + " what car model are you looking for?");

    //This is to grab the input from the User from the previous question, the model of the car they're looking for.

    Scanner scanner = new Scanner(System.in);
    String carChoice = scanner.next();

    //This now adds in their input, plus the statement "oh you're looking for a..."
    System.out.println("Oh, you're looking for a " + carChoice);

    //contains.key allows the computer to take the user's input (carChoice) and checks the "hashmap" from above to see if it contains what the user has inputted. It comes out as a boolean (true/false)
    //the if statement is saying that "IF it is TRUE that the input matches one of the car options above, it will state out, "yes we do have that model, and the make for that model is...."

  if(vehicles.containsKey(carChoice)) {
      System.out.println("Great! We do have that model. ");

      System.out.println("The make for that model is " + (vehicles.get(carChoice))); //the code (vehicles.get(carChoice) uses the user input (the model "a key") and grabs the "make" (value) from the table and displays that (the make "value").
  }
 else { //else is saying that if the user input does not match any of the above models, it will print out "sorry we don't carry that model"
      System.out.println("Sorry, we don't carry that model.");
      System.out.println("Have a nice day!");

}
}
}

//    You are a car dealer. Create a hash map of vehicles.
//        The model is the Key, the make is the Value.
//        Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
//        (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")