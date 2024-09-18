import java.util.*;

public class HolaMundo {
public static void main(String[] args) {
	System.out.println("Hola Mundo :)");
	ArrayList<String> array = new ArrayList<String>();
	array.add("Hello");
	for (String s:array) {
		System.out.println(s);
		array.add("Hola");
	}
}
}
