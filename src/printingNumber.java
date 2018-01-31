
public class printingNumber {

	public static void main(String[] args) {
		
		//The estimate cost is 5.0015662e+18
		
		int[][] table = new int[5018450][29];
		
		//load the 2D array with data
		//r = row
		//c = column
		for(int r = 0; r < table.length; r++) {
			
			//sub-row
			for(int c = 0; c < table[r].length; c++) {
				
				table[r][c] = r * 12 + c;
			}
		}
		
//		//print the 2D array data
//		for(int r = 0; r < table.length; r++) {
//			//sub-row
//			for(int c = 0; c < table[r].length; c++) {
//				System.out.print(table[r][c] + "\t");
//			}
//			System.out.println();
//		}
		
		//Snake through the data
		for(int r = 0; r < table.length; r++) {
			if(r % 2 == 0) {
				for(int c = 0; c < table[r].length; c++) {
				System.out.print(table[r][c]);
			}
			System.out.println();
				}
			else {
				for(int c = table[r].length - 1; c >= 0; c--) {
					System.out.print(table[r][c]);
				}
				System.out.println();
				
			}
		}
		
	}

}

