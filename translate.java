import java.util.Hashtable;
import java.util.Set;
import java.util.stream.Stream;

public class translate {
	public static void main(String[] args) {
		Hashtable<String, String> list = new Hashtable<String, String>();
	
		list.put("One", "A");
		list.put("Two", "B");
		list.put("Three", "C");
		
	    Stream.of(list);
	    System.out.println(list);
	}
}


