package day52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookActions {


    public static void main(String[] args) {

        Book b1 = new AudioBook("Scrum","Dimka",4.5);
        Book b2 = new PaperBook("Selenium","Shoxsanam",4);
        Book b4 = new AudioBook("Sam Walton","Derrick",4.8);
        Book b5 = new AudioBook("Lord of rings","Maya",45.5);
        Book b6 = new AudioBook("Harry Potter","British lady",6.7);
        Book b7 = new PaperBook("Dogs","Dog owner",4);

        b1.displayBookInfo();
        b2.displayBookInfo();
        b4.showTableOfContent();
        int countOfAudiobook=0;
        int countOfPaperbook = 0;
        List<Book> bookList = new ArrayList<>(Arrays.asList(b1,b2,b4,b5,b6,b7));
        for(Book each: bookList){
            String className = each.getClass().getSimpleName();

            if(className.equals("PaperBook")){
                ++countOfPaperbook;
            }else if(className.equals("AudioBook")){
                countOfAudiobook++;
            }
        }


    }
}
