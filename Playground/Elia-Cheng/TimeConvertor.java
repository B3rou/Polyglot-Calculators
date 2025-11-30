import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

public class TimeConvertor{
    public static String get_Timezone(String input){ // get IANA time zones
        Set<String> timezone = ZoneId.getAvailableZoneIds();
        String result = "";

        input = input.replace(" ", "_"); // allow user friendly search
        // match time zones
        if (timezone.contains(input)){ // exact match
            result = input;
        }
        else{
            String fuzzy_match = input.toLowerCase();

            for (String zone : timezone){ // loop through each available time zone
                if(zone.equalsIgnoreCase(input) || zone.toLowerCase().contains(fuzzy_match)){
                    result = zone;
                    break;
                }
            }

        }
        
        return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Get source timezone
        System.out.println("Enter a timezone: ");
        String input_tz = scan.nextLine().trim();

        String source = get_Timezone(input_tz);

        if (source == null || source.isEmpty()){ // timezone not found
            System.out.println("ERROR: No timezone found");
            return;
        }

        // Get the source timezone's current time in UTC
        ZonedDateTime source_currTime = ZonedDateTime.now(ZoneId.of(source));
        ZonedDateTime source_UTC = source_currTime.withZoneSameInstant(ZoneOffset.UTC);

        // Get target timezone
        System.out.println("Enter the timezone you want to convert to:");
        String output_tz = scan.nextLine().trim();

        String target = get_Timezone(output_tz);

        if (target == null || target.isEmpty()){ // timezone not found
            System.out.println("ERROR: No timezone found");
            return;
        }
        
        // Get the target timezone's time offset through UTC timezones
        ZonedDateTime target_time = source_UTC.withZoneSameInstant(ZoneId.of(target));

        DateTimeFormatter time_format = DateTimeFormatter.ofPattern("HH:mm MMMM-dd-yyyy");
        String formatted = target_time.format(time_format);
        System.out.println("It is " + formatted + " in " + target);
        
        return;
    }
}