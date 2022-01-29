package for_loop;

/*
 00 01 
10 11 

 */
public class For2_two_dimensionalArray {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int size = a.length;


		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {

				System.out.print(a[i][j]+" ");
			}

			System.out.println();
		}

		
	}

}
