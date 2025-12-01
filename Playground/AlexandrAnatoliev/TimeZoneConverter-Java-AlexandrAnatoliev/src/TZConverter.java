/**
* Command-line utility to calculate time zone of city
*
* @version  0.1.0
* @since    28.11.2025
* @author   AlexandrAnatoliev
*/
public class TZConverter {
    /**
    * Main method that handles command-line arguments and calculates
    *   time, date and time zone of city.
    *
    * @param args       Command-line arguments in the format:
    *                   [CityName]
    *        Example:   Moscow 
    */
    public static void main(String args[]) {
        if (args.length > 0) {
            String cityName = args[0];
            City city = new City(cityName);
            System.out.println("The time in "+ cityName + " is "
                    + city.getCurrentTime() + " on " + city.getCurrentDate()
                    + " and its time zone is " + city.getTimeZone());
        } else {
            System.out.println("No arguments");
            System.out.println("Example:");
            System.out.println(Colors.YELLOW + "java TZConverter Moscow");
            System.out.println("java -cp bin/ TZConverter Moscow"
                    + Colors.NOCOLOR);
            return;
        }
    }
}
