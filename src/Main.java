public class Main {

    public static void main(String[] args) {
	// write your code here

        Person person = new Person("Dorota","Kowalska",Gender.WOMEN);
        Person person1 = new Person("Oskar","Kowalski",Gender.MEN);
        WeatherC weatherC = new WeatherC(21,Weather.RAIN);
        WeatherC weatherD = new WeatherC(45,Weather.SUN);



        System.out.println(person.getGender().isHasMakup());
        System.out.println(person1.getGender().isHasMustage());
        System.out.println(weatherC.getWeather().isSunshining());
        System.out.println(weatherD.getWeather().setLongDesc("Zła pogoda"));



    }
}
