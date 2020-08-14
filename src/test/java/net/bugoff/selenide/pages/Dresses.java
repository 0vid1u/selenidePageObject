package net.bugoff.selenide.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.element;

public class Dresses {
    public Dresses open() {
        Selenide.open("http://automationpractice.com/index.php?id_category=8&controller=category");
        return this;
    }

    public void iAmOnDressesPage(){
        element(By.xpath("//h2[@class='title_block']")).shouldHave(text("DRESSES"));
    }
}
