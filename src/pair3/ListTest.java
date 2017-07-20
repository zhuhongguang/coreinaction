package pair3;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("1");
		list.add(" ");
		list.add("");
		list.add("1");
		list.add("2");
		Object s = list.get(1);
		String value = null;
		if (s != null) {
			value=String.valueOf(s);
		}
	}
}
