import java.util.stream.Stream;

public class Quiz {
	public static void main(String[] args){
	
		String[] a = {"AAA", "BBB", "CCC", "CSIS"} ;
		String[] COSE = {"CSIS", "ENG", "MATH", "AGNS", "PHYSCL", "BIO", "NUR"};
		
		
	//	String s = COSE.splite(( AAA )|( BBB ));
		
		Stream<String> result = Stream.of(a);
					for(String i : a) {
					System.out.println(result);	
	}
	}
}
