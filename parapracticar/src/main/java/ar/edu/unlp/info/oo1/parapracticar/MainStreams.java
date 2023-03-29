package ar.edu.unlp.info.oo1.parapracticar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainStreams {

	public static void main(String[] args) {
		List<String>nombres = new ArrayList<>();
		nombres.add("ona2");
		nombres.add("ona");
		nombres.add("Brian");
		nombres.add("Marcos");
		
		
		List<String>conO= nombres.stream().filter(nom -> System.out.printlmn(nom.startsWith("o", 0));
	}

}
