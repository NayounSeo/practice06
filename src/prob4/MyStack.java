package prob4;

public class MyStack implements Stack {
	private String[] buffer;
	private int capacity;
	private int top;

	public MyStack(int capacity) throws MyStackException {
		if (capacity <= 0) {
			throw new MyStackException("init stack capacity > 0");
		}
		this.capacity = capacity;
		this.top = 0;
		//생성하라구.....!!!!!
		this.buffer = new String[capacity];
		System.out.println(capacity);
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public void push(String str) throws RuntimeException {
		buffer[top] = str;
		top++;
	}

	public String pop() throws RuntimeException{
		//이미 top++ 해줬던 상태였다!!!!!!!!!@@@@@@@@@@@@@@@@@ 포인트
		String output = buffer[top-1];
		buffer[top-1] = null;
		top--;			
		System.out.println(buffer);
		return output;
	}
	
	public int size(){
		return top;	
	}
	
}
