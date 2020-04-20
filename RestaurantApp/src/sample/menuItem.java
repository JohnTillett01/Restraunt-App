package sample;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

public class menuItem {
        private final SimpleStringProperty foodItem;
        private final SimpleStringProperty price;
        private final SimpleStringProperty calories;
        private final SimpleStringProperty course;
        private final SimpleStringProperty vegetarian;
        private CheckBox select;

    menuItem(String fCourse, String fItem, String fPrice, String fCalories, String fVegetarian) {
            this.foodItem = new SimpleStringProperty(fItem);
            this.price = new SimpleStringProperty(fPrice);
            this.calories = new SimpleStringProperty(fCalories);
            this.course = new SimpleStringProperty(fCourse);
            this.vegetarian = new SimpleStringProperty(fVegetarian);
            this.select = new CheckBox();
        }

    public CheckBox getSelect() {
        return select;
    }

    public void setSelect(CheckBox select) {
        this.select = select;
    }

    public String getVegetarian() {
        return vegetarian.get();
    }

    public SimpleStringProperty vegetarianProperty() {
        return vegetarian;
    }

    public void setVegetarian(String vegetarian) {
        this.vegetarian.set(vegetarian);
    }
        public String getCourse() {
        return course.get();
    }

    public SimpleStringProperty courseProperty() {
        return course;
    }

    public void setCourse(String course) {
        this.course.set(course);
    }

    public String getFoodItem() {
        return foodItem.get();
    }

    public SimpleStringProperty foodItemProperty() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem.set(foodItem);
    }

    public String getCalories() {
        return calories.get();
    }

    public SimpleStringProperty caloriesProperty() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories.set(calories);
    }

    public String getPrice() {
        return price.get();
    }

    public SimpleStringProperty priceProperty() {
        return price;
    }

    public void setPrice(String price) {
        this.price.set(price);
    }
}
