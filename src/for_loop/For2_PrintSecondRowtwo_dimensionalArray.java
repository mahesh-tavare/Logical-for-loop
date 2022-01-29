package for_loop;

/*
* * * 
4 5 6 
* * * 
 


 */
public class For2_PrintSecondRowtwo_dimensionalArray {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int size = a.length;

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {
				
				if(i == 1) {
					System.out.print(a[1][j]+" ");
				
				}
				else
					System.out.print("* ");

			}

			System.out.println();
		}

	}

}
