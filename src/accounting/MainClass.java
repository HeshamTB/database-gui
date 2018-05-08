package accounting;


public class MainClass {
	
	protected boolean isPasswordCorrect = false;
	static MainWindow  mainWin = new MainWindow();
	static LoginPage loginWin = new LoginPage();
	
	public static void main(String[] args) {
		loginWin.open();
		
	}
	public static void runMainWin() {
		mainWin.open();
	}

}
