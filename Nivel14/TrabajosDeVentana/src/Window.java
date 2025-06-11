public class Window {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void printSize(){
        System.out.println("La altura de la ventana es de " + height +  "Cm");
        System.out.println("El ancho de la ventana es de " + width +  "Cm");
    }
}
