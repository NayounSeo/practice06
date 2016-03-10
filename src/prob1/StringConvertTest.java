package prob1;

public class StringConvertTest {

	public static void main(String[] args) {
		String strData1 = "200";
		int intData2 = 150;
		
		int intData_1 = Integer.parseInt(strData1);
		String strData_2 = String.valueOf(intData2);
		
		System.out.println( "결과:" + intData_1 + "," + strData_2 );
	}

}
