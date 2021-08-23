package model;

import javafx.scene.control.PasswordField;

public class SafeBox {
	
	private String pass = "000000";
	
	

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


	public boolean verifyPassword( PasswordField p1, PasswordField p2, PasswordField p3, 
			PasswordField p4, PasswordField p5, PasswordField p6, String password )
	{
		String concatenate = p1.getText() + p2.getText() + p3.getText() + p4.getText() + p5.getText() + p6.getText();
		boolean match = false;
		
		if( concatenate.equals(password))
		{
			match = true;
		}	
		
		return match;
				
	}
}
