/*
 * 600851475143의 소인수 중에서 가장 큰 수를 구하세요.
 */
package Problem3;

public class solution {
	private long 기준값;
	
	public solution(long 기준값) {
		this.기준값 = 기준값; 
	}

	public long result(){
		
		long 나눈값 = 기준값;
		int i = 2;
		
		while(i < 나눈값){
			if(나눈값%i == 0){
				for(int j = 2; j<i; j++){
					if(i%j == 0){
						break;
					}else if(i%j != 0 && j == i-1){
						나눈값 = 나눈값/i;
					}
				}
			}else{
				i++;
			}
		}
		
		return 나눈값;
	}
	
	public static void main(String[] arg){
		solution solution = new solution(600851475143L);
		System.out.println(solution.result());
	}
}
