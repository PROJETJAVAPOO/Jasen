import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tokenizer {

	public static Map<Integer, String> decoupeBasique(String URL) {
		if (URL != null) {
			List<String> pnewtext = parsefiletoindex(URL);
			Map<Integer, String> interindex = new HashMap<>();
			for (int y = 0; y < interindex.size(); y++) {
				String[] newtext = pnewtext.get(y).split("[ ,;:!.]\\(\\)");
				for (int i = 0; i < newtext.length; i++) {
					interindex.put(y, newtext[i]);
				}
			}
			return interindex;

		}
		return null;
	}

	public static List<String> parsefiletoindex(String path) {
		try {

			List<String> encoded = Files.readAllLines(Paths.get(path));
			return encoded;
		} catch (IOException e) {
			return null;
		}
	}
}