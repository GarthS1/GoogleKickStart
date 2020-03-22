import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Plates {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i < testCases; i++) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int p = scan.nextInt();
			int beautyV = 0;
			int matrix[][] = new int[n][k];
			ArrayList<Integer> fullPlates = new ArrayList<Integer>();
			for(int j = 0; j < n; j++) {
				fullPlates.add(0);
				for(int a = 0; a < k; k++) {
					matrix[j][a] = scan.nextInt();
					fullPlates.set(j, fullPlates.get(j) + matrix[j][a]);
				}
			}
			Collections.sort(fullPlates);
			for(int z = 0; z < p/k; z++) {
				beautyV += fullPlates.get(fullPlates.size() - z);
			}
			for(int j = 0; j < n; j++) {
				for(int a = 0; a < k; k++) {
					
				}
			}
			
			System.out.print("\nCase #" + (i +1) + ": " + beautyV);
		}
	}
}


// Was unable to finish