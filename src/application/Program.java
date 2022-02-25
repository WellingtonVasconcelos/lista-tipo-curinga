package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	//O supertipo de qualquer tipo de lista � List<?>. Este � um tipo curinga:
	//Com tipos curinga podemos fazer m�todos que recebem um gen�rico de "qualquer tipo"
	
	public static void printList(List<?> list) {
		//Por�m n�o � poss�vel adicionar dados a uma cole��o de tipo curinga 
		list.add(3);
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}