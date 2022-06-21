package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalenderComponent;
import pages.components.CheckBoxComponent;
import pages.components.ResultTableComponent;
import pages.components.UploadPictureComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationForm {

    CalenderComponent calenderComponent = new CalenderComponent();
    ResultTableComponent resultTableComponent = new ResultTableComponent();
    CheckBoxComponent checkBoxComponent = new CheckBoxComponent();
    UploadPictureComponent uploadPictureComponent = new UploadPictureComponent();

    public static final SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderCheckbox = $("#genterWrapper"),
            numberInput =  $("#userNumber"),
            birthDayInput = $("#dateOfBirthInput"),
            subjectInput = $("#subjectsInput"),
            hobbyCheckbox =  $("#hobbiesWrapper"),
            pictureInput = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input"),
            submitButton = $("#submit");


    public RegistrationForm openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        return this;
    }

    public RegistrationForm setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationForm setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationForm setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    public RegistrationForm setGenderCheckbox(String value) {
        checkBoxComponent.setCheckBox(genderCheckbox,value);

        return this;
    }

    public RegistrationForm setNumber(String value) {
        numberInput.setValue(value);

        return this;
    }

    public RegistrationForm setBirthDate(String month, String year, String day) {
        birthDayInput.click();
        calenderComponent.calender(month,year,day);

        return this;
    }

    public RegistrationForm setSubject(String value) {
        subjectInput.sendKeys(value);
        subjectInput.pressEnter();

        return this;
    }

    public RegistrationForm setHobbyCheckbox(String value) {
        checkBoxComponent.setCheckBox(hobbyCheckbox,value);

        return this;
    }

    public RegistrationForm uploadPicture(String value) {
        uploadPictureComponent.setPicture(pictureInput, value);

        return this;
    }

    public RegistrationForm setAddress(String value) {
        addressInput.setValue(value);

        return this;
    }

    public RegistrationForm setState(String value) {
        stateInput.setValue(value).pressEnter();;

        return this;
    }

    public RegistrationForm setCity(String value) {
        cityInput.setValue(value).pressEnter();

        return this;
    }

    public RegistrationForm pressSubmitButton() {
        submitButton.click();

        return this;
    }

    public RegistrationForm checkResult(String key, String value) {
        resultTableComponent.checkResult(key, value);

        return this;
    }
}

