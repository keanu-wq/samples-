/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package INTERFACE;

/**
 *
 * @author keanu
 */import java.util.*;

// initializing interface
interface Vehicle{
  void start();
  void stop();
  int getSpeed();
  
}
// car class implementing Vehicle Interface
class Car implements Vehicle{
    private int Speed;
    
    public Car(int C){
        this.Speed = C;
    }
    
    public void start(){
        System.out.println("Car has Started! ");
        System.out.println("The car's speed is " + getSpeed());
        
    }
    
    public void stop(){
        System.out.println("Car has stopped! ");
        this.Speed = 0;
        System.out.println("The car's speed is at " + getSpeed());
        
    }
    
    public int getSpeed(){
        return Speed;
    }
    
}
//Bike class implementing Vehicle Interface
class Bike implements Vehicle{
    private int speed;
    
    public Bike(int b){
        this.speed = b;
    }
    
    public void start(){
        System.out.println("Bike has started!");
        System.out.println("The speed of the bike is " + getSpeed());
    }
    
    public void stop(){
        System.out.println("The bike has stopped!");
        this.speed = 0;
        System.out.println("The speed of the bike is at " + getSpeed());
    }
    
    public int getSpeed(){
       return speed; 
    }
}

 
public class interfacePractice {
 public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     //instantiated objects with values.
     Car c = new Car(15);
     Bike b = new Bike(20);
     
     /* this condition chooses B, C, or E. There are separate conditions for every choices. 
        Eventually, If they exited in the B, C , and E. They will be brought back here to 
        choose for either the threee.
     */
     while(true){
       try{
        System.out.print("Choose B for bike, C for car, E for Exit: ");
        String choose = s.nextLine();  
         
         if(choose.equalsIgnoreCase("B")){
          /*
             A while loop in which If user typed Y, the bike will start and 
             that b.start will function. In which it will ask again a question 
             inside of the Y choice. 
             
             If he chose S, he will go back to the 3 choices(B,C,E)
             */
          while(true){
              /*
               I chose try and catch for exception handling and therefore make
               code run even if it occurs an error.
              */
             
              
           try{
             System.out.print("Would you like to start the bike? (y/n): ");
             String choice = s.nextLine();
             
             if(choice.equalsIgnoreCase("Y")){
                 System.out.println(" ");
                 b.start();
                 
                 /*
                 In this while loop, If the user wants to keep moving, the text
                 will display, until eventually if the user types S, he will go
                 back in the "would you like to start the bike" choice
                 */
              while(true){
                  System.out.println("");
                  System.out.print("Would you like to stop(S) or not(N): ");
                  String choise = s.nextLine();
                  
                  if (choise.equalsIgnoreCase("S")){
                     System.out.println("Thank goodness, I AM  T I R E D");
                      System.out.println(" ");
                     break;
                  } else if (choise.equalsIgnoreCase("N")){
                      System.out.println("The bike is still moving...");
                      System.out.println(" ");
                  } else{
                      System.out.println("Invalid choice, S and N only.");
                      System.out.println(" ");    
                  }
              }    
                 
             } else if (choice.equalsIgnoreCase("n")){
                 b.stop();
                 break;
             } else {
                 System.out.println("Invalid choice, Y and N are d only choices.");
             }
        }catch(Exception e){
           System.out.println(e.getMessage());
       
        }  
       }
          /*
          In this block of code, is the same as the bike choice.
          */
     } else if (choose.equalsIgnoreCase("C")){
         while(true){
           try{
               System.out.print("Would you like to start the car? (Y/N)");
               String CarChoice = s.nextLine();
               
               if(CarChoice.equalsIgnoreCase("Y")){
                   System.out.println(" ");
                   c.start();
                   System.out.println(" ");
                   
                   while(true){
                       System.out.print("Do you want to keep moving? (Y/N)");
                       String CarMove = s.nextLine();
                       
                       
                       if(CarMove.equalsIgnoreCase("Y")){
                           System.out.println("The Car is still moving....");
                           System.out.println(" ");
                       } else if(CarMove.equalsIgnoreCase("N")){
                           System.out.println(" ");
                           c.stop();
                           break;
                       }
                   }
               } else if (CarChoice.equalsIgnoreCase("N")){
                   System.out.println(" ");
                   c.stop();
                   break;
               } else {
                   System.out.println("Invalid choice. Y and N only\n");
               }
           }catch (Exception e){
               System.out.println(e.getMessage());
           }  
         }
         
     } else if (choose.equalsIgnoreCase("E")){
             System.out.println("exiting...");
             break;
     } else {
             System.out.println("Invalid choice. Please try again\n"); 
     }
        
         
       }catch(Exception e ){
           System.out.println(e.getMessage());
       }  
     }
     
    
     
     
     
 }
}