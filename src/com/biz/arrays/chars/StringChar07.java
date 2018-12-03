package com.biz.arrays.chars;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class StringChar07 {

	/*
	 * 문자열 strNation을 char배열로 바꾼후 문자열을 거꾸로 콘솔에 출력하시오
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNation = "Republic of Korea";

		char[] charNation = strNation.toCharArray();
		char[] charR = new char[charNation.length];
		int intCount = charNation.length;

		for (int i = 0; i < intCount; i++) {
			int intR = intCount - i - 1;
			charR[intR] = charNation[i];
		}
		
		for(char c : charNation) {
			charR[--intCount] = c;
		}
		
		for(int i : charR) {
			System.out.print((char)i + ", ");
		}
		System.out.println();
		
		// 역순이 된 문자열로 재 생성
		String strRNation = new String(charR, 0, charR.length);
		System.out.print(strRNation);

	}

}
