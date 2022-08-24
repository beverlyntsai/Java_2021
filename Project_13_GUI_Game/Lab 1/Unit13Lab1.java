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

public class Unit13Lab1 extends Application 
{
    @Override
    public void start(Stage myStage) 
    {

		myStage.setTitle("Loan Calculator");

		GridPane rootNode = new GridPane();
		rootNode.setPadding(new Insets(30));
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		rootNode.setAlignment(Pos.CENTER);

		Scene myScene= new Scene(rootNode,400,300);

		//Place nodes in the pane
		rootNode.add(new Label("Anunual Interest Rate:"),0,0);
		rootNode.add(new TextField(),1,0);

		rootNode.add(new Label("Number of Years:"),0,1);
		rootNode.add(new TextField(),1,1);

		rootNode.add(new Label("Loan Amount:"),0,2);
		rootNode.add(new TextField(),1,2);

		rootNode.add(new Label("Monthly Payment:"),0,3);
		rootNode.add(new TextField(),1,3);

		rootNode.add(new Label("Total Payment:"),0,4);
		rootNode.add(new TextField(),1,4);



		Button aButton=new Button("Calculate");
		rootNode.add(aButton,1,5);
		rootNode.setHalignment(aButton, HPos.RIGHT);

		myStage.setScene(myScene);
		myStage.show();

	}


     public static void main(String[] args) 
     {
         launch(args);
     }




}