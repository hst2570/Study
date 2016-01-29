/*
 * 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
 */
package Problem1;

public class solution {
	private long 기준값;
	
	public solution(int 기준값) {
		this.기준값 = 기준값;
	}


	public long result(){
		long sum = 0;
		
		for(int i = 0 ; i<기준값 ; i++){
			if(i%3 == 0 || i%5 == 0){
				sum = sum + i;
			}
		}
		
		return sum;
	}
	
	
	public static void main(String[] arg){
		solution solution = new solution(1000);
		
		System.out.println(solution.result());
	}
}
