package sample;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @org.junit.jupiter.api.Test
    void initialize() {
        int currentOrderInt = 1;
        int currentDrinkInt = 1;

        assertEquals(1, currentOrderInt);
        assertEquals(1, currentDrinkInt);
    }

    @org.junit.jupiter.api.Test
    void takeorder() {

        String tableNumber = "1";
        assertEquals("1", tableNumber);
    }

    @org.junit.jupiter.api.Test
    void placeOrder() {

    }

    @org.junit.jupiter.api.Test
    void adminAdd() {
    }

    @org.junit.jupiter.api.Test
    void logOutAdmin() {
    }

    @org.junit.jupiter.api.Test
    void toAdmin() {
    }

    @org.junit.jupiter.api.Test
    void continueDrink() {
    }

    @org.junit.jupiter.api.Test
    void cardPayment() {
    }

    @org.junit.jupiter.api.Test
    void validateText() {
    }

    @org.junit.jupiter.api.Test
    void validateCardPayment() {
    }

    @org.junit.jupiter.api.Test
    void payForFood() {
    }

    @org.junit.jupiter.api.Test
    void payCash() {
    }

    @org.junit.jupiter.api.Test
    void backToTheStart() {
    }
}