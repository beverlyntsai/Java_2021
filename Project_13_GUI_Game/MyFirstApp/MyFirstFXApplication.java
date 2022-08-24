import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class MyFirstFXApplication extends Application 
{
    @Override
    public void start(Stage myStage) 
    {
	myStage.setTitle("My First Java FX Application");
	FlowPane rootNode=new FlowPane();
	Scene myScene=new Scene(rootNode, 300, 200);
	myStage.setScene(myScene);
	myStage.setResizable(false);
	myStage.show();

     }
/*
     public static void main(String[] args) 
     {
         launch(args);
     }
*/
}