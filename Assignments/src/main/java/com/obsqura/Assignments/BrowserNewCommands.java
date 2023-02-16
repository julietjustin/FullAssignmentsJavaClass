package com.obsqura.Assignments;

public class BrowserNewCommands extends SiteLogin {
	String actualTitle,actualURL,actualSource;
	public void basicCommands() {
		actualTitle=driver.getTitle();
		actualURL=driver.getCurrentUrl();
		actualSource=driver.getPageSource();
		
	}

	public static void main(String[] args) {
		BrowserNewCommands obj=new BrowserNewCommands();
		obj.openBrowser();
		obj.basicCommands();
		obj.browserClose();

	}

}
