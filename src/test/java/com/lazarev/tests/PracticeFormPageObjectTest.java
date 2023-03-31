package com.lazarev.tests;

import org.junit.jupiter.api.Test;

import static com.lazarev.data.DataFaker.*;
import static com.lazarev.pages.RegisterFormPage.*;


public class PracticeFormPageObjectTest extends BaseTest {

    @Test
    public void formTest() {

        String firstNameData = getRandomFirstName();
        String lastNameData = getRandomLastName();
        String emailData = getRandomEmail();
        String mobileNumberData = getRandomMobileNumber();
        String addressData = getRandomAddress();

        inputValue(firstName, firstNameData);
        inputValue(lastName, lastNameData);
        inputValue(userEmail, emailData);
        clickElement(gender);
        inputValue(userNumber, mobileNumberData);
        clickElement(dateOfBirthInput);
        clickElement(dateChange);
        inputValue(currentAddress, addressData);
        clickElement(buttonSubmit);

        assertResult(resultStudentName, firstNameData + " " + lastNameData);
        assertResult(resultStudentEmail, emailData);
        assertResult(resultStudentGender, "Female");
        assertResult(resultStudentMobileNumber, mobileNumberData);
        assertResult(resultStudentDateBirth, "10 March,2023");
        assertResult(resultStudentAddress, addressData);
    }
}