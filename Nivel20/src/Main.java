public class Main {
    public static void main(String[] args) {
        System.out.println(Seasons.Temporada.WINTER);
        System.out.println(Seasons.Temporada.SPRING);
        System.out.println(Seasons.Temporada.SUMMER);
        System.out.println(Seasons.Temporada.AUTUMN);
    }

    class Seasons {
        public enum Temporada {
            WINTER,
            SPRING,
            SUMMER,
            AUTUMN
        }
    }
}