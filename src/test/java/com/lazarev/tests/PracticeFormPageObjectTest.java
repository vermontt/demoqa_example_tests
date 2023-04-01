package com.lazarev.tests;

import org.junit.jupiter.api.Test;

import static com.lazarev.data.DataFaker.*;


public class PracticeFormPageObjectTest extends BaseTest {

    String firstNameData = getRandomFirstName();
    String lastNameData = getRandomLastName();
    String emailData = getRandomEmail();
    String mobileNumberData = getRandomMobileNumber();
    String addressData = getRandomAddress();

    @Test
    public void formTest() {

        registerFormPage.openPage();
        registerFormPage.inputFirstName(firstNameData)
                .inputLastName(lastNameData)
                .inputEmail(emailData)
                .clickGender()
                .inputNumber(mobileNumberData)
                .clickDateOfBirth()
                .clickDateChange()
                .inputAddress(addressData)
                .clickSubmit();

        registerFormPage.assertResultName(firstNameData + " " + lastNameData)
                .assertResultEmail(emailData)
                .assertResultGender("Female")
                .assertResultNumber(mobileNumberData)
                .assertResultDateBirth("10 April,2023")
                .assertResultAddress(addressData);
    }
}