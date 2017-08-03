public class Calculator {
	private int result;
	
	public void add(int ... params) {
		for (Integer i: params) {
			result += i;
		}
	}
	
	public int getResult() {
		return result;
	}
	
	public void cleanResult() {
		result = 0;
	}
	
}