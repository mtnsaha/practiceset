package com.test;

import java.io.Serializable;

public class Account implements Serializable {

    String username = "mithun";
    transient String passward ="saha";

    void accountTest(){

        System.out.println("inside account test");
    }
}
