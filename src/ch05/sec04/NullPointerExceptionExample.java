package ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		
		int[] intArray = null;
//		
		//intArray[0] = 10;	 //NullPointerException

		String str = null;
//		System.out.println("총 문자수: " + str.length() );	  //NullPointerException
		
//		null에 대한 예외처리
		if(str != null)
			System.out.println("총 문자수: " + str.length() );
		else
			System.out.println("null 이예용~");
	}
}



