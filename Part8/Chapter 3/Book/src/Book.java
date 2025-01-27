public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, String content, int published) {
        this.name = name;
        this.content = content;
        this.published = published;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public int getPublished() {
        return published;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublished(int year) {
        this.published = year;
    }

    public boolean equals(Object comparedObject) {

        if (this == comparedObject) {
            return true;
        }

        if (!(comparedObject instanceof Book)) {
            return false;
        }

        Book comparedBook = (Book) comparedObject;

        return this.name.equals(comparedBook.name) && this.published == comparedBook.published;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

}
