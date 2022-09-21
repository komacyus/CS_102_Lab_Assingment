import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Lab00_assignment2 {

    public static void main(String[] args) {


        
        Scanner in = new Scanner(System.in);
        Scanner key = new Scanner(System.in);
        boolean isExit = true;
        boolean isNum = true;
        int choice;
        int size;
        int finalSize;
        String s1 = "Menu%n 1-min and max values of the array %n 2-average of the array%n 3-odd sum%n 4-even sum %n 5-exit";


        while (isNum) {

            System.out.print("Enter the size of array:");
            size = key.nextInt();
            if (key.hasNextInt()) {
                finalSize = size;
                isNum = false;
            }
            
        }
        int[] numbers = createArray(finalSize);


        // if the choice is exit quits
        while (isExit) {
            System.out.println(s1);
            System.out.print("Enter a choice");
            choice = in.nextInt();

            if ( choice == 1) { // min max
                int max ;
                max = findMax(numbers);
                System.out.println("the max value is " + max );
                int min = findMin(numbers);
                System.out.println("the min value is " + min);
                
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
    
    
    public static int[] createArray(int size){
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            int num = (int)(101* Math.random());
            array[i] = num;
        }
    }
    public static int findSum(int[] array, boolean doYouWantOdds){

        int sum = 0;
            
        if (doYouWantOdds){
           for(int i = 1; i<array.length ; i+=2){
                sum += array[i];
            }
        } else{
           for(int i = 0; i<array.length ; i+=2){
                sum += array[i];
            }
        }
        return sum;
        }













        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        















































        public int[] average(int[] arr){

            int sum = 0;
            int[] newArray = new int[arr.length];

            for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            }

            for( int i = 0; i < arr.length; i++){
                newArray[i] = sum - arr[i] ;
            }

            return newArray;

        }
 



































































    /**
     * finds the max value in givven array
     * @param array
     * @return max integer
     */
    public static int findMax (int array[]) {
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
    public static  int findMin (int array[]) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
 } 
}
