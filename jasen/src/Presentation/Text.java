import java.util.*;

public class Text {
	String path;
	String presentation;
	
	public Text(String path) {
		this.path = path;
		List<String> tmp = parsefiletoindex(path);
		this.presentation = tmp.get(1)+" "+tmp.get(2)+ "...";
	}
	
	
}