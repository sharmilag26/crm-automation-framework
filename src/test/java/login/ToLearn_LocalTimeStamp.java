package login;

import java.time.LocalDateTime;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_LocalTimeStamp {
	
@Test
public void test() {
	
	String timestamp= timestamp();
	Reporter.log(timestamp,true);
	
}

private String timestamp() {
	
	String time= LocalDateTime.now().toString().replace(":", "_");
	return time;
}

}
