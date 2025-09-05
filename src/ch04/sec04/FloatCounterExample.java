package ch04.sec04;

public class FloatCounterExample {
	public static void main(String[] args) {

//		float : 부동소숫점:소숫점의 위치가 고정되어 있지 않고, 둥둥 떠다니는 느낌.
//		반드시 0.1씩만 증가는 것이 아니고, 아주 조금씩 더 큰 숫자가 생성된다.

//		*** 정확한(미세한표현) 소숫점 연산에는 double을 사용하자 ***
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}
}
