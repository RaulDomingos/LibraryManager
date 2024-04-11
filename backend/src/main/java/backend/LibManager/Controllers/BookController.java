package backend.LibManager.Controllers;

import backend.LibManager.Models.Book;
import backend.LibManager.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/api/books/getall")
    public List<Book> listAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/api/books/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookRepository.findById(id).orElseThrow(null);
    }

    @PostMapping("/api/books/create")
    public Book createBook(@Validated @RequestBody Book book) {
        return bookRepository.save(book);
    }
}
