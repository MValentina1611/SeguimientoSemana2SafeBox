package model;

import javafx.scene.control.PasswordField;

public class SafeBox {

	public static int verifyPassword( PasswordField [] p )
	{
		int correct = 0;
		for(int i = 0;  i < 6;  i++ )
		{
			if ( (p[i] != null) )
			{
				if( p[i].getText().equals("0") )
				{	
					correct++;
				}
			}
		}
		
		return correct;
				
	}
}
