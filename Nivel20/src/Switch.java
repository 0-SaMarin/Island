public class Switch {
    public static void main(String[] args) {
        System.out.println(getMonthByIndex(1));
    }

    public static String getMonthByIndex(int month){
        String monthString;
        switch (month) {
            case 1:
                monthString = "Enero";
                break;
            case 2:
                monthString = "Febrero";
                break;
            case 3:
                monthString = "Marzo";
                break;
            case 4:
                monthString = "Abril";
                break;
            case 5:
                monthString = "Puede";
                break;
            case 6:
                monthString = "Junio";
                break;
            case 7:
                monthString = "Julio";
                break;
            case 8:
                monthString = "Agosto";
                break;
            case 9:
                monthString = "Septiembre";
                break;
            case 10:
                monthString = "Octubre";
                break;
            case 11:
                monthString = "Noviembre";
                break;
            case 12:
                monthString = "Diciembre";
                break;
            default:
                monthString = "Mes inválido";
                break;
        }
        return monthString;
    }
}
