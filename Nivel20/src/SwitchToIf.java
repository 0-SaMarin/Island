public class SwitchToIf {
    public static void main(String[] args) {
        System.out.println(getTranslationOfDay("Tuesday"));
        System.out.println(getTranslationOfDay("Friday"));
        System.out.println(getTranslationOfDay("funday"));
    }

    public static String getTranslationOfDay(String day ){
        String pigLatin;
        if (day.equalsIgnoreCase("Monday")){
            pigLatin = "Ondaymay";
        } else if (day.equalsIgnoreCase("Tuesday")) {
            pigLatin = "Uesdaytay";
        } else if (day.equalsIgnoreCase("Wednesday")) {
            pigLatin = "Ednesdayway";
        } else if (day.equalsIgnoreCase("Thursday")) {
            pigLatin = "Ursdaythay";
        } else if (day.equalsIgnoreCase( "Friday")) {
            pigLatin = "Idayfray";
        } else if (day.equalsIgnoreCase( "saturday")) {
            pigLatin = "Aturdaysay";
        } else if (day.equalsIgnoreCase( "sunday")) {
            pigLatin = "Undaysay";
        } else {
            pigLatin = "Invalid day of the week";
        }
        return pigLatin;
    }
}
