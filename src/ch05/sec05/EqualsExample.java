package ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {
		
//		java에서 문자열 리터럴로 초기생성할 경우,  값은 같은 객체의 주소를 참조하도록 설계되어 있다.
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이  같음");
		}

		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이  같음");
		}
	}
}
