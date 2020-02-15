package com.example.idea;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("David", "Smith", 40);
        System.out.println(person);
        Gson gson = new Gson();
        String personJson = gson.toJson(person);
        System.out.println(personJson);
        String[] colors = new String[]{"Red", "Green", "Blue"};
        for (int i = 0; i < colors.length; i++) {
            System.out.println("The color is " + colors[i]);
        }
        System.out.println(gson.toJson(colors));

    }
}
