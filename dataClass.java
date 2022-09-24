package Something;

import org.testng.annotations.DataProvider;

public class dataClass {

	@DataProvider(name="signin")
	public String[][] requiredDatas()
	{
		String[][] data = new String[2][3];
		data[0][0]="r@gmail.com";
		data[0][1]="pass1";
		data[0][2]="Rajesh";
		
		data[1][0]="k@gmail.com";
		data[1][1]="pass2";
		data[1][2]="Karthick";
		
		return data;
		
	}
}
