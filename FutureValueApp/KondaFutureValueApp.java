/*
    Rakesh, K. (2021), CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/
package FutureValueApp;

import javafx.scene.control.TextArea;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
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

public class KondaFutureValueApp extends Application {

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

    private void addControlsToFutureValueApp(GridPane gridPane) {
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
        TextField monthlyPaymentField = new TextField();
        monthlyPaymentField.setPrefHeight(40);
        gridPane.add(monthlyPaymentField, 1,1);


        // Add lblInterestRate Label
        Label lblInterestRate = new Label("Interest Rate : ");
        gridPane.add(lblInterestRate, 0, 2);

        // Add interestRateField Text Field
        TextField interestRateField = new TextField();
        interestRateField.setPrefHeight(40);
        gridPane.add(interestRateField, 1, 2);

        // Add lblInterestRateFormat Label
        Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
        lblInterestRateFormat.setTextFill(Color.web("#ff0000", 0.8));
        gridPane.add(lblInterestRateFormat, 1,3);
        
        // Add Years Label
        Label lblYear = new Label("Years : ");
        gridPane.add(lblYear, 0, 5);
        
        //ComboBox of type Integer	
        ComboBox<Integer> year=new ComboBox<Integer>();
        ObservableList<Integer> list = year.getItems();
        //Adding items to the combo box
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        gridPane.add(year, 1, 5);

        

        // Add clearButton and calculateButton 
        Button clearButton = new Button("Clear");
        Button calculateButton = new Button("Calculate");
        
        
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15,0,15,30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(clearButton);
        actionBtnContainer.getChildren().add(calculateButton);
        gridPane.add(actionBtnContainer, 1, 6);
        
        // Add Text Area
        TextArea area=new TextArea();
        gridPane.add(area, 1, 8);


    }
    

    public static void main(String[] args) {
        launch(args);
    }
}
