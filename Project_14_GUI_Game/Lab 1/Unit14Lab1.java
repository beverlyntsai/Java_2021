/**                                                
 * This assignment will involve modifying the Unit 13 Lab 1 program so that the sum of the first and second value 
 * is actually calculated when the user clicks on the calculate button. 
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;


public class Unit14Lab1 extends Application 
{
	//Create 3 TextFields
	private TextField firstValue=new TextField();
	private TextField secondValue=new TextField();
	private TextField sumValue=new TextField();

	//Create a button 
	private Button aButton=new Button("Calculate");


    @Override
    public void start(Stage myStage) 
    {

		myStage.setTitle("Calculator");

		GridPane rootNode = new GridPane();
		rootNode.setPadding(new Insets(30));
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		rootNode.setAlignment(Pos.CENTER);

		Scene myScene= new Scene(rootNode,400,300);

		//Place nodes in the pane
		rootNode.add(new Label("First Value:"),0,0);
		rootNode.add(firstValue,1,0);

		rootNode.add(new Label("Second Value:"),0,1);
		rootNode.add(secondValue,1,1);

		rootNode.add(new Label("Sum is:"),0,2);
		rootNode.add(sumValue,1,2);


		rootNode.add(aButton,1,5);
		rootNode.setHalignment(aButton, HPos.LEFT);

		//Button registers event
		aButton.setOnAction(new ButtonHandler());

		myStage.setScene(myScene);
		myStage.show();

	}

	class ButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle( ActionEvent e)
		{

			Integer value1 = Integer.valueOf(firstValue.getText());
			Integer value2 = Integer.valueOf(secondValue.getText());
			Integer sum = value1 + value2;
			sumValue.setText(sum.toString());

		}
	}


     public static void main(String[] args) 
     {
         launch(args);
     }




}