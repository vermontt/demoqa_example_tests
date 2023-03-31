package com.lazarev.data;

import com.github.javafaker.Faker;

public class DataFaker {

    private static final Faker faker = new Faker();

    public static String getRandomFirstName() {
        return faker.name().firstName();
    }

    public static String getRandomLastName() {
        return faker.name().lastName();
    }

    public static String getRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String getRandomMobileNumber() {
        return faker.number().digits(10);
    }

    public static String getRandomAddress() {
        return faker.address().fullAddress();
    }
}