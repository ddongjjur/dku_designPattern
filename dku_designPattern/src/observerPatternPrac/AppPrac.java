package observerPatternPrac;

public class AppPrac {
	
	public static void main(String[] args) {
		System.out.println("Hello, ObserverPrac!!!!");
		System.out.println();
		
		WeatherDataPrac weatherDataPrac = new WeatherDataPrac();
		ObserverPrac firstDisplay = new FirstDisplay(weatherDataPrac);
		ObserverPrac secondDisplay = new SecondDisplay(weatherDataPrac);
		
		weatherDataPrac.attach(firstDisplay);
		weatherDataPrac.attach(secondDisplay);
		
		weatherDataPrac.setMeasuerMents(80, 65, 30.45);
	}

}
