package treeSet;

import java.util.*;

public class TreeSetTest {
	public static void main(String[] args) {
		SortedSet<Item> parts = new TreeSet<>();
		parts.add(new Item("toaseter", 1234));
		parts.add(new Item("widget", 4562));
		parts.add(new Item("modem", 9912));
		System.out.println(parts);

		SortedSet<Item> sortByDescription = new TreeSet<>(
				new Comparator<Item>() {

					@Override
					public int compare(Item a, Item b) {
						String descrA = a.getDescription();
						String descrB = b.getDescription();
						return descrA.compareTo(descrB);
					}

				});
		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
	}
}
