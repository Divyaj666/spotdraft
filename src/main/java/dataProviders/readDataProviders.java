package dataProviders;

import org.testng.annotations.DataProvider;

import generic.baseTest;
import generic.webActionUtil;

public class readDataProviders {
	
	@DataProvider
	public Object[][] userLogin() 
	{
		Object[][] data=new Object[1][5];
		data[0][0]=webActionUtil.getData(baseTest.excelPath,"draft", 1, 0);
		data[0][1]=webActionUtil.getData(baseTest.excelPath,"draft", 1, 1);
		data[0][1]=webActionUtil.getData(baseTest.excelPath,"draft", 1, 2);
		
		return data;
	}

}
