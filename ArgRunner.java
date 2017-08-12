/**
  Класс для запуска калькулятора
  Поддерживает ввод из параметров запуска
*/
public class ArgRunner {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		for(String str : args) {
			int n = Integer.valueOf(str);
			calc.add(n);
		}
		System.out.println("Result:" + calc.getResult());
		calc.cleanResult();
	}
}