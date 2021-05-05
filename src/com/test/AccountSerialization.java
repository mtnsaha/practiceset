package com.test;

import java.io.*;

public class AccountSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account ac= new Account();
        FileOutputStream fileOutputStream= new FileOutputStream("abc.ser");
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(ac);


        FileInputStream fis= new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account ac2=(Account) ois.readObject();

        System.out.println("the user name is: "+ac2.username+" and passward is :"+ ac2.passward);

    }




}
