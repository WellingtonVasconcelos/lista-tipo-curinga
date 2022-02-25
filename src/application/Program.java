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

	//O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
	//Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo"
	
	public static void printList(List<?> list) {
		//Porém não é possível adicionar dados a uma coleção de tipo curinga 
		list.add(3);
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}