package method;

import java.util.Arrays;

//2차 원시배열
public class method10 {
	public static void main(String[] args) {
		method10_arr ma = new method10_arr();
		//ma.arr();
		ma.arr2();
	}
}
/*
 int data[][][] = {
 	{
 		{10,20,30},
 		{10,20,30}
 	},
 	{ 
	 	{10,20,30},
	 	{10,20,30}
 	}
  };
*/


class method10_arr{
	
	public void arr2() {
		int adata[][] = new int[2][2];	//2개의 그룹에 한 그룹당 2개의 데이터
		adata[0][0] = 50;		//그룹 및 노드 번호를 이용하여 데이터를 삽입
		adata[0][1] = 100;
		adata[1][0] = 1000;
		adata[1][1] = 5000;
		System.out.println(Arrays.deepToString(adata));
		int f,ff;
		for(f = 0; f < adata.length; f++) {	//그룹 갯수
			
			for(ff = 0; ff < adata[0].length; ff++) {	//데이터 노드 갯수
				System.out.println(adata[f][ff]);
			}
			
		}
		
	}
		
	public void arr() {
		String jtest[][] = {
				{"HTML","CSS","Java"},
				{"100","85","75"}
		};
		System.out.println(jtest[1][1]);
		System.out.println(jtest.length); //그룹갯수
		System.out.println(jtest[0].length); //해당 그룹에 데이터 갯수
		//Arrays.toString : 1차 배열에 한해서
		//Arrays.deepToString : 2차 배열 이상 적용하는 문자형태 배열 구초 출력 클래스
		System.out.println(Arrays.deepToString(jtest));
		System.out.println(Arrays.toString(jtest[0]));	//해당 그룹만 적용하여 문자형태 출력
	}
}