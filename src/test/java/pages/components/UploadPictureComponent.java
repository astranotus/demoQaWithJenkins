package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class UploadPictureComponent {

    public void setPicture(SelenideElement selenideElement, String value) {
        $(selenideElement).uploadFromClasspath(value);
    }
}
