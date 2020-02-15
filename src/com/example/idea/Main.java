package com.example.idea;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        Person personV2 = new Person("David", "Smith", 40);
        System.out.println(personV2);
        Gson gson = new Gson();
        String personJson = gson.toJson(personV2);
        System.out.println(personJson);
        String[] colors = new String[]{"Red", "Green", "Blue"};
        for (int i = 0; i < colors.length; i++) {
            System.out.println("The color is " + colors[i]);
        }
        System.out.println(gson.toJson(colors));

    }
}
