/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.panda.bookstore.resource.v1;

import com.panda.bookstore.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
// là 1 endpoint
@Path("v1/books")       // ... api/v1/books đến đc class này
public class BookResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getABook(){
        return new Book("8935244878359", "Lớp học rùng rợn", "Emi", 1, 2022);
    }
    
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String sayHello(){
//        return "Hello and welcome to my store";
//    }
}
