package org.example.domain.entities.book;
public class Book {
    private Integer id;
    private Integer edition;
    private Integer numberOfPages;
    private String name;
    private String authors;
    private String publisher;
    private String isbn;

    private BookGender gender;
    private BookStatus status;

    public Book() {
        status = BookStatus.AVAILABLE;
    }

    public Book(Integer edition, Integer numberOfPages, String name, String authors, String publisher, String isbn, BookGender gender, BookStatus status) {
        this(null, edition, numberOfPages, name, authors, publisher, isbn, gender, status);
    }

    public Book(Integer id, Integer edition, Integer numberOfPages, String name, String authors, String publisher, String isbn, BookGender gender, BookStatus status) {
        this.id = id;
        this.edition = edition;
        this.numberOfPages = numberOfPages;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.isbn = isbn;
        this.gender = gender;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BookGender getGender() {
        return gender;
    }

    public void setGender(BookGender gender) {
        this.gender = gender;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("id=").append(id);
        sb.append(", edition=").append(edition);
        sb.append(", numberOfPages=").append(numberOfPages);
        sb.append(", name='").append(name).append('\'');
        sb.append(", authors='").append(authors).append('\'');
        sb.append(", publisher='").append(publisher).append('\'');
        sb.append(", Isbn='").append(isbn).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
