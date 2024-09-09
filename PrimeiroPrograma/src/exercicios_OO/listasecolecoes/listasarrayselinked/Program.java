package exercicios_OO.listasecolecoes.listasarrayselinked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<String> listaArray = new ArrayList<>();
		listaArray.add("AAA");
		listaArray.add("BBB");
		
		List<String> listaLinked = new LinkedList<>();
		listaLinked.add("111");
		listaLinked.add("222");
		
		System.out.println("ArrayList: " + listaArray);
		System.out.println("LinkedList: " + listaLinked);

	}

}
