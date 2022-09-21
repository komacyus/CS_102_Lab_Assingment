import java.util.Scanner;

public class Lab00_assignment2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner key = new Scanner(System.in);
        boolean isExit = true;
        boolean isNum = true;
        int choice;
        int size;
        int finalSize = 0;
        String s1 = "\nMenu\n 1-min and max values of the array \n 2-average of the array\n 3-odd sum\n 4-even sum \n 5-exit\n";

        while (isNum) {

            System.out.print("Enter the size of array: ");
            size = key.nextInt();
            finalSize = size;
                isNum = false;
            
            
        }
        int[] numbers = createArray(finalSize);
        showArray(numbers);
        // if the choice is exit quits
        while (isExit) {
            System.out.println(s1);
            System.out.print("Enter a choice: ");
            choice = in.nextInt();

            if ( choice == 1) { // min max
                int max ;
                max = findMax(numbers);
                System.out.println("the max value is " + max );
                int min = findMin(numbers);
                System.out.println("the min value is " + min);
                
            }
            else if( choice == 2){ //average
                int[] arr = average(numbers);
                showArray(arr);
            }
            else if ( choice == 3) { //odd sum
                int sum = findSum(numbers, true);
                System.out.println(sum);
            }
            else if ( choice == 4) { //even sum
                int sum = findSum(numbers, false);
                System.out.println(sum);
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
        key.close();
    }
    
    
    public static int[] createArray(int size){
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            int num = (int)(101* Math.random());
            array[i] = num;
        }
        return array;
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

        public static int[] average(int[] arr){

            int sum = 0;
            int[] newArray = new int[arr.length];

            for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            }
            int avr = sum/arr.length;

            for( int i = 0; i < arr.length; i++){
                newArray[i] = avr - arr[i] ;
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
    public static void showArray(int[] arr){
        System.out.print("[");
                for (int i = 0; i < arr.length-1; i++) {
                    System.out.print(arr[i] + ", ");
                }
                System.out.print(arr[arr.length-1] + "]");
    }
}
