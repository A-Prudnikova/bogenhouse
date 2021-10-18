package cloud.autotests.tests;

import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Story("Menu tests")
public class MenuTests extends TestBase {

    @Test
    @DisplayName("Menu shown on main page on click")
    void menuShownOnClick() {
        step("Open main page", () -> {
            open(TestData.getWebUrl());
            $(".body").shouldHave(text("МЕНЮ"));
        });
      step("Click on menu icon", () -> {
          $("#Header_MenuIcon").click();
          $(".SideRoll__content--1wAum").shouldBe(visible).shouldHave(text("паркинг"));
      });
    }

//    @Test
//    @DisplayName("Menu opens correct pages")
//    void menuOpensPages() {
//        step("Open main page", () -> {
//            open(TestData.getWebUrl());
//            $(".body").shouldHave(text("МЕНЮ"));
//        });
//
//      step("Open о Bogenhouse", () -> {
//          $("#Header_MenuIcon").click();
//          $("#Header_NavMenu_NavMenu_item__about").click();
//          $(".body").shouldHave(text("О Bogenhouse"));
//      });
//
//      step("Open Замоскворечье", () -> {
//          $("#Header_MenuIcon").click();
//          $("#Header_NavMenu_NavMenu_item__zamoskvorechie").click();
//          $(".body").shouldHave(text("Замоскворечье"));
//      });
//
//      step("Open Апартаменты", () -> {
//          $("#Header_MenuIcon").click();
//          $("#Header_NavMenu_NavMenu_item__aboutApartment").click();
//          $(".body").shouldHave(text("Об апартаментах"));
//      });
//
//      step("Open Пентхаусы", () -> {
//          $("#Header_MenuIcon").click();
//          $("#Header_NavMenu_NavMenu_item__penthouse").click();
//          $(".body").shouldHave(text("Подбор"));
//      });
//
//      step("Open Паркинг", () -> {
//          $("#Header_MenuIcon").click();
//          $("#Header_NavMenu_NavMenu_item__parkingAbout").click();
//          $(".body").shouldHave(text("Паркинг"));
//      });
//
//      step("Open Галерея", () -> {
//          $("#Header_MenuIcon").click();
//          $("#Header_NavMenu_NavMenu_item__gallery").click();
//          $(".body").shouldHave(text("Галерея"));
//      });
////
//      step("Open Контакты", () -> {
//          $("#Header_MenuIcon").click();
//          $("#Header_NavMenu_NavMenu_item__contacts").click();
//          $(".body").shouldHave(text("Москва"));
//      });
//    }
}
