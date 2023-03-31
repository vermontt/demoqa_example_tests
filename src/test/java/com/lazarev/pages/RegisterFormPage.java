package com.lazarev.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class RegisterFormPage {

    // Элементы для полей ввода данных
    public static final String firstName = "//*[@id='firstName']",
            lastName = "//*[@id='lastName']",
            userEmail = "//*[@id='userEmail']",
            gender = "//*[@class='custom-control custom-radio custom-control-inline'][2]",
            userNumber = "//*[@id='userNumber']",
            dateOfBirthInput = "//*[@id='dateOfBirthInput']",
            dateChange = "//*[@class='react-datepicker__day react-datepicker__day--010']",
            currentAddress = "//*[@id='currentAddress']",
            buttonSubmit = "//*[@id='submit']";

    // Элементы итоговой таблицы
    public static final String resultStudentName = "//tbody/tr[1]/td[2]",
            resultStudentEmail = "//tbody/tr[2]/td[2]",
            resultStudentGender = "//tbody/tr[3]/td[2]",
            resultStudentMobileNumber = "//tbody/tr[4]/td[2]",
            resultStudentDateBirth = "//tbody/tr[5]/td[2]",
            resultStudentAddress = "//tbody/tr[9]/td[2]";

    public static void inputValue(String element, String data) {
        $x(element).setValue(data);
    }

    public static void clickElement(String element) {
        $x(element).click();
    }

    public static void assertResult(String selector, String res) {
        $x(selector).shouldHave(text(res));
    }
}