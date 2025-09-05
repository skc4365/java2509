package ch04.sec08;

public class ContinueExample {
	
//	오류가 생기면 JVM에 일임해라... public이어야함 JVM접근이 가능함.
	public static void main(String[] args) throws Exception {
		
		for(int i=1; i<=10; i++) {
			
			if(i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
