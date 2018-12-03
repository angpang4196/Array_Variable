package com.biz.arrays.chars;

public class StringChar03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String에 자주 문자열을 추가하고자 하는 경우
		// 사용하는 Upgrade된 String 클래스
		StringBuffer strBuffer = new StringBuffer();

		strBuffer.append("나는 자랑스러운 태극기 앞에");
		strBuffer.append(" 자유롭고 정의로운 대한민국의 무궁한 영광을 위하여");
		strBuffer.append(" 충성을 다 할 것을 굳게 다짐합니다.");

		System.out.println(strBuffer);

		// 일반 문자열로 변환
		// 보편적인 Java의 여러 기능들(Class, Method)에서 String형은 문제없이 사용이 가능하나
		// StringBuffer형은 사용하는 데 약간의 어려움이 있어서
		// 실제 사용상에서는 StringBuffer를 사용해서 문자열 합성을 만들어내고
		// 최종적으로 다시 String형으로 변환 시킨다음 사용하는 것이 편리하기때문에 변환한다.
		String strText = strBuffer.toString();

	}

}
