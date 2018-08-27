package impl;

import model.BookModel;
import api.BooksApi;

import java.util.List;

import static java.util.Arrays.asList;


public class BooksApiImpl implements BooksApi {

    public List<BookModel> getBooks() {
        return asList(
                new BookModel("Gone with the wind", 890),
                new BookModel("Pure people", 676)
        );
    }
}
