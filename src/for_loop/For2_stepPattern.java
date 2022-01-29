package for_loop;
/*
$$$$$$$
$$$$$$
$$$$$
$$$$
$$$
$$
$

 */
public class For2_stepPattern {

	public static void main(String[] args) {
		
		int count =7;
	
		for(int i=0;i<7;i++) {
			
			for(int j=0; j<count;j++) {
				
				System.out.print("$");
			}
			count = count-1;
			
			System.out.println();
		}
		


	}

}
