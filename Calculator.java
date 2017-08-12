/**
Класс, реализует калькулятор
*/
public class Calculator {
	/**
	хранит результат вычисления
	*/
	private int result;
	
	/**
	  суммирует аргументы
	  @param params Аргументы суммирования
	*/
	public void add(int ... params) {
		for (Integer i: params) {
			result += i;
		}
	}
	
	/**
	  вычитает аргументы
	  @param params Аргументы вычитания
	*/
	public void subtract(int ... params) {
		for (Integer i: params) {
			result -= i;
		}
	}
	
	/**
	  умножает аргументы
	  @param params Аргументы умножения
	*/
	public void multiply(int ... params) {
		for (Integer i: params) {
			result *= i;
		}
	}
	
	/**
	  делит аргументы
	  @param params Аргументы деления
	*/
	public void division(int ... params) {
		for (Integer i: params) {
			result /= i;
		}
	}
	
	/**
	  Получить результат
	  @return Результат вычисления
	*/
	public int getResult() {
		return result;
	}
	
	/**
	  очистить результат вычисления
	*/
	public void cleanResult() {
		result = 0;
	}
	
}