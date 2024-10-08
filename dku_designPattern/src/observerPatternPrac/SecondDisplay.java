package observerPatternPrac;

public class SecondDisplay implements ObserverPrac {

	private double temperature;
	private double pressure;
	private WeatherDataPrac weatherDataPrac;
	
	public SecondDisplay(WeatherDataPrac weatherDataPrac) {
		this.weatherDataPrac = weatherDataPrac;
	}

	public void update() {
		this.temperature = weatherDataPrac.getTemperature();
		this.pressure = weatherDataPrac.getPressure();
		display();
	}
	
	public void display() {
		System.out.println("Secound Display");
		System.out.println("temperature : " + temperature);
		System.out.println("pressure" + pressure);
		System.out.println();
	}
	

}
