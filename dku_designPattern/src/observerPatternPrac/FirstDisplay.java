package observerPatternPrac;

public class FirstDisplay implements ObserverPrac {
	
	private double temperature;
	private double humidity;
	private double pressure;
	
	private WeatherDataPrac weatherDataPrac;
	
	public FirstDisplay(WeatherDataPrac weatherDataPrac) {
		this.weatherDataPrac = weatherDataPrac;
	}
	
	public void update() {
		this.temperature = this.weatherDataPrac.getTemperature();
		this.humidity = this.weatherDataPrac.getHumidity();
		this.pressure = this.weatherDataPrac.getPressure();
		display();
	}
	
	public void display() {
		System.out.println("First Display");
		System.out.println("temperature : " + temperature);
		System.out.println("humidity : " + humidity);
		System.out.println("pressure" + pressure);
		System.out.println();
	}
}
