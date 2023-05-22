package com.panda.bookstore.resource.v2;

import com.panda.bookstore.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.*;

@Path("v2/books")

public class BookResource {

    private List<Book> list = new ArrayList<>();

    public BookResource() {
        list.add(new Book("1", "Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", 1, 2022));
        list.add(new Book("2", "Trên đường băng", "Tony", 1, 2022));
        list.add(new Book("3", "Đời ngắn đừng ngủ dài", "Nguyễn Văn A", 1, 2022));
        list.add(new Book("4", "Tuổi trẻ đáng giá bao nhiêu", "Rossie", 1, 2022));

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks() {
        return list;
    }

    //đưa tham số trên URL để map vào biến isbn trong hàm
    //hàm có isbn hàm biết cách lọc
    //api/v2/books/1                path param tham số đưa trực tiếp vào đường dẫn API
    //api/v2/books?mã-số-sách=1     query param
    @Path("{masach}")       //"{}" truyền tham số 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getOne(@PathParam("masach") String isbn) {
        for (Book x : list) {
            if (x.getIsbn().equalsIgnoreCase(isbn)) {
                return x;
            }
        }
        return null;
    }
}
