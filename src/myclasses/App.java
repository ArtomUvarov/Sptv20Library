/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Author;
import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author user
 */
public class App {
    public void run(){
        //System.out.println("hi");
        Book book = new Book();
        book.setBookName("voina i mir");
        book.setReleaseYear(1828);
        Author[] authors = new Author[1];
        Author author = new Author();
        author.setFirstName("Lev");
        author.setLastName("Tolstoy");
        author.setBirthYear(1828);
        authors[0] = author;
        book.setAuthors(authors);
        System.out.printf("Создана книга %s, автор: %s %s, год издания: %d%n",
                book.getBookName(),
                book.getAuthors()[0].getFirstName(),
                book.getAuthors()[0].getLastName(),
                book.getReleaseYear()
                );
        Reader reader = new Reader();
        reader.setFirstname("Ivan");
        reader.setLastname("Ivanov");
        reader.setPhone("555235");
        System.out.printf("Создан пользователь: %s %s, с телефом %s%n",
                reader.getFirstname(),
                reader.getLastname(),
                reader.getPhone()
             );
        History history = new History();
        history.setBook(book);
        history.setReader(reader);
        Calendar c = new GregorianCalendar();
        history.setGiveBook(c.getTime());
        System.out.printf("Читатель %s %s взял читать книгу \"%s\"%n,%s"
                ,history.getReader().getFirstname()
                ,history.getReader().getLastname()
                ,history.getBook().getBookName()
                ,history.getGiveBook()
        );
        c = new GregorianCalendar();
        history.setReturnBook(c.getTime());
        System.out.printf("%n читатель %s %s вернул книгу \"%s\", %s%n"
                ,history.getReader().getFirstname()
                ,history.getReader().getLastname()
                ,history.getBook().getBookName()
                ,history.getGiveBook()
        );
        
        
        
        
        
        
        
                
        
    }
    
}
