import java.math.BigDecimal;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

public class Book {
 private List<String> paragraphs;
 private List<String> images;
 private List<String> tables;
 private String name;

 public Book (String name){
    this.name = name;
    paragraphs = new ArrayList<>();
    images = new ArrayList<>();
    tables = new ArrayList<>();
 }

 public void createNewParagraph( String a){
        paragraphs.add(a);
 }
    public void createNewImage( String a){
        images.add(a);
    }

    public void createNewTable(String a){
        tables.add(a);
    }
public void print() {
    System.out.println("Paragraphs:");
    for(String p: paragraphs) {
        System.out.println(p);
    }

    System.out.println("Images:");
    for(String i: images) {
        System.out.println(i);
    }

    System.out.println("Tables:");
    for(String t: tables) {
        System.out.println(t);
    }
 }
}
