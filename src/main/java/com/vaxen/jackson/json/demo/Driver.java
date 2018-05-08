package com.vaxen.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {

        //From a json acces to the setter of an object and print the to string
        try {
            // Create object mapper
            ObjectMapper mapper = new ObjectMapper();

            Student theSecondStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

            System.out.println(theSecondStudent.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
