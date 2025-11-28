import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class City {
    String cityName;
    String RED = "\u001B[31m";
    String YELLOW = "\u001B[33m";
    String NC = "\u001B[0m";

    public City(String cityName) {
        this.cityName = cityName;
    }

    public ZoneId getZoneId() {
        try {
            List<String> possibleZones = ZoneId.getAvailableZoneIds().stream()
                .filter(zoneId -> zoneId.endsWith("/" + cityName))
                .collect(Collectors.toList());

            if (!possibleZones.isEmpty()) {
                return ZoneId.of(possibleZones.get(0));
            }
            else {
                throw new IllegalArgumentException(
                        YELLOW
                        + "The time zone for the city "
                        + cityName
                        + " not found"
                        + NC);
            }
        } catch (Exception e) {
            System.out.println(RED + "ERROR: "+ NC + e.getMessage());
            return null;
        }
    }

    public String getCurrentTime() {
        return ZonedDateTime.now(getZoneId())
            .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public String getCurrentDate() {
        return ZonedDateTime.now(getZoneId())
            .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
     
