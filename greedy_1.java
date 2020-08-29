package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class greedy_1 {
	public static void main(String[] args) {
		//p92 큰 수의 법칙 
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 전체 받을 수
		int m = scan.nextInt(); // 완성 문자열
		int k = scan.nextInt(); // 연속 가능 숫자
		int[] arr = new int[n];
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[arr.length-2]);
		
		
		while(m>0) {
			if(m>=k+1) {
			ans += arr[arr.length-1] * k;
			m -= k;
			ans += arr[arr.length-2] ;
			m -= 1;
			}
			else {
				ans += arr[arr.length-1] * m;
				m -= m;
			}
		}
		
		System.out.println(ans);
	}

}
