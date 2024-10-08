package observerPattern02;

public class TwoDisplay implements Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public TwoDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        this.pressure = this.weatherData.getPressure();
        display();
    }

    public void display() {
        System.out.println("Two Display: degree = " + temperature + "F huminity = " + humidity + "% and presure = " + pressure);
    }

}
