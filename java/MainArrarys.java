import java.util.Arrays;

public class MainArrarys {
    public static void main(String[] args) {
          /*  int[] numbers = {4, 2, 1, 5, 8};
        Arrays.sort(numbers);// to sort the numbers
        System.out.println(Arrays.toString(numbers));toString is for 1D array
        System.out.println(numbers.length);*/
    
    
    //2d arrays
        /*int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        numbers[0][1] = 3;
        System.out.println(Arrays.deepToString(numbers)); */

    //3D arrays
        /*int[][][] numbers = new int[2][3][5];
        numbers[0][0][0] = 2;
        System.out.println(Arrays.deepToString(numbers)); */
        
        int[][] numbers = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(numbers));
    }
    
}
