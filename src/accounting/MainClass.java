package accounting;

import javax.security.auth.login.LoginContext;

public class MainClass {
	
	protected boolean isPasswordCorrect = false;
	
	
	public static void main(String[] args) {
		MainWindow mainWin = new MainWindow();
		LoginPage loginWin = new LoginPage();
		
		loginWin.open();
			
	}

}
