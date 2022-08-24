/**                                                
 * Write a program that sets up a GUI interface for a loan calculator, as illustrated below. Your interface doesn’t 
 * have to look exactly like this one, but it should be similar.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class Test extends Application 
{
    @Override
    public void start(Stage myStage) 
    {

		myStage.setTitle("Loan Calculator");

		FlowPane rootNode = new FlowPane();
		Scene myScene=new Scene(rootNode,300,200);
		ToggleButton myButton=new ToggleButton("XXXXXXX");
		rootNode.getChildren().addAll(myButton);


		myStage.setScene(myScene);
		myStage.show();

	}


     public static void main(String[] args) 
     {
         launch(args);
     }




}