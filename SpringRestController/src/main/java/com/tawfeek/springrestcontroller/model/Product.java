package com.tawfeek.springrestcontroller.model;

public class Product {
    private long id;
    private String name;
    public Product(long id,String name){
        this.id=id;
        this.name=name;
    }
    public long getId(){
        return id;
    }
    public String gitName(){
        return name;
    }

    public void setId(long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return "Product {"+
                "id='" +id +"'"+
                ", name='"+name+"'"+'}';
    }
}
