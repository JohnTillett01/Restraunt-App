package sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class menuItemTest {
    private menuItem TestItem; //= new menuItem("","","5.00","","");

    @BeforeEach
    void setUp() {
        TestItem = new menuItem("","","5.00","","");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getSelect() {
    }

    @Test
    void getVegetarian() {
    }

    @Test
    void getCourse() {
    }

    @Test
    void getFoodItem() {
    }

    @Test
    void getCalories() {
    }

    @Test
    void getPrice() {
        assertEquals("5.00",TestItem.getPrice());
    }
}