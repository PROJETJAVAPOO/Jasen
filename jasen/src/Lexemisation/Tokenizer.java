package Lexemisation;

import java.util.HashMap;
import java.util.Map;

public class Tokenizer {
	
	public static Map<Integer , String> decoupeBasique(String text)
	{
		if(text!= null)
		{
			String[] newtext = text.split("[ ,;:!.]\\(\\)");
			Map<Integer, String> index = new HashMap<>();
			for(int i=0; i<newtext.length;i++)
			{
				index.put(i, newtext[i]);
			}
			return index;
			
		}
		return null;
	}
	
	public static Map<Integer , String> parsefiletoindex(PATH path)
	{
		//TODO
	}
}
