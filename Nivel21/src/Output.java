public class Output {

    public static final String OUTPUT_FORMAT = "El método %s fue llamado en la línea %d de la %s clase en el archivo %s.\n";

    public static void main(String[] args) {
        makeScrewDriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace){
        for (StackTraceElement element : stackTrace) {
            System.out.printf(OUTPUT_FORMAT, element.getMethodName(), element.getLineNumber(), element.getClassName(), element.getFileName());
        }
    }

    static void makeScrewDriver(){
        addJuice();
    }

    static void addJuice(){
        addVodka();
    }

    static void addVodka(){
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
