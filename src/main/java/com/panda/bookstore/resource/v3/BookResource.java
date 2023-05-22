package com.panda.bookstore.resource.v3;

import com.panda.bookstore.dao.BookDAO;
import com.panda.bookstore.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("v3/books")
public class BookResource {
    
    private BookDAO dao = BookDAO.getInstance();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAll(){
        return dao.getAll();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{masach}")
    public Book getOne(@PathParam("masach") String isbn){
        return dao.getOne(isbn);
    }
}
