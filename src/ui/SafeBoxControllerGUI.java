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
	
    private Stage mainStage;
    
    private String actualPassword;
    
    private SafeBox safeBox;
    
	
	public SafeBoxControllerGUI() 
	{		
	    safeBox = new SafeBox();
	}

    @FXML
    private Label labelTitle;

    @FXML
    private Label labelMessage;
    
    @FXML
    private Button btnOpen;

    @FXML
    private PasswordField pF1;

    @FXML
    private PasswordField pF4;

    @FXML
    private PasswordField pF5;

    @FXML
    private PasswordField pF6;

    @FXML
    private PasswordField pF2;

    @FXML
    private PasswordField pF3;

	public Stage getMainStage() 
	{
		return mainStage;
	}

	public void setMainStage(Stage mainStage) 
	{
		this.mainStage = mainStage;
	}

	//First window
	
	@FXML
    public void switchWindow(ActionEvent event) throws IOException
    {
		if( safeBox.verifyPassword( pF1, pF2, pF3, pF4, pF5, pF6, safeBox.getPass() ) )
		{
			
		//String concatenate = pF1.getText() + pF2.getText() + pF3.getText() + pF4.getText() + pF5.getText() + pF6.getText();
		
		//if( concatenate.matches("[0-9]*") )
		//{
			//if( concatenate.equals(actualPassword) )
			//{
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox2.fxml"));
				fxmlLoader.setController(this);
				Parent root = fxmlLoader.load();
				Scene scene = new Scene(root);
				mainStage.setScene(scene);
				mainStage.setTitle("SafeBox's Contents");
				mainStage.show(); 	
			//}
			//else
			//{
	    		//; labelMessage.setText("Enter numeric characters");
			//}
     	}
		//}
		
		else
		{
			labelMessage.setText("You're password is Incorrect");
		}
  
    }
 
	//Second Window
	
	

	
}
