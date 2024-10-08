package observerPattern02;

public class FourDisplay implements Display {

    private float temperature;

    private WeatherData weatherData;

    public FourDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void update() {
        this.temperature = this.weatherData.getTemperature();
        display();
    }

    public void display() {
        System.out.println("Four Display: degree = " + temperature + "F");
    }
}
