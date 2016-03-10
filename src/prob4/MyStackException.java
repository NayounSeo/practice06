package prob4;

public class MyStackException extends RuntimeException {
	//��....!  RuntimeException���� �ϸ� Unchecked Exception�� �Ǿ ���� ����.....!!!!
	public MyStackException() {
		super("MyStackException");
	}
	public MyStackException(String msg) {
		super(msg);
	}
}
