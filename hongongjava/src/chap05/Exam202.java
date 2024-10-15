package chap05;

import java.util.Arrays;

public class Exam202 {

	public static void main(String[] args) {
//		String args1 = Integer.parseInt(args)[1];
//		System.out.println(args1);
		//배열을 생성
		//배열을 이용하는 방법
		int[] scores = {83,90,87}; //배열 생성
		
		System.out.println("scores[0] : " + scores[0]); //배열의 첫번째 출력
		System.out.println("scores[1] : " + scores[1]); //배열의 두번째 출력
		System.out.println("scores[2] : " + scores[2]); //배열의 세번째 출력
		
		int sum = 0; // 합 저장할 변수 생성
		for(int i=0; i<scores.length;i++) { //배열의 길이 만큼 반복하게 설정
			sum += scores[i]; //스코어를 sum에 +
		}
		System.out.println("총합 : " + sum);//합출력
		double avg = (double) sum / scores.length;
		System.out.printf("평균 %.2f\n", avg);//평균값 출력
		//배열에 1에서 100까지의 임의의 수 10개를 저장
		//배열의 합과 최대값, 최소값을 구하세요.
		int[] sSu1 = new int[10];
		for (int i = 0; i<sSu1.length ; i++){
			int nNum = (int)(Math.random()*100)+1;
			sSu1[i]+=nNum;
		
		}
		int max = sSu1[0] ;
		int min = 100 ;
		sum = sSu1[0];
		avg = sSu1[0];
		for(int i = 0;i<sSu1.length ; i++) {
			sum += sSu1[i];
			avg = (double)sum/sSu1.length;
				if(max<sSu1[i]) {
					max = sSu1[i];
				}else if(min>sSu1[i]) {
					min = sSu1[i];
				}
				
			}
		System.out.printf("합 : %d 평균 : %.1f 최대값 : %d 최소값 : %d\n",sum,avg,max,min);
		
		//수업
		int[] nums = new int[10];
		for(int i=0; i<nums.length;i++) {
			int rNum = (int)(Math.random()*100)+1;
			nums[i] = rNum;
		}
		
		System.out.println(nums);
		System.out.println(Arrays.toString(nums));
		
		sum = 0;
		max = 0 ;
		min = 100 ;
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
			sum += nums[i];
			if(max < nums[i]) max = nums[i];
			if(min > nums[i]) min = nums[i];
		}
		System.out.println();
		avg = sum / (double)nums.length;
		System.out.printf("sum = %d avg = %.1f max = %d min = %d",sum,avg,max,min);
	}//end main

}//end class
