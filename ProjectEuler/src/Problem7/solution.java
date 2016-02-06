
package Problem7;

public class solution {
	private int 기준값;
	
	public solution(int 기준값) {
		this.기준값 = 기준값; 
	}
	
	public long result(){
		long 소수 = 1;
		int count = 1;
		
		do{
			소수 ++;
			if(소수%2 == 0){
				continue;
			}else{
				for(int i = 2; i < 소수; i++){
					if(소수%i == 0){
						break;
					}else if(소수%i !=0 && i >= 소수/2){
						count++;
						break;
					}
				}
			}
		}while(count != 기준값);
		
		return 소수;
			
	}
	
	public static void main(String[] arg){
		solution solution = new solution(10001);
		System.out.println(solution.result());
	}
}
