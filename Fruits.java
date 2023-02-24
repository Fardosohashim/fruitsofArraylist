package fruitsofArraylist;

import java.util.ArrayList;

import java.util.Scanner;

public class Fruits {
    public static boolean finder(ArrayList<String> fruitArray, String userInput) {
        boolean found = false;
       int howmany=0;
        for (String i : fruitArray) {
            if (i.equals(userInput)) {
                found = true;
          howmany++;

            }


            }

            System.out.println("the " + userInput + " was found " + howmany + " times ");
            return found;

        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("Enter a fruits");
        String F = sc.nextLine().toLowerCase();


        fruits.add("orange");
        fruits.add("mango");
        fruits.add("lemon");
        fruits.add("lemon");
        fruits.add("watermelon");
        fruits.add("grapes");
        fruits.add("banana");
        fruits.add("avocado");
        fruits.add("passion");
        fruits.add("apple");
        fruits.add("pineapple");




            if(finder(fruits,F)){
                System.out.println();

        }else{
            System.out.println("the fruits is not found");
        }

}
// the orange  was found 3 timees



}


