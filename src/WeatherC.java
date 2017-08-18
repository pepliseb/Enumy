public class WeatherC {

    private int temp;
    private Weather weather;

    public WeatherC(int temp, Weather weather) {
        this.temp = temp;
        this.weather = weather;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
