package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {

		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> list=new ArrayList<String>();
		list.add("Sun");
		list.add("Moon");
		list.add("Star");
		for(String name:list) {

			System.out.println(name);
			Iterator name1=list.iterator();
			while(name1.hasNext()){
				System.out.println(name1.next());
			}
		}


	}

}
