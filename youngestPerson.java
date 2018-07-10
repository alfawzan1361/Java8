import java.util.Arrays;
import java.util.List;

/*
 * youngestPerson
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */

public class youngestPerson {
	
	public static class Person {
		public String name;
		public int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Kaled", 26), new Person("Aziz", 24), new Person("Sarah", 28));

		Person youngestPerson = list.stream().min((a, b) -> a.age - b.age).get();
		System.out.println("The youngest person is " + youngestPerson.name);
	}
}
