import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
* Calculate city zone from city name
* 
* @version  0.1.0
* @since    28.11.2025
* @author   AlexandrAnatoliev
*/
public class City {
    String cityName;

    /**
    * Construct a City
    *
    * @param cityName City name in String 
    */
    public City(String cityName) {
        this.cityName = cityName;
    }

    /**
    * Calculate city time zone
    *
    * @throws   IllegalArgumentException If time zone not found
    * @throws   Exception If there are other errors
    * @return   ZoneId City time zone 
    *           null If error occurs  
    */
    public ZoneId getTimeZone() {
        try {
            List<String> possibleZones = ZoneId.getAvailableZoneIds().stream()
                .filter(zoneId -> zoneId.endsWith("/" + cityName))
                .collect(Collectors.toList());

            if (!possibleZones.isEmpty()) {
                return ZoneId.of(possibleZones.get(0));
            }
            else {
                throw new IllegalArgumentException(
                        Colors.YELLOW
                        + "The time zone for the city "
                        + cityName
                        + " not found"
                        + Colors.NOCOLOR);
            }
        } catch (Exception e) {
            System.out.println(
                    Colors.RED + "ERROR: " + Colors.NOCOLOR + e.getMessage());
            return null;
        }
    }

    /**
    * Calculate city current time
    *
    * @return String city current time in HH:mm:ss format
    */
    public String getCurrentTime() {
        return ZonedDateTime.now(getTimeZone())
            .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    /**
    * Calculate city current data
    *
    * @return String city current data in dd.MM.yyyy format 
    */
    public String getCurrentDate() {
        return ZonedDateTime.now(getTimeZone())
            .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
     
