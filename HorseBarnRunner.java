/*
   Rachel Chalissery
   Mr. Stutler
   AP Computer Science A
   3/25/22
   
   program that implements multiple methods to edit a list of Horse objects
   
*/

import java.util.*;

public class HorseBarnRunner {
   public static void main(String[] args) {
      // DO NOT MODIFY any of the code in this main() method!
      
      // create and initialize a HorseBarn object
      HorseBarn barn = new HorseBarn();
      
      // get the original list
      ArrayList<Horse> barnSpaces = barn.getSpaces();
      
      // print each horse and its index, one per line
      System.out.println("Original list:");
      printHorsesAndIndexes(barnSpaces);

      // calculate and display average weight of horses
      double avgWeight = averageWeight(barnSpaces);
      System.out.println("\nAverage weight: " + avgWeight);
    
      // find and print the lightest horse
      Horse lightestHorse = getMinWeightHorse(barnSpaces);
      System.out.print("Lightest Horse: ");
      System.out.println(lightestHorse);

      // find and print the index of the heaviest horse
      int heavyHorseIndex = getMaxWeightIndex(barnSpaces);
      System.out.print("Index of heaviest: ");
      System.out.print(heavyHorseIndex);
      System.out.println(". " + barnSpaces.get(heavyHorseIndex));
       
      // replace Trigger with Buttercup
      Horse buttercup = new Horse("Buttercup", 1327);
      replaceHorse(barnSpaces, "Trigger", buttercup);
      System.out.println("\nAfter replace Trigger with Buttercup:");
      printHorsesAndIndexes(barnSpaces);
      
      // add Coco after Duke
      Horse coco = new Horse("Coco", 1497);
      addHorseAfter(barnSpaces, "Duke", coco);
      System.out.println("\nAdd Coco after Duke:");
      printHorsesAndIndexes(barnSpaces);
       
      // remove horses with even length names
      removeEvenLength(barnSpaces);
      System.out.println("\nAfter remove even length names:");
      printHorsesAndIndexes(barnSpaces);
   }
   
   //*****METHODS*****//
   
   // printHorsesAndIndexes() method takes the ArrayList as a parameter and prints
   // out each Horse object and its index on a new line
   public static void printHorsesAndIndexes(ArrayList<Horse> barn) {
      for (Horse horse : barn) {
         System.out.println(horse.toString() + ", " + barn.indexOf(horse));
      }
   }
   
   // averageWeight() method returns the average weight of all the horses in the barn
   public static double averageWeight(ArrayList<Horse> barn) {
      double sum = 0;
      for (Horse horse : barn) {
         sum += horse.getWeight();
      }
      return (sum / barn.size());
   }
   
   // getMinWeightHorse() method returns the Horse object that weighs the least
   public static Horse getMinWeightHorse(ArrayList<Horse> barn) {
      Horse lightest = barn.get(0);
      
      for(Horse horse : barn) {
         if (horse.getWeight() < lightest.getWeight()) {
            lightest = horse;
         }
      }
      return lightest;
   }
   
   // getMaxWeightIndex() method returns the index of the Horse object that weighs the most
   public static int getMaxWeightIndex(ArrayList<Horse> barn) {
      Horse heaviest = barn.get(0);
      int heaviestIndex = 0;
      
      for(Horse horse : barn) {
         if (horse.getWeight() > heaviest.getWeight()) {
            heaviest = horse;
            heaviestIndex = barn.indexOf(horse);
         }
      }
      
      return heaviestIndex;

   } 
   
   // replaceHorse() method takes a name of an existing horse and the name that you want to replace it with
   // and replaces that horse's name with the one you've chosen
   public static void replaceHorse(ArrayList<Horse> barn, String oldHorse, Horse newHorse) {
      for (int i = 0; i < barn.size(); i++) {
         if (barn.get(i).getName().equals(oldHorse)) {
            barn.set(i, newHorse);         
         }
      }   
   }
   
   // addHorseAfter() method takes the ArrayList, a String horse name, and a new Horse 
   // object as parameters. The method adds the new Horse object after the horse with the given name.
   public static void addHorseAfter(ArrayList<Horse> barn, String replaceHorse, Horse newHorse) {
      for (int i = 0; i < barn.size(); i++) {
         if (barn.get(i).getName().equals(replaceHorse)) {
            barn.add(i + 1, newHorse);
         }
      }
   }
   
   // removeEvenLength() method that takes the ArrayList as a parameter, and removes all
   // the horses where the length of the name is even.
   public static void removeEvenLength(ArrayList<Horse> barn) {
      int counter = 0;
      for (int i = 0; i < barn.size(); i++) {
         if (barn.get(i-counter).getName().length() % 2 == 0) {
            barn.remove(i-counter);
            counter++;
         }
      }
   }
}