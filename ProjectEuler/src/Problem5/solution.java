/*
 * 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수
 */
package Problem5;

public class solution {
	private int 기준값;
	
	public solution(int 기준값) {
		this.기준값 = 기준값; 
	}
	
	public int result(){
		
		int result = 1;
		boolean 판별값 = false;
		
		while(판별값 == false){
			result++;
			for(int i = 기준값; i > 0; i--){
				if(result%i == 0 && i==1){
					판별값 = true;
				}else if(result%i !=0){
					break;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] arg){
		solution solution = new solution(20);
		System.out.println(solution.result());
	}
}
