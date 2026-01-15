
public class App {

    public static void main(String[] args) {

        var location1 = new Location();
        var location2 = new Location();
        var weatherUpdates = new WeatherUpdates();

        location1.addPropertyChangeListener(weatherUpdates);
        location2.addPropertyChangeListener(weatherUpdates);

        location1.setWeatherEvent("Risk of flooding");
        location2.setWeatherEvent("Risk of drought");

        location2.setWeatherEvent("this one is the new one for the location2");

        weatherUpdates.printUpdates();
    }

}
