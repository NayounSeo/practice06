package prob3;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발 될 수 있습니다.";
		
		//String.indexOf(s) 메소드를 사용!
		//찾는 문자열이 없다면 -1을 반환한다.
		if(str.indexOf("자바") != -1) {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			System.out.println("->"+str.replaceAll("자바", "Java"));
		}
	}

}
