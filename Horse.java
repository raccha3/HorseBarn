/*
   Rachel Chalissery
   Mr. Stutler
   AP Computer Science A
   3/7/2022
   
   This program implements a class Horse, which create Horse objects that includes:
      * instance variables representing the horse's name and weight
      * a constructor that takes paramaters for the name and weight
      * accessor methods that allow you to get the horse's name and weight
      * mutator methods that allow you to change the horse's name and weight
      * a toString() method that converts the Horse object to a string
      
*/
public class Horse {

   // private instance variables for name and weight declared
   private String name;
   private int weight;
   
   // Horse constructor that that takes parameters for name and weight
   public Horse(String name, int weight) {
      this.name = name;
      this.weight = weight;
   }
   
   /******* accessor methods *******/
   
   // getName() allows user to access the Horse's name
   public String getName() {
      return name;
   }
   
   // getWeight() allows user to access the Horse's weight
   public int getWeight() {
      return weight;
   }
   
   /******* mutator methods *******/
   
   // setName() allows user to change the Horse's name
   public void setName(String name){
      this.name = name;
   }
   
   // setWeight() allows user to change the Horse's weight
   public void setWeight(int weight){
      this.weight = weight;
   }
   
   /******* toString() *******/
   
   // toString() method writes out the object as a String
   public String toString(){
      return(name + " weighs " + weight + " pounds.");
   }
}
