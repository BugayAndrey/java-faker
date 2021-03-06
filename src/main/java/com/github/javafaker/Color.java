package com.github.javafaker;

public class Color {
    private final Faker faker;

    Color(Faker faker) {
        this.faker = faker;
    }

    public String name() {
        return faker.fakeValuesService().resolve("color.name", this, faker);
    }
}
