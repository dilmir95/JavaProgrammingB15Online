package CodingBat;

public interface Readable {
     void readBook();
    void setBookmark();



}
abstract class book implements Readable{

}
abstract class Ebook extends book{
    public void readBook(){

    }
}
