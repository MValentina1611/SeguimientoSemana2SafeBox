package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main (String args[]) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox1.fxml"));
		SafeBoxControllerGUI controller = new SafeBoxControllerGUI();
		fxmlLoader.setController(controller);
 		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root);
		
		controller.setMainStage(primaryStage);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("SafeBox");
		primaryStage.show();
	}

}
