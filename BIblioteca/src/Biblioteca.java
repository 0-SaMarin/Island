import java.util.*;

public class Biblioteca {
    private ArrayList<Book> books = new ArrayList<>();
    public  void addBook(Book book){
        books.add(book);
        System.out.println("Libro añadido exitosamente" );
        System.out.println("Numero de libros en la Biblioteca: " + books.size());
    }

    public boolean removeBook(String title){
        boolean exists = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)){
                books.remove(i);
                exists = true;
            }
        }
        return exists;

    }

    public void printingAllBooks(){
        books.forEach(System.out::println);
    }

    public Book searchTitle(String title){
        boolean exists = false;
        Book searchedBook ;
        for (int i = 0; i < books.size(); i++) {

        }
    }

    public void filterByGenre(String genero){
        List<Book> listaDeGeneros = (List<Book>) books.stream().filter(book -> genero.equals(book.getGenre()));
        listaDeGeneros.forEach(System.out::println);
    }

    public void editBook(Book book){

    }
}
