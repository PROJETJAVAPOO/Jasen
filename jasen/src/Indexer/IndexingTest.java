import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IndexingTest {
	public String path="";
	
	
	public static void indexation(String[] args)
	{
		Map<Integer , String> index = Tokernizer.decoupeBasique(path);
		List<String> motstrouve = new ArrayList<>();
		for(String mot:args)
		{
			if(index.containsValue(mot))
			{
				System.out.println( " le mot "+mot+" existe aux lignes la ligne: ");	
			}
		}
	}
}