package postMan;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetPostMan {
	
	public void getMethodExample() throws IOException {
	URL url  = new URL("https://dummy.restapiexample.com/api/v1/employees");
	HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	connection.setRequestMethod("GET");
	connection.connect();
	}
}
