package ch05.sec05;

public class IndexOfContainsExample {
	public static void main(String[] args) {

		String subject = "자바 프로그래밍";

//		indexOf 위치값
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);

//		substring 문자값
		String substring = subject.substring(location);
		System.out.println(substring);

		location = subject.indexOf("자바");
//		subject.indexOf("자바"); 찾지못하면 -1을 리턴함.
		if (location != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}

		boolean result = subject.contains("자바");
		if (result) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}
}
