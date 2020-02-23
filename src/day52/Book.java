package day52;

public abstract class Book implements KnowledgeBank {

    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public abstract void displayBookInfo();


}
class PaperBook extends  Book implements Readable{
    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Book info is, name:"+name+" author:"+author+" weight: "+weight);
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", weight=" + weight +
                '}';
    }
    @Override
    public void read(){
        System.out.println("reading a paper book");
    }

    @Override
    public void takeNote() {

        System.out.println("take note on paper book");
    }

    @Override
    public void showTableOfContent() {

        System.out.println(" show content on paper book ");
    }
}
class AudioBook extends Book{
    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Book info is, name:"+name+" author:"+author+" duration: "+duration);
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", duration=" + duration +
                '}';
    }
    public void listen(){
        System.out.println("listening to a audio book");
    }

    @Override
    public void takeNote() {

        System.out.println(" take note on audio book");
    }

    @Override
    public void showTableOfContent() {

        System.out.println("show content on audio book");
    }
}
