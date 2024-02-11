import java.util.Scanner;

public class GoodWeather {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Give temperature in Fahrenheit: ");
		int temp=s.nextInt();
		System.out.println("Give weather condition: 1) clear, 2) cloudy, 3) rainy\n(type corresponding sl no)");
		int cond=s.nextInt();
		if (cond==3) {
			System.out.println("It is not good weather for a bike ride.");
		}
		else if (temp>=40 && temp<=100) {
			System.out.println("It is good weather for a bike ride.");
		}
		else {
			System.out.println("It is not good weather for a bike ride.");
		}
	}
}
