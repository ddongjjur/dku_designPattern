package observerPatternPrac;

public class WeatherDataPrac extends Subject{
	
	private double temperature;
	private double humidity;
	private double pressure;
	
	public void measurementChanged() {
		Mynotify();
	}
	
	public void setMeasuerMents(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
		measurementChanged();
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
		measurementChanged();
	}
	
	public void setPressure(double pressure) {
		this.pressure = pressure;
		measurementChanged();
	}

	public double getTemperature() {
		return temperature;
	}


	public double getHumidity() {
		return humidity;
	}


	public double getPressure() {
		return pressure;
	}

}
