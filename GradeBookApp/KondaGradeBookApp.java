package GradeBookApp;

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

public class KondaGradeBookApp extends Application {
	
	TextField firstName = new TextField();
	TextField lastName = new TextField();
	TextField course = new TextField();
	ComboBox<String> grade=new ComboBox<String>(); //ComboBox of type String
    // Add clearButton and calculateButton Button
    Button clearButton = new Button("Clear");
    Button viewButton = new Button("View");
	Button saveButton = new Button("Save");
	
 // Create an instance of SimpleDateFormat used for formatting 
 // the string representation of date (month/day/grade)
 DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

 // Get the date today using Calendar object.
 Date today = Calendar.getInstance().getTime();        
 // Using DateFormat format method we can create a string 
 // representation of a date with the defined format.
 String reportDate = df.format(today);

    @Override
    public void start(Stage primaryStage) throws Exception {
    	
    	Label headerLabel = new Label("Grade Book App");
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
        Label headerLabel = new Label("Grade Book App");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        // Add lblFirstName Label
        Label lblFirstName = new Label("First Name : ");
        gridPane.add(lblFirstName, 0,1);

        // Add firstName Text Field
        firstName.setPrefHeight(40);
        gridPane.add(firstName, 1,1);

        // Add lblLastName Label
        Label lblLastName = new Label("Last Name : ");
        gridPane.add(lblLastName, 0, 2);

        // Add lastName Text Field
        lastName.setPrefHeight(40);
        gridPane.add(lastName, 1, 2);
		
		// Add courde Label
        Label lblCourse = new Label("Course : ");
        gridPane.add(lblCourse, 0, 3);

        // Add lastName Text Field
        course.setPrefHeight(40);
        gridPane.add(course, 1, 3);
        
        // Add grades Label
        Label lblgrade = new Label("grades : ");
        gridPane.add(lblgrade, 0, 5);
             
        ObservableList<String> list = grade.getItems();
        //Adding items to the combo box
        list.add("F");
        list.add("E");
        list.add("D");
        list.add("C");
        list.add("B");
		list.add("A");
        gridPane.add(grade, 1, 5);

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15,0,15,30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(clearButton);
        actionBtnContainer.getChildren().add(viewButton);
		actionBtnContainer.getChildren().add(saveButton);
        gridPane.add(actionBtnContainer, 1, 6);
        
        
        initialize();// calling the private methods to the onAction of the buttons.


    }
      
    private void clearFormFields()
    {

    	firstName.setText(null);
    	lastName.setText(null);
    	course.setText(null);
    	grade.setValue("");
    	
    }
    
    private void viewResults()
    {
    	System.out.println("I am view function");

    }
    
    private void saveResults()
    {
    	System.out.println("I am save function");

    }
    
    
    // the private methods to the onAction of the buttons
    public void initialize() {
    	clearButton.setOnAction(e -> clearFormFields());
    	//viewButton.setOnAction(e -> viewResults());
    	//saveButton.setOnAction(e -> saveResults());
    	
    }


    public static void main(String[] args) {
        launch(args);
    }



}
