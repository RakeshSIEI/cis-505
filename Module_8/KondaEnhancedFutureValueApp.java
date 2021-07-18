/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package Module_8;


import javafx.scene.control.TextArea;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;
import javafx.application.*;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class KondaEnhancedFutureValueApp extends Application {
	
	private static int MONTHS_IN_YEAR=12;
	TextArea area=new TextArea();
	TextField monthlyPaymentField = new TextField();
	TextField interestRateField = new TextField();
	ComboBox<Integer> year=new ComboBox<Integer>(); //ComboBox of type Integer
	Label lblFutureValueDate = new Label();
    // Add clearButton and calculateButton Button
    Button clearButton = new Button("Clear");
    Button calculateButton = new Button("Calculate");
	
 // Create an instance of SimpleDateFormat used for formatting 
 // the string representation of date (month/day/year)
 DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

 // Get the date today using Calendar object.
 Date today = Calendar.getInstance().getTime();        
 // Using DateFormat format method we can create a string 
 // representation of a date with the defined format.
 String reportDate = df.format(today);

    @Override
    public void start(Stage primaryStage) throws Exception {
    	
    	Label headerLabel = new Label("Konda Future Value App");
        primaryStage.setTitle(headerLabel.getText());

        // Create the registration form grid pane
        GridPane gridPane = createFutureValueApp();
        // Add UI controls to the registration form grid pane
        addControlsToFutureValueApp(gridPane);
        // Create a scene with registration form grid pane as the root node
        Scene scene = new Scene(gridPane, 800, 500);
        // Set the scene in primary stage	
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

    private GridPane createFutureValueApp() {
        // Instantiate a new Grid Pane
        GridPane gridPane = new GridPane();

        // Position the pane at the center of the screen, both vertically and horizontally
        gridPane.setAlignment(Pos.CENTER);

        // Set a padding of 20px on each side
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

        // Set the horizontal gap between columns
        gridPane.setHgap(5.5);

        // Set the vertical gap between rows
        gridPane.setVgap(5.5);

        // Add Column Constraints

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(150, 150, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(100,100, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }
    
    public void addControlsToFutureValueApp(GridPane gridPane) {
        // Add Header
        Label headerLabel = new Label("Konda Future Value App");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        // Add lblMonthlyPayment Label
        Label lblMonthlyPayment = new Label("Monthly Payment : ");
        gridPane.add(lblMonthlyPayment, 0,1);

        // Add monthlyPaymentField Text Field
        monthlyPaymentField.setPrefHeight(40);
        gridPane.add(monthlyPaymentField, 1,1);

        // Add lblInterestRate Label
        Label lblInterestRate = new Label("Interest Rate : ");
        gridPane.add(lblInterestRate, 0, 2);

        // Add interestRateField Text Field
        interestRateField.setPrefHeight(40);
        gridPane.add(interestRateField, 1, 2);

        // Add lblInterestRateFormat Label
        Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
        lblInterestRateFormat.setTextFill(Color.web("#ff0000", 0.8));
        gridPane.add(lblInterestRateFormat, 1,3);
        
        // Add Years Label
        Label lblYear = new Label("Years : ");
        gridPane.add(lblYear, 0, 5);
             
        ObservableList<Integer> list = year.getItems();
        //Adding items to the combo box
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        gridPane.add(year, 1, 5);

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15,0,15,30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(clearButton);
        actionBtnContainer.getChildren().add(calculateButton);
        gridPane.add(actionBtnContainer, 1, 6);
        
        // Add FutureValueDate Label
        gridPane.add(lblFutureValueDate, 1,7);
        
        // Add Text Area
        gridPane.add(area, 1, 8);
        
        initialize();// calling the private methods to the onAction of the buttons.


    }
      
    private void clearFormFields()
    {
    	area.setText(null);
    	monthlyPaymentField.setText(null);
    	interestRateField.setText(null);
    	year.setValue(0);
    	lblFutureValueDate.setText(null);
    	
    }
    
    private void calculateResults()
    {
    	double monthlyPayment=Double.parseDouble(monthlyPaymentField.getText());
    	double rate=Double.parseDouble(interestRateField.getText());
    	int years=year.getValue();
    	
    	double futureValue=FinanceCalculator.calculateFutureValue(monthlyPayment,rate,years);
    	area.setText("The future value is $"+Double.toString(futureValue));
    	lblFutureValueDate.setText("Calculation as of "+reportDate);
    	monthlyPaymentField.setText(Double.toString(monthlyPayment));
    	interestRateField.setText(Double.toString(rate));

    }
    
    // the private methods to the onAction of the buttons
    public void initialize() {
    	clearButton.setOnAction(e -> clearFormFields());
    	calculateButton.setOnAction(e -> calculateResults());
    }


    public static void main(String[] args) {
        launch(args);
    }


	public static int getMONTHS_IN_YEAR() {
		return MONTHS_IN_YEAR;
	}


	public static void setMONTHS_IN_YEAR(int mONTHS_IN_YEAR) {
		MONTHS_IN_YEAR = mONTHS_IN_YEAR;
	}
}
