public class Lab00_assignment2 {

    public static void main(String[] args) {
        
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