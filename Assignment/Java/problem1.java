//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

package Assignment.Java;
import java.util.*;

public class problem1{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
			int randomIndex = rand.nextInt(arr.length);
			int temp = arr[randomIndex];
			arr[randomIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
    }
}