public class Book {
   private String name;
   private Author author;
   private int dataIssue;

    public Book(String name, Author author, int dataIssue) {
        this.name = name;
        this.author = author;
        this.dataIssue = dataIssue;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author.getFirstName()+" "+this.author.getLostName();
    }
    public int getDataIssue() {
        return this.dataIssue;
    }

    public void setDataIssue(int dataIs ) {
        this.dataIssue=dataIs;
    }

}
