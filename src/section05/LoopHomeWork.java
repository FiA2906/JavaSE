package section05;
/*
 * 4번
			i		j 0~6
   *   		0		j 
  ***		1		j   
 *****		2		j 
*******		3		j 
 *****		4 		j > 9 - i 
  ***		5 		j > 9 - i
   *		6		j > 9 - i 
 * 
 */
public class LoopHomeWork {
	public static void main(String[] args) {
		
		/*
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if(i < 7/2 + 1) {
					
					if(j < 3-i) {
						System.out.print(" ");
				} else if (j > i+3) {
					System.out.print(" ");
				}	else {
						System.out.print("*");
				}
					
			} else {
				if(j < i-3) {
					System.out.print(" ");
				} else if (j > 9-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				}
			}	
			System.out.println();	// 개행
		}
		*/
		
		
		System.out.println("   ☆");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 7; j++) {
				if(j < 3 - i) {
					System.out.print(" ");
				} else if (j > i + 3) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(); 	// 개행
		}
		System.out.println("  | | Merry Christmas ~*");

	}
}