/*
   Rachel Chalissery
   Mr. Stutler
   AP Computer Science A
   3/7/22
   
   program that populates a list of Horse objects
   
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/**
 *  A class to manage the location of horses in a barn.
 */
public class HorseBarn {
   // The stalls or spaces in the barn. Each array element holds a reference to the horse
   // that is currently occupying the space. A null value indicates an empty space.
   
   // TODO: declare the instance variable "spaces" that is an ArrayList of Horse objects
   private ArrayList<Horse> spaces;
   
   /**
    * Constructor for the HorseBarn class. Loads data from the HorseData.txt file
    * and populates the ArrayList spaces. If a blank line occurs in the data file,
    * the array element is assigned a value of null to indicate the absense of a horse.
    */
   public HorseBarn()  {
      // TODO: create the "spaces" ArrayList using the "new" keyword
      spaces =  new ArrayList<Horse>();
      
      // a try is like an if statement, "throwing" an error if the body of the try fails
      try  {
         Scanner scan = new Scanner(new File("HorseData.txt"));
         // The Scanner method hasNextLine() returns true if there is another line of input
         while (scan.hasNextLine()) {
            // String method trim() removes whitepsace from the beginning and end of strings
            String temp = scan.nextLine().trim();
            
            if (temp.equals("")) {
               // no horse in this stall, add a null entry
               spaces.add(null);
            }
            else {  
               // String method split splits this string based on the specified token
               // and returns an array of individual substrings
               String[] tokens = temp.split(",");  
               
               String name = tokens[0];
               int weight = Integer.parseInt(tokens[1]);
               
               // create the Horse object and add it to the array list
               Horse h = new Horse(name, weight);
               spaces.add(h);
            }
         }
      }
      catch (Exception e) {
         System.out.println("Error reading or parsing HorseData.txt\n" + e);
      }
   }

   /**
    * Returns the current list of spaces in the barn. If a space does not
    * have a horse in it, the element will be null.
    * 
    * @return the ArrayList of spaces
    */
    
    // TODO: implement the getSpaces() method
    public ArrayList<Horse> getSpaces(){
      return spaces;
    }
}