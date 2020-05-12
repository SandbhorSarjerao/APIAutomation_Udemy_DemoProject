package files;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ReusableMethods {
	
	public static JsonPath rawToJson(Response r)
	{
		String response = r.asString();
		JsonPath x = new JsonPath(response);
		return x;
	}
	
	public static XmlPath rawToXML(Response r)
	{
		String response = r.asString();
		XmlPath x = new XmlPath(response);
		return x;
	}
	
	public static String getSessionKEY() {
		String str = null;
		return str;
	}
}
