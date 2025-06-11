import java.util.Date;

public class Book {
    private String title;
    private String author;
    private Date publicationDate;
    private String genre;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString(){
        return "\nTitulo: " + getTitle() + " \nAutor: " + getAuthor() + " \nFecha de publicacion: " + getPublicationDate() + " \nGenero: " + getGenre() + "";
    }
}
