package OfficeHour;

public class Book {

    String title, author;
    String tableOfContents = "";
    int nextPage=1;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void addChapter(String chapterName, int chapterPageNum){
        tableOfContents+= "\n"+chapterName+"..."+nextPage;
        nextPage +=chapterPageNum;
    }
    public int getPages(){
        return nextPage;
    }
    public String getTableOfContents(){
        return tableOfContents;
    }
    public String toString(){
        return title+"\n"+author;
    }
}
