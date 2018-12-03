package com.biz.arrays;

public class ScoreArray04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intMath = new int[100];
		for(int i = 0; i < intMath.length; i++) {
			intMath[i] = ConstMethod.makeScore();
		}
		
		// 위에서 생성한 intMath 배열의 값중에서 60이상인 값(if >= 60)이 나타나면 그 값만 console에 출력하라
		for(int i = 0 ; i < intMath.length; i++) {
			if(intMath[i] >= 60) {
				System.out.println(intMath[i]);
			}
		}
		System.out.println("========================");
		// 위에서 생성한 intMath 배열의 값중에서 80인상인 값이 나타나면 그 값이 위치한 index를 출력
		for(int i = 0 ; i < intMath.length; i++) {
			if(intMath[i] >= 80) {
				System.out.println("index : " + i);
			}
		}
		
		// 위에서 생성한 intMath 배열의 값중에서 80인상인 값이 나타나면 그 값들의 합을 계산하시오
		int intSum = 0;
		for(int i = 0; i < intMath.length; i ++) {
			if(intMath[i] >= 80) {
				intSum += intMath[i];
			}
			
		}
		System.out.println(intSum);
		
		// 위에서 생성한 intMath 배열의 값중에서 80인상인 값이 최초로 나타날 때 몇번째인지 출력하시오.
		int i = 0;
		for(i = 1; i < intMath.length; i ++) {
			if(intMath[i] >= 80) {
				break;
			}
		}
		System.out.println("최초로 80이상인 값은 " + i + "번째입니다.");
		System.out.println("값 : " + intMath[i]);
		
	}

}
