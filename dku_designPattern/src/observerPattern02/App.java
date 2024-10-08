package observerPattern02;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, observer!!");

        WeatherData weatherData = new WeatherData();
        Display oneDisplay = new OneDisplay(weatherData);
        Display twoDisplay = new TwoDisplay(weatherData);
        Display threeDisplay = new ThreeDisplay(weatherData);
        Display FourDisplay = new FourDisplay(weatherData);

        weatherData.attach(oneDisplay);
        weatherData.attach(twoDisplay);
        weatherData.attach(threeDisplay);
        weatherData.attach(FourDisplay);
        weatherData.setMeasurements(80, 65, 30.4f);

        weatherData.detach(threeDisplay);
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
