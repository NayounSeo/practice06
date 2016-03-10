package prob7;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put( "blue", 85 );
		map.put( "red", 96 );
		map.put( "black", 92 );
		
		String name = null;   // 최고 점수를 받은 아이디 저장
		int maxScore = 0;  // 최고 점수
		int totalScore = 0;   // 점수 합계
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String s = it.next();
//			System.out.println("key ; "+s+", data : "+map.get(s));  //오호 데이터값은 이렇게 호출
			totalScore += map.get(s);
			if (map.get(s) > maxScore) {
				maxScore = map.get(s);
				name = s;
			}
		}
		System.out.println("평균 점수 : "+totalScore/3);
		System.out.println("최고 점수 : "+maxScore);
		System.out.println("최고 점수를 받은 아이디 : "+name);
	}
}
