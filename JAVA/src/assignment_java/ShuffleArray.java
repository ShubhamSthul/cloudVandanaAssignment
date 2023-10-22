
//A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 

package assignment_java;

import java.util.Random;

public class ShuffleArray {

	public static void shuffle(int[] array) {
		Random random = new Random();

		for (int i = array.length - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);

			// swap array[i] with array[j]
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		shuffle(array);

		// printing shuffled array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
