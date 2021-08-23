package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import model.SafeBox;

public class SafeBoxControllerGUI {

    @FXML
    private Label labelTitle;

    @FXML
    private Label labelMessage;
    
    @FXML
    private Button btnOpen;

    @FXML
    private PasswordField pF1 = new PasswordField();

    @FXML
    private PasswordField pF4 = new PasswordField();

    @FXML
    private PasswordField pF5 = new PasswordField();

    @FXML
    private PasswordField pF6 = new PasswordField();

    @FXML
    private PasswordField pF2 = new PasswordField();

    @FXML
    private PasswordField pF3 = new PasswordField();

    private Stage mainStage;
    
    private PasswordField [] actualPassword = {pF1, pF2, pF3, pF4, pF5, pF6};
   
	public Stage getMainStage() 
	{
		return mainStage;
	}

	public void setMainStage(Stage mainStage) 
	{
		this.mainStage = mainStage;
	}

	@FXML
    public void switchWindow(ActionEvent event) throws IOException
    {
		 pF1.setPromptText("0");
		 pF2.setPromptText("0");
		 pF3.setPromptText("0");
		 pF4.setPromptText("0");
		 pF5.setPromptText("0");
		 pF6.setPromptText("0");
    	
    	if( SafeBox.verifyPassword( actualPassword ) == 6 )
    	{
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox2.fxml"));
        	fxmlLoader.setController(this);
        	Parent root = fxmlLoader.load();
        	Scene scene = new Scene(root);
        	mainStage.setScene(scene);
        	mainStage.setTitle("Window 2");
        	mainStage.show();
    	}	
    	else
    	{
    		labelMessage.setText("You're password is Incorrect");
    	}	
  
    }
 
	

	
}
