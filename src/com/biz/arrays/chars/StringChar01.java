package com.biz.arrays.chars;

public class StringChar01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strText = "나는 자랑스러운 태극기 앞에 자유롭고 정의로운" 
		               + " 대한민국의 무궁한 영광을 위하여 충성을 다 할 것을" 
				       + " 굳게 다짐합니다.";

		int lenText = strText.length();
		System.out.println(lenText); // 64

		String[] strSpace = strText.split(" "); // 빈 칸을 제외한 문장
		String[] strChar = strText.split("");

		System.out.println(strText);

		// 배열은 정수형 변수를 사용해서 내용을 읽기 쓰기 가능하며
		for (int i = 0; i < strSpace.length; i++) {
			System.out.print(strSpace[i]);            // =>> i : 주소(배열 첨자)
		}                                             // 첨자 : 정수, 정수형 배열

		System.out.println();

		// 직접 정수를 사용해서 내용을 읽기 쓰기 실행한다
		System.out.println(strSpace[0]);
		System.out.println(strSpace[1]);
		System.out.println(strSpace[2]);
		System.out.println(strSpace[3]);

		for (String s : strSpace) {
			System.out.println(s);
		}

	}

}
