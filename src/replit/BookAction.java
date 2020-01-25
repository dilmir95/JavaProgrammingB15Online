package replit;

public class BookAction {
    public static void main(String[] args) {


        Book b1 = new Book("Scarface", "Dilmurod Yakubov");

        b1.addChapter("Moving to Miami",40);
        b1.addChapter("Getting Rich",60);
        b1.addChapter("Taking Over",20);


        System.out.println(b1.tableOfContents);
        System.out.println(b1.getPages());

        System.out.println(b1.toString());

    }
}