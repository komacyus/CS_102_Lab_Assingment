import java.util.Scanner;

public class Lab00_assignment2 {

    public static void main(String[] args) {
        int[] numbers = new int[101];
        for(int i = 0;i <= 100; i++){
            numbers[i] = i;
        }
        System.out.println(numbers[101]);













        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Scanner in = new Scanner(System.in);
        boolean isExit = true;
        int choice;
        String s1 = "Menu%n 1-min and max values of the array %n 2-average of the array% 3-odd sum%n 4-even sum %n 5-exit";

        while (isExit) {
            System.out.println(s1);
            System.out.print("Enter a choice");
            choice = in.nextInt();

            if ( choice == 1) { // min max

                
            }
            else if( choice == 2){ //average
                

            }
            else if ( choice == 3) { //odd sum
                
            }
            else if ( choice == 4) { //even sum
                
            }
            else if ( choice == 5) { //exit
                System.out.println("Exitting!");
                isExit = false;
                
            }
            else{
                System.out.println( "please enter a number between 1-5 !");
            }

            
        }
        in.close();
    }




















































































































    /**
     * finds the max value in givven array
     * @param array
     * @return max integer
     */
    public int findMax (int array[]) {
        int max = array[0];

         for (int i = 1; i < array.length; i++)
             if (array[i] > max) {
                max = array[i];
             }
       
         return max;
    }

    /**
     * finds the min value in givven array
     * @param array
     * @return min integer
     */
    public int findMin (int array[]) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    } 
}