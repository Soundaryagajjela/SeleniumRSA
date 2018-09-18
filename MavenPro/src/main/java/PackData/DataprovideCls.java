package PackData;

import org.testng.annotations.DataProvider;
//Comment
public class DataprovideCls {
	
	@DataProvider(name="dp1")
	public static Object[][] getData(){
		Object[][] obj= {
				{"mercury1","mercury1"},
				{"mercury","mercury"}};
		return obj;
	}
}
