import java.util.Scanner;

public class Lab00_assignment2 {

    public static void main(String[] args) {
    }
    
    public int[] createArray(int size){
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            int num = (int)(101* Math.random());
            array[i] = num;
        }
    }
    public int findSum(int[] array, boolean doYouWantOdds){

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
}