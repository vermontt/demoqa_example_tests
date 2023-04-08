package com.lazarev.tests;

import com.codeborne.selenide.Configuration;
import com.lazarev.pages.RegisterFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    RegisterFormPage registerFormPage = new RegisterFormPage();

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "FIREFOX";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub/";
    }
}