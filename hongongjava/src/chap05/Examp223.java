package chap05;

public class Examp223 {

	public static void main(String[] args) {
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum+=array[i][j];
				count++;
			}
		}
		avg=(double)sum/count;
		
		for(int[] array1 : array) {
			for(int i=0;i<array1.length;i++) {
				System.out.print(array1[i]);	
			}
			System.out.println();
		}
		sum = 0;
		for(int[] ele : array) {
			for(int ele1 : ele) {
				sum += ele1;
			}
		}
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}

}
