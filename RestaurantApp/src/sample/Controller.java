package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;

import java.text.DecimalFormat;
import java.util.Comparator;

public class Controller {
    ObservableList<String> tableNumbers = FXCollections.<String>observableArrayList("1","2","3","4","5","6");
    ObservableList<Integer> courseNumbers = FXCollections.<Integer>observableArrayList(1,2,3);
    ObservableList<String> adminCourse = FXCollections.<String>observableArrayList("Starter", "Main", "Dessert");
    ObservableList<String> adminVeggieYN = FXCollections.<String>observableArrayList("Yes", "No");


    @FXML
    private ChoiceBox tableNumberCB;
    @FXML
    private ChoiceBox courseNumberCB;
    @FXML
    private Slider numberofpeopleSLD;
    @FXML
    private Button placeOrderBTN;
    @FXML
    private TabPane menuTab;
    @FXML
    private Label courseChosen;
    @FXML
    private Label inputConfirmation;
    @FXML
    private Button confirmCourseBTN;
    @FXML
    private TableView menu;
    @FXML
    private TableView selectedMenuTV;
    @FXML
    private TableView drinksMenu;
    @FXML
    private Button placeOrder;
    @FXML
    private Label totalCalories;
    @FXML
    private Label totalPrice;
    @FXML
    private Button Cash;
    @FXML
    private Button Card;
    @FXML
    private Button Admin;
    @FXML
    private ChoiceBox AdminCourseCB;
    @FXML
    private ChoiceBox AdminVeggieCB;
    @FXML
    private javafx.scene.control.TextField NewPrice;
    @FXML
    private javafx.scene.control.TextField NewCalories;
    @FXML
    private TextField NewItem;
    @FXML
    private Button logOut;
    @FXML
    private Button drinksContinue;
    @FXML
    private Label drinksSelection;
    @FXML
    private Label drinksWarning;
    @FXML
    private Button goToAdmin;
    @FXML
    private Label tableNumberRC;
    @FXML
    private TextField accountNumber;
    @FXML
    private TextField cardHolder;
    @FXML
    private TextField expiryDate;
    @FXML
    private TextField securityCode;
    @FXML
    private Button payForOrder;
    @FXML
    private Label payWarning;
    @FXML
    private Label textValidation;
    @FXML
    private Label cashConfirmation;
    @FXML
    private Button nextOrder;
    @FXML
    private Label cardPaymentAmount;
    @FXML
    private Button nextOrderCardBTN;

    ObservableList<menuItem> menuContent;
    ObservableList<menuItem> drinkList;
    ObservableList<menuItem> selectedOrder;
    double peopleAtTable;
    double currentOrderInt;
    int currentDrinkInt;


    @FXML
    public void initialize(){
        selectedOrder = FXCollections.observableArrayList();
        currentOrderInt=1;
        currentDrinkInt=1;

        TableColumn FoodItemCol = new TableColumn("Item");
        TableColumn FoodPriceCol = new TableColumn("Price (£)");
        TableColumn FoodCaloriesCol = new TableColumn("Calories");
        TableColumn FoodCourseCol = new TableColumn("Course");
        TableColumn FoodVegiCol = new TableColumn("Vegetarian");
        TableColumn SelectCol = new TableColumn("Select");
        FoodItemCol.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("foodItem")
        );
        FoodPriceCol.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("price")
        );
        FoodCaloriesCol.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("calories")
        );
        FoodCourseCol.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("course")
        );
        FoodVegiCol.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("vegetarian")
        );
        SelectCol.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("select")
        );
        menu.getColumns().addAll(FoodCourseCol, FoodItemCol, FoodPriceCol, FoodCaloriesCol, FoodVegiCol, SelectCol);


        menuContent = FXCollections.observableArrayList(
                new menuItem("Starter","Chicken Dippers", "1.99", "200", "No"),
                new menuItem("Starter", "Salad", "1.50", "100", "Yes"),
                new menuItem("Starter", "Halloumi Fries", "2.95", "250", "Yes"),
                new menuItem("Starter", "Tomato Soup", "1.99", "300", "Yes"),
                new menuItem("Main", "Chicken Burger", "4.99", "600", "No"),
                new menuItem("Main", "BLT Sandwich", "3.99", "450", "No"),
                new menuItem("Main", "American Burger", "5.99", "849", "No"),
                new menuItem("Main","Cheese Burger", "3.99", "550", "No"),
                new menuItem("Main","Bean Burger", "3.50", "500", "Yes"),
                new menuItem("Main","Tuna Sandwich", "3.00", "500", "No"),
                new menuItem("Dessert","Ice cream", "1.99", "400", "Yes"),
                new menuItem("Dessert","Pancakes", "2.50", "620", "Yes"),
                new menuItem("Dessert","Rocky Road", "2.99", "700", "Yes"),
                new menuItem("Dessert","Cookie Dough", "3.00", "580", "Yes")
        );
        menu.setItems(menuContent);


        TableColumn FoodItemCol2 = new TableColumn("Item");
        TableColumn FoodPriceCol2 = new TableColumn("Price (£)");
        TableColumn FoodCaloriesCol2 = new TableColumn("Calories");
        TableColumn FoodCourseCol2 = new TableColumn("Course");
        TableColumn FoodVegiCol2 = new TableColumn("Vegetarian");
        TableColumn SelectCol2 = new TableColumn("Select");
        FoodItemCol2.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("foodItem")
        );
        FoodPriceCol2.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("price")
        );
        FoodCaloriesCol2.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("calories")
        );
        FoodCourseCol2.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("course")
        );
        FoodVegiCol2.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("vegetarian")
        );
        SelectCol2.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("select")
        );

        selectedMenuTV.getColumns().addAll(FoodCourseCol2, FoodItemCol2, FoodPriceCol2, FoodCaloriesCol2, FoodVegiCol2);
        selectedMenuTV.setItems(selectedOrder);

        TableColumn FoodItemCol3 = new TableColumn("Item");
        TableColumn FoodPriceCol3 = new TableColumn("Price (£)");
        TableColumn FoodCaloriesCol3 = new TableColumn("Calories");
        TableColumn FoodCourseCol3 = new TableColumn("Course");
        TableColumn FoodVegiCol3 = new TableColumn("Vegetarian");
        TableColumn SelectCol3 = new TableColumn("Select");
        FoodItemCol3.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("foodItem")
        );
        FoodPriceCol3.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("price")
        );
        FoodCaloriesCol3.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("calories")
        );
        FoodCourseCol3.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("course")
        );
        FoodVegiCol3.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("vegetarian")
        );
        SelectCol3.setCellValueFactory(
                new PropertyValueFactory<menuItem, String>("select")
        );

        drinksMenu.getColumns().addAll(FoodCourseCol3, FoodItemCol3, FoodPriceCol3, FoodCaloriesCol3, FoodVegiCol3,SelectCol3);
        drinkList = FXCollections.observableArrayList(
                new menuItem("Drink","Pepsi", "1.50", "100", "Yes"),
                new menuItem("Drink","Pepsi Max", "1.50", "0", "Yes"),
                new menuItem("Drink","Fanta", "1.50", "160", "Yes"),
                new menuItem("Drink","Fanta fruit Twist", "1.45", "100", "Yes"),
                new menuItem("Drink","Water", "0.00", "0", "Yes"),
                new menuItem("Drink","Sex on the Beach", "3.99", "103", "Yes"),
                new menuItem("Drink","Strawberry Daiquiri", "0.00", "96", "Yes"),
                new menuItem("Drink","Mojito", "4.99", "86", "Yes"),
                new menuItem("Drink","Strongbow", "1.99", "56", "Yes"),
                new menuItem("Drink","Corona", "2.49", "69", "Yes")
                );

                drinksMenu.setItems(drinkList);


        tableNumberCB.setItems(tableNumbers);
        courseNumberCB.setItems(courseNumbers);
        AdminCourseCB.setItems(adminCourse);
        AdminVeggieCB.setItems(adminVeggieYN);
        courseChosen.setText("");
        inputConfirmation.setText("");
        NewItem.setText("");
        NewPrice.setText("");
        NewCalories.setText("");
        drinksWarning.setText("");
        tableNumberRC.setText("");
        payWarning.setText("");
        textValidation.setText("");
        cashConfirmation.setText("");
        cardPaymentAmount.setText("");
    }

    public void takeorder() {
        String tableNumber;
        peopleAtTable = numberofpeopleSLD.getValue();
        tableNumber = (String) tableNumberCB.getValue();
        if (tableNumber != null) {
            inputConfirmation.setText("");
            tableNumberRC.setText("Table number: " + tableNumberCB.getValue()+"");
            menuTab.getSelectionModel().select(1);
        } else inputConfirmation.setText("*Please input your table number");
    }

    @FXML
    public void displayCourse() {
        if (courseNumberCB.getValue() == null) {
            courseChosen.setText("Please select an option");
            courseChosen.setTextFill(Color.web("#ff0000"));
        } else {courseChosen.setText("Select " + courseNumberCB.getValue() + " items from below.");
            courseChosen.setTextFill(Color.web("#000000"));

        }
    }

    public void placeOrder() {
        int numberOfSelections = 0;
        int coursesWanted = 0;

        if (courseNumberCB.getValue() == null) {
         courseChosen.setText("*Please select number of courses");
         courseChosen.setTextFill(Color.web("#ff0000"));
        }
        else {
            courseChosen.setText("");
            coursesWanted = Integer.parseInt(courseNumberCB.getValue().toString());

            for (menuItem selectedMenu : menuContent ){
                if (selectedMenu.getSelect().isSelected()){
                    numberOfSelections++;
                }
            }

            if (numberOfSelections == coursesWanted) {
                for (menuItem selectedMenu : menuContent) {
                    if (selectedMenu.getSelect().isSelected()) {
                        menuItem item = new menuItem(selectedMenu.getCourse(),selectedMenu.getFoodItem(), selectedMenu.getPrice(), selectedMenu.getCalories(), selectedMenu.getVegetarian());
                        selectedOrder.add(item);
                    }
                }

                courseChosen.setText("");
                courseNumberCB.setValue(null);

                if (peopleAtTable==currentOrderInt){
                    menuTab.getSelectionModel().select(4);
                } else {
                    currentOrderInt++;
                }

                for (menuItem menuItem : menuContent) {
                    menuItem.getSelect().setSelected(false);
                }

            } else {
                courseChosen.setText("*Please select " + courseNumberCB.getValue() + " items" );
                courseChosen.setTextFill(Color.web("#ff0000"));
            }
        }
    }
    public void adminAdd() {

        if (validateText() == 1) {

            menuItem item = new menuItem(AdminCourseCB.getValue().toString(), NewItem.getText(), NewPrice.getText(), NewCalories.getText(), AdminVeggieCB.getValue().toString());
            menuContent.add(item);
            NewItem.setText("");
            NewPrice.setText("");
            NewCalories.setText("");
            AdminCourseCB.setValue(null);
            AdminVeggieCB.setValue(null);

            FXCollections.sort(menuContent, new Comparator<menuItem>() {
                @Override
                public int compare(menuItem t1, menuItem t2) {
                    return t2.getCourse().compareTo(t1.getCourse());
                }
            });
        }
    }

    public void logOutAdmin() {
        tableNumberCB.setValue(null);
        numberofpeopleSLD.setValue(1);
        menuTab.getSelectionModel().select(0);
    }
    public void toAdmin() {
        menuTab.getSelectionModel().select(3);
    }

    public void continueDrink() {
        int numberOfDrinksSelected = 0;

        for (menuItem selectedMenu : drinkList) {
            if (selectedMenu.getSelect().isSelected()) {
                numberOfDrinksSelected++;
            }
        }

        if (numberOfDrinksSelected < 2) {
            for (menuItem selectedMenu : drinkList) {
                if (selectedMenu.getSelect().isSelected()) {
                    menuItem item = new menuItem(selectedMenu.getCourse(), selectedMenu.getFoodItem(), selectedMenu.getPrice(), selectedMenu.getCalories(), selectedMenu.getVegetarian());
                    selectedOrder.add(item);
                }
            }
            double totalCost;
            int totalCal;
            totalCost = 0;
            totalCal = 0;

            if (peopleAtTable==currentDrinkInt){
                for (menuItem finalOrder : selectedOrder){
                    totalCost = totalCost + Double.parseDouble(finalOrder.getPrice());
                    totalCal = totalCal + Integer.parseInt(finalOrder.getCalories());
                }
                DecimalFormat df = new DecimalFormat("#.00");
                totalPrice.setText("Total price: £" + String.valueOf(df.format(totalCost)));
                cardPaymentAmount.setText("Total price: £" + String.valueOf(df.format(totalCost)));
                totalCalories.setText("Total Calories: " + String.valueOf(totalCal));
                menuTab.getSelectionModel().select(2);
            } else {
                currentDrinkInt++;
                drinksSelection.setText("Please select a drink for Person " + currentDrinkInt);
            }

            for (menuItem menuItem : drinkList) {
                menuItem.getSelect().setSelected(false);
            }
            drinksWarning.setText("");
            drinksWarning.setTextFill(Color.web("#000000"));

        } else {
            drinksWarning.setText("*Please select one drink per person");
            drinksWarning.setTextFill(Color.web("#ff0000"));
        }
    }

    public void cardPayment(){
        menuTab.getSelectionModel().select(5);
    }

    public int validateText(){

        if (!NewPrice.getText().matches("^\\d*\\.\\d+|\\d+\\.d*$")){
            textValidation.setText("*Price must be in format 0.00");
            textValidation.setTextFill(Color.web("#ff0000"));
            return 0;
       }
        else if (!NewCalories.getText().matches("\\d+")){
            textValidation.setText("*Calories must be a whole number");
            textValidation.setTextFill(Color.web("#ff0000"));
            return 0;
        }
        else if (AdminVeggieCB.getValue() == null){
            textValidation.setText("*Please add if this is Vegetarian");
            textValidation.setTextFill(Color.web("#ff0000"));
            return 0;
        }
        else if (AdminCourseCB.getValue() == null){
            textValidation.setText("*Please enter what Course this is");
            textValidation.setTextFill(Color.web("#ff0000"));
            return 0;
        }
        else if (!NewItem.getText().matches("([a-zA-Z ]){3,30}")) {
            textValidation.setText("*Item Name must be a minimum of 3 letters");
            textValidation.setTextFill(Color.web("#ff0000"));
            return 0;
        }
        else {
            textValidation.setText("");
            return 1;
        }

    }

    public int validateCardPayment(){

        if (!cardHolder.getText().matches("([a-zA-Z ]){2,30}")){
            payWarning.setText("*Please enter your Name, only enter letters and at least 2");
            payWarning.setTextFill(Color.web("#ff0000"));
            return 0;
        }
        else if (!accountNumber.getText().matches("([0-9]){16}")){
            payWarning.setText("*Your Account Number must be 16 numbers");
            payWarning.setTextFill(Color.web("#ff0000"));
            return 0;
        }
        else if (!expiryDate.getText().matches("([0-9]){4}")){
            payWarning.setText("*Your Expiry Date must be four numbers, format 0221");
            payWarning.setTextFill(Color.web("#ff0000"));
            return 0;
        }
        else if (!securityCode.getText().matches("([0-9]){3}")){
            payWarning.setText("*Your Security Code must be 3 digits long");
            payWarning.setTextFill(Color.web("#ff0000"));
            return 0;
        }
        else {
            payWarning.setText("");
            return 1;
        }

    }

    public void payForFood(){
        if(validateCardPayment() == 1) {
            payWarning.setText("Payment Accepted");
            payWarning.setTextFill(Color.web("#008000"));
        }
    }

    public void payCash(){
        cashConfirmation.setText("Payment Accepted");
        cashConfirmation.setTextFill(Color.web("#008000"));
    }

    public void backToTheStart(){

        if(cashConfirmation.getText().matches("Payment Accepted")) {
            cashConfirmation.setText("");
            menuTab.getSelectionModel().select(0);
            tableNumberCB.setValue(null);
            numberofpeopleSLD.setValue(1);
            selectedOrder.clear();
        }
        else {
            cashConfirmation.setText("*Please Pay first");
            cashConfirmation.setTextFill(Color.web("#ff0000"));
        }
    }

    public void newCustomerCard(){
        if (payWarning.getText() == "Payment Accepted"){
            menuTab.getSelectionModel().select(0);
            tableNumberCB.setValue(null);
            numberofpeopleSLD.setValue(1);
            selectedOrder.clear();
            cardHolder.setText("");
            expiryDate.setText("");
            securityCode.setText("");
            accountNumber.setText("");
            payWarning.setText("");
        }
        else{
            payWarning.setText("*Payment required first");
            payWarning.setTextFill(Color.web("#ff0000"));
        }
    }
}

