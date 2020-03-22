import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Allocation {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt() ;
		
		for(int i = 0; i < testCases; i++) {
			int n = scan.nextInt();
			int b = scan.nextInt();
			ArrayList<Integer> houses = new ArrayList<Integer>();
			for( int j = 0; j < n; j++) {
				houses.add(scan.nextInt());
			}
			Collections.sort(houses);
			int canBuy = 0;
			boolean cannotBuy = false;
			for( int j = 0; j < n && !cannotBuy; j++) {
				if( b - houses.get(j) >= 0) {
					canBuy++;
					b -= houses.get(j);
				}
				else {
					cannotBuy = true;
				}
			}
			System.out.print("\nCase #" + (i +1) + ": " + canBuy);
		}
		
	}
	
}
