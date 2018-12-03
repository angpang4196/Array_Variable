package com.biz.arrays;

public class ScoreArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = 100;
		int[] intKor = new int[intNum];
		for(int i = 0; i < intNum; i++) {
			intKor[i] = makeScore();
			intKor[i] = ConstMethod.makeScore();
			System.out.println(intKor[i]);
		}
		System.out.println("=============================");
		int intSum = 0;
		for(int j= 0 ; j<intNum ;j++) {
			intSum += intKor[j];
		}
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + (float)intSum / intNum);
	}
	public static int makeScore() {
		return (int)(Math.random() * (100-50+1)) + 50;
	}

}
