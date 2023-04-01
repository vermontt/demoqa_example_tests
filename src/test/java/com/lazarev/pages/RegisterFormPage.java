package com.lazarev.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegisterFormPage {

    // Элементы для полей ввода данных
    private final SelenideElement firstName = $x("//*[@id='firstName']"),
            lastName = $x("//*[@id='lastName']"),
            userEmail = $x("//*[@id='userEmail']"),
            gender = $x("//*[@class='custom-control custom-radio custom-control-inline'][2]"),
            userNumber = $x("//*[@id='userNumber']"),
            dateOfBirthInput = $x("//*[@id='dateOfBirthInput']"),
            dateChange = $x("//*[@class='react-datepicker__day react-datepicker__day--010']"),
            currentAddress = $x("//*[@id='currentAddress']"),
            buttonSubmit = $x("//*[@id='submit']");

    // Элементы итоговой таблицы
    private final SelenideElement resultStudentName = $x("//tbody/tr[1]/td[2]"),
            resultStudentEmail = $x("//tbody/tr[2]/td[2]"),
            resultStudentGender = $x("//tbody/tr[3]/td[2]"),
            resultStudentMobileNumber = $x("//tbody/tr[4]/td[2]"),
            resultStudentDateBirth = $x("//tbody/tr[5]/td[2]"),
            resultStudentAddress = $x("//tbody/tr[9]/td[2]");

    public void openPage() {
        open("/automation-practice-form");
    }

    public RegisterFormPage inputFirstName(String data) {
        firstName.setValue(data);
        return this;
    }

    public RegisterFormPage inputLastName(String data) {
        lastName.setValue(data);
        return this;
    }

    public RegisterFormPage inputEmail(String data) {
        userEmail.setValue(data);
        return this;
    }

    public RegisterFormPage clickGender() {
        gender.click();
        return this;
    }

    public RegisterFormPage inputNumber(String data) {
        userNumber.setValue(data);
        return this;
    }

    public RegisterFormPage clickDateOfBirth() {
        dateOfBirthInput.click();
        return this;
    }

    public RegisterFormPage clickDateChange() {
        dateChange.click();
        return this;
    }

    public RegisterFormPage inputAddress(String data) {
        currentAddress.setValue(data);
        return this;
    }

    public RegisterFormPage clickSubmit() {
        buttonSubmit.click();
        return this;
    }

    public RegisterFormPage assertResultName(String result) {
        resultStudentName.shouldHave(text(result));
        return this;
    }

    public RegisterFormPage assertResultEmail(String result) {
        resultStudentEmail.shouldHave(text(result));
        return this;
    }

    public RegisterFormPage assertResultGender(String result) {
        resultStudentGender.shouldHave(text(result));
        return this;
    }

    public RegisterFormPage assertResultNumber(String result) {
        resultStudentMobileNumber.shouldHave(text(result));
        return this;
    }

    public RegisterFormPage assertResultDateBirth(String result) {
        resultStudentDateBirth.shouldHave(text(result));
        return this;
    }

    public RegisterFormPage assertResultAddress(String result) {
        resultStudentAddress.shouldHave(text(result));
        return this;
    }
}