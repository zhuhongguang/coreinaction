package StringUtil;

import org.apache.commons.lang3.StringEscapeUtils;

public class StringUtil {
public static void main(String[] args) {
	String s=StringEscapeUtils.escapeEcmaScript("<script>alert('1111')</script>");
	System.out.println(s);
}

}