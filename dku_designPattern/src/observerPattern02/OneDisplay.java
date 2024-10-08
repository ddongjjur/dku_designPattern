package observerPattern02;

public class OneDisplay implements Display {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public OneDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }


    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        display();
    }

    public void display() {
        System.out.println("One Display: degree = " + temperature + "F huminity = " + humidity + "%");
    }

}
