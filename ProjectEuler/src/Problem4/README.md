## 세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?

### 설명
- 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
- 두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
- 세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?

### 풀이

- 999*999부터 하나씩 줄여나가는 방식으로 제작한다.
- 999*999 = 998,001 이다.
- 결과값의 1~3번째, 6~4번째를 문자열로 편집해 값이 같은지 비교한다.
```java
	for(int i = first; i > 99 ; i--){
		for(int j = second; j > 99 ; j--){
			multi = i * j;
			if(multi < 100000){
				break;
			}else{
				temp =  Integer.toString(multi);
				left = temp.substring(0, 3);
				right = temp.substring(3);
				right = reverse(right);
				
				int tmp1 = Integer.parseInt(left);
				int tmp2 = Integer.parseInt(right);
				
				if(tmp1 == tmp2 && result < multi){
					result = multi;
				}
			}
		}
	}
```

### 정답 : 906609