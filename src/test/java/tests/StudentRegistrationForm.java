package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static tests.TestData.*;

public class StudentRegistrationForm extends BaseTest {

    @Test
    @Tag("owner")
    void registration() {

        step("Открыть форму регистрации", () -> {
            registraionForm.openPage();
        });
        step("Заполнить форму", () -> {
            registraionForm.setFirstName(name)
                    .setLastName(lastName)
                    .setEmail(email)
                    .setGenderCheckbox(gender)
                    .setNumber(number)
                    .setBirthDate(month, year, day)
                    .setSubject(subject)
                    .setHobbyCheckbox(hobby)
                    .uploadPicture(picture)
                    .setAddress(address)
                    .setState(state)
                    .setCity(city);
        });
        step("Нажать 'submit'", () -> {
            registraionForm.pressSubmitButton();
        });
        step("Проверка результатов", () -> {
            registraionForm.checkResult("Student Name", name + " " + lastName)
                    .checkResult("Student Email", email)
                    .checkResult("Gender", gender)
                    .checkResult("Mobile", number)
                    .checkResult("Date of Birth", day + " " + month + "," + year)
                    .checkResult("Subjects", subject)
                    .checkResult("Hobbies", hobby)
                    .checkResult("Picture", picture)
                    .checkResult("Address", address)
                    .checkResult("State and City", state + " " + city);
        });
    }
}
