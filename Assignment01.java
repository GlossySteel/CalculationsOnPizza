/**
* CSE 110     : Class 77686 / iCourse
* Assignment  : assignment 1
* Author      : Joseph Kharzo & 1218555299
* Description : A program that takes in information regarding the purchase and
* slicing of pizza. The program then uses user input to calculate the best way
* to divide the slices of pizza among a set number of adults and children. The
* program also calculates the number of leftover pizza slices. This all relies
* on user input.
*/
import java.util.Scanner;

public class Assignment01 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        
        // declare and instantiate a Scanner to store and use user input
        
        Scanner userInput = new Scanner(System.in);
        
        // declare and initialize variables
        
        // Inputs
        
        /*
        * The inputs cover the number of pizzas purchased, the slices for
        * each pizza, and the number of adults and children that will eat.
        * The number of slices each adult will recieve is a constant.
        */
        int pizzasPurchased, slicesPerPizza, numberOfAdults, numberOfChildren;
        final int NUMBER_OF_SLICES_PER_ADULT = 2;
        
        // Outputs
        
        /*
        * The outputs are calculations made based on the inputs. They cover the
        * number of slices for adults and children and the number of slices
        * leftover.
        */
        int NumberOfSlices, SlicesForAdults, SlicesAvailableForChildren;
        int SlicesForChildren, SlicesLeftOver;
        
        // String formatting for the printf method to align the colons and integers
        String format = "%-27s%s";
        String format1 = "%-45s%s%s%n";
        
        // prompt for and collect inputs
        
        System.out.printf(format,"Number of pizzas purchased",": ");
        pizzasPurchased = userInput.nextInt();
        
        System.out.printf(format,"Number of slices per pizza",": ");
        slicesPerPizza = userInput.nextInt();
        
        System.out.printf(format, "Number of adults", ": ");
        numberOfAdults = userInput.nextInt();
        
        System.out.printf(format, "Number of children", ": ");
        numberOfChildren = userInput.nextInt();
        
        // compute required values
        
        /*
        * The total number of slices is calculated by multiplying the number of
        * pizzas purchased with the slices made for each pizza.
        */
        NumberOfSlices = pizzasPurchased * slicesPerPizza;
        
        /*
        * The total slices for all adults is calculated by multiplying the
        * number of adults by the contant slices per adult.
        */
        SlicesForAdults = numberOfAdults * NUMBER_OF_SLICES_PER_ADULT;
        
        /*
        * The slices available for the children is the total number of slices
        * minus by the slices given to the adults.
        */
        SlicesAvailableForChildren = NumberOfSlices - SlicesForAdults;
        
        /*
        * The slices given to the children must by divided evenly, so the total
        * number of slices for the children must be the slices availabe
        * divided by the number of children.
        * This variable represents the slices for each child NOT the total given.
        */
        SlicesForChildren = SlicesAvailableForChildren / numberOfChildren;
        
        /*
        * The leftover slices consist of the total slices subtracted by the
        * amount given to the children and the adults.
        */
        SlicesLeftOver = NumberOfSlices - SlicesForAdults - SlicesForChildren * numberOfChildren;

        // display required outputs
        System.out.printf(format1, "Total number of slices of pizza", ": ", NumberOfSlices);
        System.out.printf(format1,"Total number of slices given to adults", ": ", SlicesForAdults);
        System.out.printf(format1, "Total number of slices available for children", ": ", SlicesAvailableForChildren);
        System.out.printf(format1, "Number of slices each child will get", ": ", SlicesForChildren);
        System.out.printf(format1, "Number of slices left over", ": ", SlicesLeftOver);

       
    }
}
