package for_loop;

/*
 00       
   11    
      22 

 */
public class For2_diagonal {

	public static void main(String[] args) {
	
		for(int i=0;i<3;i++) {
			
			for(int j=0; j<3;j++) {
				
				if(i ==j) {
					System.out.print(i+""+j +" ");
				}
				else
					System.out.print("   ");
			}
			
			System.out.println();
		}

	}

}
