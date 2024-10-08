package observerPattern02;

public class ThreeDisplay implements Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public ThreeDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        this.pressure = this.weatherData.getPressure();
        display();
    }

    public void display() {
        System.out.println("Three Display: degree = " + temperature + "F huminity = " + humidity + "% and presure = " + pressure);
    }

}
