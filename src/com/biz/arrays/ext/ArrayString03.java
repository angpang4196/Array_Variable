package com.biz.arrays.ext;

public class ArrayString03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arrG = {
		
				"001:홍길동:90:88:70:60:54",
				"002:이몽룡:91:89:72:61:53",
				"003:성춘향:92:87:74:63:57",
				"004:장보고:93:86:76:65:52",
				"005:임꺽정:94:85:78:67:51",
		};
		System.out.print("학번\t이름\t국어\t영어\t수학\t과학\t국사\t총점\t평균\n");
		for(int i = 0; i < arrG.length; i++) {
			String[] arrS = arrG[i].split(":");
			System.out.print(arrS[0] + "\t");
			System.out.print(arrS[1] + "\t");
			System.out.print(arrS[2] + "점\t");
			System.out.print(arrS[3] + "점\t");
			System.out.print(arrS[4] + "점\t");
			System.out.print(arrS[5] + "점\t");
			System.out.print(arrS[6] + "점\t");
			
			
			int intSum = 0;
			for(int j = 2; j < 6; j++) {
				intSum += Integer.valueOf(arrS[j]);
			}
			System.out.print(intSum + "점\t");
			float floatAvg = (float) intSum / 5;
			System.out.println(floatAvg+"점");
		}

	}

}
