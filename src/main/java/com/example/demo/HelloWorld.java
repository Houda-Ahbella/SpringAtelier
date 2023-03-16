package com.example.demo;

import com.fasterxml.jackson.annotation.JsonTypeId;

public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println(message);
    }

}
