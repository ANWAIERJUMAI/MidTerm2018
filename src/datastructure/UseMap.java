package datastructure;


import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> StateOfChina = new ArrayList<String>();
		StateOfChina.add("Beijing");
		StateOfChina.add("Shanghai");
		StateOfChina.add("Tianjin");
		StateOfChina.add("Shenzhen");

		List<String> StateOfTurkey= new ArrayList<String>();
		StateOfTurkey.add("Trabzon");
		StateOfTurkey.add("Ankara");
		StateOfChina.add("Rize");
		StateOfTurkey.add("Istanbul");


		Map<String, List<String>> ListOfCountryState= new LinkedHashMap<String, List<String>>();
		ListOfCountryState.put("CH", StateOfChina);
		ListOfCountryState.put("TR", StateOfTurkey);



		for (Map.Entry<String, List<String>> state : ListOfCountryState.entrySet()) {
			if (ListOfCountryState.get("TR").contains("Ankara")) {
				System.out.println(state.getKey() + "---> " + state.getValue());


			}

		}
	}
}
