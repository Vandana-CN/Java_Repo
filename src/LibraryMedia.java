import sun.org.mozilla.javascript.internal.ast.ScriptNode;

import java.util.Scanner;

class Library
{
    public String video;
    public String book;
    public String newspaper;

    public Library(String videos, String books, String newspapers)
    {
        video = videos;
        book = books;
        newspaper = newspapers;
    }
    public void displayLibrary()
    {
        System.out.println("book = "+book+"\n"+"video = "+video+"\n"+"newspaper = "+newspaper);
    }
}

class GenericLibrary <T>
{
    T book, video, newspaper;

    public GenericLibrary(T book, T video, T newspaper)
    {
        this.book = book;
        this.video = video;
        this.newspaper = newspaper;
    }
    public void printGenericLibrary()
    {
        System.out.println("book = "+book+"\n"+"video = "+video+"\n"+"newspaper = "+newspaper);
    }
}

public class LibraryMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the media as Video, Book, Newspaper:");
        String video = sc.nextLine();
        String book = sc.nextLine();
        String newspaper = sc.nextLine();
        Library media1 = new Library(video,book, newspaper);
        System.out.println("Library has:");
        media1.displayLibrary();
        System.out.println();
        GenericLibrary<String> genericMedia = new GenericLibrary<>(video,book, newspaper);
        System.out.println("GenericLibrary has:");
        genericMedia.printGenericLibrary();
    }

}
