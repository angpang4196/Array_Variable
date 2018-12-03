package com.biz.arrays.ext;

public class ArrayString04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strKorea = "대한민국우리나라만세";
		String[] arrKorea = strKorea.split("");       // 글자 단위로 split
		
		for(int i = 0 ; i < arrKorea.length; i++) {
			System.out.println(arrKorea[i]);
		}
		
		String strNum = "12309120591205980";
		String[] arrNum = strNum.split("");
		
		int intSum = 0;
		for(int i = 0 ; i < arrNum.length; i++) {
			intSum += Integer.valueOf(arrNum[i]);
		} 
		System.out.println(intSum);    // 숫자 하나 하나 split해서 그 숫자들을 모두 더한 값

	}

}
