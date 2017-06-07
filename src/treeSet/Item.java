package treeSet;

import java.util.Objects;

public class Item implements Comparable<Item> {
	private int partNumber;
	private String description;

	public Item(String string, int i) {
		this.partNumber = i;
		this.description = string;
	}

	public int getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int compareTo(Item other) {
		return Integer.compare(partNumber, other.partNumber);
	}

	public int hashCode() {
		return Objects.hash(description, partNumber);
	}

	public String toString() {
		return "[descripion=" + description + ",partNumber=" + partNumber + "]";
	}

	public boolean equals(Object otherObject) {
		if (this == otherObject)
			return true;
		if (otherObject == null)
			return false;
		if (getClass() != otherObject.getClass())
			return false;
		Item other = (Item) otherObject;
		return Objects.equals(description, other.description)
				&& partNumber == other.partNumber;
	}
}
