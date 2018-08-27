package api;

import model.BookModel;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.util.List;

public interface BooksApi {

    @GET
    @Produces("application/json")
    List<BookModel> getBooks();
}
