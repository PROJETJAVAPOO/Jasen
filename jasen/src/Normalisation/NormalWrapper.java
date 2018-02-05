package Normalisation;

import Lexemisation.Tokenizer;

public class NormalWrapper {

	
	public static String wrapFileToNormalText(String path)
	{
		String text = Tokenizer.parsefiletoString(path);
		String newtext = new String();

		for(int i=0;i<text.length();i++)
		{
			if(Character.isUpperCase(text.charAt(i)))
			{
				newtext= newtext + String.valueOf(text.charAt(i)).toLowerCase();
			}
			newtext = newtext + String.valueOf(text.charAt(i));
		}
		return newtext;
	}
}