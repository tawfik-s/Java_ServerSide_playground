package com.tawfeek.springrestcontroller;


import com.tawfeek.springrestcontroller.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class SignUpController {


    //attripute

    //localhost:8080/product?name=bike&id=1
    @GetMapping("/product")
    public Product createUsingParams(@RequestParam("id") long id, @RequestParam(value="name",required = false,defaultValue = "noName") String name){
        System.out.println("product name from using params example ===="+name);
        Product product=new Product(id,name);
        return product;
    }

    //localhost:8080/product/name/{name}/id/{id}
    @GetMapping("/product/name/{name}/id/{id}")
    public Product createUsingPathVariable(@PathVariable String name,@PathVariable long id){
        System.out.println("product name from using path variable example ===="+name);
        return new Product(id,name);
    }

    @PostMapping("/product")
    public Product createUsingBinding(@RequestBody Product product){
        System.out.println(product);
        return product;
    }





}
