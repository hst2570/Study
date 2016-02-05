/*
 * 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수
 */
package Problem6;

public class solution {
	private int 기준값;
	
	public solution(int 기준값) {
		this.기준값 = 기준값; 
	}
	
	public long result(){
		long 제곱의합 = 0;
		long 합의제곱 = 0;
		long temp=0;
		long 차 = 0;
		
		//제곱의 합
		for(int i = 1; i <= 기준값; i++){
			제곱의합 = i*i + 제곱의합;
		}
		
		//합의 제곱
		for(int i = 1; i <= 기준값; i++){
			temp = temp + i;
		}
		
		합의제곱 = temp * temp;
		
		차 = 합의제곱 - 제곱의합;
		
		return 차;
	}
	
	public static void main(String[] arg){
		solution solution = new solution(100);
		System.out.println(solution.result());
	}
}
