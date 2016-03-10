package prob6;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private Board board;
	private List<Board> list;
	
	public BoardDao() {
		List<Board> list = new ArrayList<Board>();
		Board b1 = new Board();
		b1.setTitle("제목1");
		b1.setContent("내용1");
		Board b2 = new Board();
		b2.setTitle("제목2");
		b2.setContent("내용2");
		Board b3 = new Board();
		b3.setTitle("제목3");
		b3.setContent("내용3");
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		this.list = list;
	}
	
	public List<Board> getBoardList() {
		return list;
	}

}
