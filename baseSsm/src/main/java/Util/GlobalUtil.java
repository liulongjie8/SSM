package Util;
import com.google.gson.Gson;

public class GlobalUtil {

	public static Gson gson = new Gson();

	public static String toGson(Object obj) {
		return gson.toJson(obj);
	}

}
