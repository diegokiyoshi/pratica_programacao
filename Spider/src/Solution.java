import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
       
    	Scanner sc = new Scanner(System.in);
		int sizeMatrix = sc.nextInt();
		Integer matrix[][] = new Integer[sizeMatrix][sizeMatrix];
		Integer sumLeftRight = 0;
		Integer sumRightLeft = 0;
		Integer diff = 0;
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> ar = new ArrayList<>();
		for(int i = 0; i < matrix.length; i++ ) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
				
				
				
				ar.add(matrix[i][j]);
				arr.add(ar);
			}
		}
			
		for(int i = 0; i < matrix.length; i++ ) {
			for(int j = matrix.length -1; j >= 0; j--) {
				sumLeftRight += matrix[i][i];
				sumRightLeft += matrix[i][j];
				i++;	
			}
		}
		 
		if((sumLeftRight - sumRightLeft) < 0) {
			diff = (sumLeftRight - sumRightLeft) * (-1);
		} else {
			diff = sumLeftRight - sumRightLeft;
		}
		System.out.println(sumLeftRight);
		System.out.println(sumRightLeft);
		System.out.println(diff);		
		
		sc.close();
    }
}