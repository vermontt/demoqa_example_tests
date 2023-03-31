package com.lazarev.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {

    @BeforeEach
    void setUp() {
        Configuration.startMaximized = true;
    }

    @Test
    void formTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Igor");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("tutu@example.com");
        $x("//*[@class='custom-control custom-radio custom-control-inline'][2]").click();
        $("#userNumber").setValue("8900000000");
        $("#dateOfBirthInput").click();
        $x("//*[@class='react-datepicker__day react-datepicker__day--010']").click();
        $("#currentAddress").setValue("Russia");
        $("#submit").click();
        $x("//tbody/tr[1]/td[2]").shouldHave(Condition.text("Igor Ivanov"));
        $x("//tbody/tr[2]/td[2]").shouldHave(Condition.text("tutu@example.com"));
        $x("//tbody/tr[3]/td[2]").shouldHave(Condition.text("Female"));
        $x("//tbody/tr[4]/td[2]").shouldHave(Condition.text("8900000000"));
        $x("//tbody/tr[5]/td[2]").shouldHave(Condition.text("10 March,2023"));
        $x("//tbody/tr[9]/td[2]").shouldHave(Condition.text("Russia"));
    }
}