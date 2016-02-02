/*
 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
- 두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
- 세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
 */
package Problem4;

public class solution {
//	private long 기준값;
	
//	public solution(long 기준값) {
//		this.기준값 = 기준값; 
//	}
	
	public static String reverse(String source){
	       String reverse="";
	        int l = source.length();
	        for(int i = l-1; i>=0; i--){
	              reverse = reverse+source.charAt(i);
	         }
	    return reverse;
	}

	public long result(){
		
		int first = 999;
		int second = 999;
		
		String temp;
		String left;
		String right;
		
		int multi = 0;
		
		for(int i = first; i > 99 ; i--){
			for(int j = second; j > 99 ; j--){
				multi = first * second;
				temp =  Integer.toString(multi);
				left = temp.substring(0, 3);
				right = temp.substring(4, 3);
				right = reverse(right);
			}
		}
		
		
		
	}
	
	public static void main(String[] arg){
		solution solution = new solution();
//		System.out.println(solution.result());
	}
}
