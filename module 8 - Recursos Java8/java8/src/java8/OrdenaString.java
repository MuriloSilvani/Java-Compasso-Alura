package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		Collections.sort(palavras);
		System.out.println(palavras);

//		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
//		Collections.sort(palavras, comparador);
//		System.out.println(palavras);

//		Comparator<String> comparador2 = new ComparadorDeStringPorTamanho();
//		palavras.sort(comparador2);

//		palavras.sort(new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				if (s1.length() < s2.length())
//					return -1;
//				if (s1.length() > s2.length())
//					return 1;
//				return 0;
//			}
//		});

//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		});

//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

//		palavras.sort(Comparator.comparing(s -> s.length()));
		
		palavras.sort(Comparator.comparing(String::length));
		
		System.out.println(palavras);

//		Consumer<String> consumidor = new ConsumidorDeString();
//		palavras.forEach(consumidor);

//		Consumer<String> consumidor = new Consumer<String>() {
//		    @Override
//			public void accept(String s) {
//		        System.out.println(s);
//		    }
//		};
//		palavras.forEach(consumidor);

//		palavras.forEach(new Consumer<String>() {
//		    @Override
//			public void accept(String s) {
//		        System.out.println(s);
//		    }
//		});

//		palavras.forEach((String s) -> {
//			System.out.println(s);
//		});

//		palavras.forEach(s -> System.out.println(s));

		// metodos reference
		palavras.forEach(System.out::println);

	}
}

class ConsumidorDeString implements Consumer<String> {
	public void accept(String s) {
		System.out.println(s);
	}
}

class ComparadorDeStringPorTamanho implements Comparator<String> {
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
}