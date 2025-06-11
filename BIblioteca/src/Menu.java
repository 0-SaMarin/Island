import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    static Scanner scan;
    public static void callingMenu() throws ParseException {
        scan = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        boolean isExit = false;

        while (!isExit){
            System.out.println("Hola, bienvenido/a, a la bilioteca, porfavor eliga una opcion");
            System.out.println("opcion 1: Añadir un libro " +
                    "\nopcion 2: Buscar un libro " +
                    "\nopcion 3: Eliminar un libro " +
                    "\nopcion 4: Listar todos los libros " +
                    "\nopcion 5: Filtar los libros por genero " +
                    "\nopcion 6: Modificar un libro" +
                    "\nopcion 7: Salir de la biblioteca");
            try {
                int optionAnswer = scan.nextInt();
                switch (optionAnswer) {
                    case 1:
                        scan = new Scanner(System.in);
                        Book bookInput = new Book();
                        System.out.println("Porfavor ingrese las especificaciones de su libro");
                        System.out.println("Titulo: ");
                        bookInput.setTitle(scan.nextLine());
                        System.out.println("Autor: ");
                        bookInput.setAuthor(scan.nextLine());
                        System.out.println("Fecha de publicacion: ");
                        String stringDate = scan.nextLine();
                        DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                        Date date = format.parse(stringDate);
                        bookInput.setPublicationDate(date);
                        System.out.println("Genero: ");
                        bookInput.setGenre(scan.nextLine());
                        biblioteca.addBook(bookInput);
                        break;

                    case 2:
                        scan = new Scanner(System.in);
                        System.out.println("Porfavor ingrese el titulo del libro que desea buscar");
                        String title = scan.nextLine();
                        Book bookBuscado = biblioteca.searchTitle(title);
                        System.out.println(bookBuscado);
                        break;

                    case 3:
                        scan = new Scanner(System.in);
                        System.out.println("Porfavor ingrese el titulo del libro que desea eliminar");
                        boolean exists = biblioteca.removeBook(scan.nextLine());
                        if(exists){
                            System.out.println("El libro ha sido eliminado. ");
                        }else{
                            System.out.println("El titulo del libro no ha sido encontrado intentelo otra vez. ");
                        }

                    case 4:
                        System.out.println("Mostrando toda la lista de libros");
                        biblioteca.printingAllBooks();
                        break;

                    case 5:
                        scan = new Scanner(System.in);
                        System.out.println("Porfavor ingrese el genero del libro que desesa filtrar");
                        biblioteca.filterByGenre(scan.nextLine());
                        break;

                    case 6:
                        scan = new Scanner(System.in);
                        System.out.println("Porfavor ingrese el titulo del libro que desea modificar");

                    case 7:
                        System.out.println("Saliendo de la biblioteca. ¡Esperamos que vuelvas pronto!");
                        isExit = true;
                }
            } catch (InputMismatchException exception) {
                System.out.println("No ha introducido una de las opciones, por favor intentelo de nuevo.");
                isExit = true;
                callingMenu();
            }
        }
    }
}
