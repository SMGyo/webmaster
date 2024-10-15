package 서민교;

public class Array {

	public static void main(String[] args) {
		//2024.09.26 과제
		//1번
		int sum = 0;
		int max = 0;
		int min = 100;
		int[] ranNum = new int[10];
		for(int i=0;i<=9;i++) {
			ranNum[i] = (int)(Math.random()*100)+1;
			System.out.print(ranNum[i] + " ");
			sum += ranNum[i];
			if (max<ranNum[i]) {
				max=ranNum[i];
			}
			if (min>ranNum[i]) {
				min=ranNum[i];
			}
		}
		System.out.printf("\n배열의 합 : %d 최대값 : %d 최소값 : %d\n",sum,max,min);
//		2번
		int nNum[][] = {
				{1,2,3},
				{1,2},
				{1},
				{1,2,3}
		};
		for(int[] nNum1 : nNum) {
			for(int nNum2 : nNum1) {
		System.out.print(nNum2);
		}
			System.out.println();
		}
//		3번
		int count = 0;
		int[][] person = new int[3][10];
		for(int i=0 ; i<person.length ; i++) {
			for(int j=0 ; j<person[i].length;j++) {				
				person[i][j] = (int)(Math.random()*2);
				System.out.print(person[i][j]);
				if(person[i][j]==1) {
					count++;
				}
			}
			System.out.println();
		}
		System.out.printf("관객수는 %d 명입니다\n",count);
//		4번
		int[][] grade = new int[3][5];
		int student1 = 0;
		int student2 = 0;
		int student3 = 0;
		double avg1 = 0;
		double avg2 = 0;
		double avg3 = 0;
		for(int i=0; i<grade.length;i++) {
			for(int j=0; j<grade[i].length;j++) {
				grade[i][j] = (int)(Math.random()*51)+50;
				student1 += grade[i][j];
				student2 += grade[i][j];
				student3 += grade[i][j];
				avg1 = (double)student1/5;
				avg2 = (double)student2/5;
				avg3 = (double)student3/5;
				System.out.print(grade[i][j]);
			}
			System.out.println();
		}
		
		System.out.printf("1번 학생 평균 = %f\n",avg1);
		System.out.printf("2번 학생 평균 = %f\n",avg2);
		System.out.printf("3번 학생 평균 = %f\n",avg3);
		
		
	}//end main
}//end class
