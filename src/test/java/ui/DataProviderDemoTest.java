package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {

	
	@Test (dataProvider="dataSet")
	public void test (String username, String password) {
		System.out.println(username+"==="+password);
		
	}
	
	
	@DataProvider
	public Object[][] dataSet() {
		
		Object[][] dataset = new Object[4][2];
		dataset[0][0]="user1";
		dataset[0][1]="pass1";
		
		dataset[1][0]="user2";
		dataset[1][1]="pass2";
		
		dataset[2][0]="user3";
		dataset[2][1]="pass3";
		
		dataset[3][0]="user4";
		dataset[3][1]="pass4";
	
		return dataset;
		
	}
	

	
	
	
	
}
