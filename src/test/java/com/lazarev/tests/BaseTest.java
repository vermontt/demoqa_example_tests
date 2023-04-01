package com.lazarev.tests;

import com.codeborne.selenide.Configuration;
import com.lazarev.pages.RegisterFormPage;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    RegisterFormPage registerFormPage = new RegisterFormPage();

    @BeforeEach
    void setUp() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
    }
}