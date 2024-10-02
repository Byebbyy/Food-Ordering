/*  Assignment:  Restaurant Food Ordering System

   FoodSutthiprapa.java

   Name: Chayaporn Sutthiprapa

   File Created on February 20th, 2023  

*/

import java.util.Scanner;

public class FoodSutthiprapa {
	public static void main(String[] args){
   
   Scanner scnr = new Scanner(System.in);
   
   //output menu
   System.out.printf("    %-25s Price (in dollars)\n","Item");
   System.out.printf("1   %-25s   $11.95\n", "Chicken Pad Thai");
   System.out.printf("2   %-25s   $16.95\n", "Seafood Fried Rice");
   System.out.printf("3   %-25s   $5.95\n", "Side of Fried Rice");
   System.out.printf("4   %-25s   $6.95\n", "Spring Rolls");
   System.out.printf("5   %-25s   $7.95\n", "Summer Rolls");
   System.out.printf("6   %-25s   $17.95\n", "Crispy Duck Basil Sauce");
   System.out.printf("7   %-25s   $13.95\n", "Large Pork Noodle Soup");
   System.out.printf("8   %-25s   $15.95\n", "Shrimp Drunken Noodles");
   System.out.printf("9   %-25s   $4.95\n", "Thai Iced Tea");
   System.out.printf("10  %-25s   $4.95\n", "Thai Iced Coffee");
   
   //declare all the variables
   
   int dish;
   int numDish;
   int serve;
   double price = 0;
   
   double price1 = 11.95;
   double price2 = 16.95;
   double price3 = 5.95;
   double price4 = 6.95;
   double price5 = 7.95;
   double price6 = 17.95;
   double price7 = 13.95;
   double price8 = 15.95;
   double price9 = 4.95;
   double price10 = 4.95;
   
   double percentTax;
   double tax;
   double percentTip=0;
   double tip=0;
   String tipAnswer;
   double total=0;
   char answer;
   
   //ask user for different dishes

   System.out.println("How many different dishes would you like to order today?");
   dish = scnr.nextInt();
   
   //check if it's a valid number
   while ((dish < 0)||(dish>10)) {
      System.out.println("Invalid number please enter again.");
      System.out.println("How many different dishes would you like to order today?");
      dish = scnr.nextInt();}
   
   
   
   //make a loop. 1 loop for each dish 
   for (int i = 1; i <= dish; i++) {
   
   //which dish the users want
      System.out.println("Enter dish " + i + " [1-10]");
      numDish = scnr.nextInt();
   //check if it's a valid input   
      while ((numDish < 1) || (numDish >10)) {
         System.out.println("Invalid number please enter again.");
         numDish = scnr.nextInt();}
      
   //ask user how many serving they want
      System.out.println("How many servings of dish 1 would you like to order?");
      serve = scnr.nextInt();
      
      while (serve < 1) {
         System.out.println("Invalid number please enter again");
         serve = scnr.nextInt();}
   
   //make a switch cases to calculate the price    
      switch (numDish) {
         case 1: 
            price += price1 * serve;
            break;
         case 2:
            price += price2 * serve;
            break;
         case 3:
            price += price3 * serve;
            break;
         case 4:
            price += price4 * serve;
            break;
         case 5:
            price += price5 * serve;
            break;
         case 6:
            price += price6 * serve;
            break;
         case 7:
            price += price7 * serve;
            break;
         case 8:
            price += price8 * serve;
            break;
         case 9:
            price += price9 * serve;
            break;
         case 10:
            price += price10 * serve;
            break;}
    
   } 
   //ask how many tax percentage and calculate
   System.out.println("Enter the tax %:");
   percentTax = scnr.nextDouble();
   while ((percentTax<0) || (percentTax>100)) {
      System.out.println("Invalid input. Please enter again");
      percentTax = scnr.nextDouble();}
   tax = price* (percentTax/100.0);
   
   //ask if users want to tip us if they answer yes ask how much they want to tip and calculate
   System.out.println("Do you want to add tip? ['y' - yes or 'n' - no] ");
   tipAnswer = scnr.next();
   answer = tipAnswer.charAt(0);
   
   //check if it's a valid input
   while ((answer != 'y') && (answer != 'n')){
      System.out.println("Invalid answer. Please enter again.");
      tipAnswer = scnr.next();
      answer = tipAnswer.charAt(0);
}
   if (answer == 'y') {
      System.out.print("Enter tip % [0-100]:");
      percentTip = scnr.nextDouble();
      tip = (percentTip / 100.0) * price;
      }
      
   //calculate total
   total = price + tax + tip;
   
   System.out.println("- - - - - - - - - -");
   System.out.printf("Price: %.2f\n", price);
   System.out.printf("Tax (%.2f): ", percentTax);
   System.out.printf("%.2f\n",tax);
   System.out.printf("Tip (%.2f): ", percentTip);
   System.out.printf("%.2f\n",tip);
   System.out.println("- - - - - - - - - -");
   System.out.printf("Total Amount: $%.2f\n",total);
   System.out.println("Your order has been placed and will be delivered soon!");
   


   }
   }