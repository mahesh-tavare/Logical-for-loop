package for_loop;

/*
   2   
 4 5 6 
   8   


 */
public class For2_PlusSignIn_two_dimensionalArray {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int size = a.length;


		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {

				if(j ==1 || i==1)
					System.out.print(a[i][j]+" ");
				else
					System.out.print("  ");
					
			}

			System.out.println();
		}

		
	}

}
