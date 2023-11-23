package org.example;

import com.github.javafaker.Faker;
public class TestClass {
    public static void main(String[] args) {
        System.out.print(Faker.instance().backToTheFuture().character());
        System.out.print(" - it's your pokemon");
    }
}
