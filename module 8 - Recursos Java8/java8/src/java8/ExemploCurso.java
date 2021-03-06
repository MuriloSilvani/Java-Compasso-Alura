package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCurso {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
//		cursos.forEach(c -> System.out.println(c.getNome()));

//		cursos.stream().filter(c -> c.getAlunos() >= 100);
		
//		cursos.stream().filter(c -> c.getAlunos() >= 100)
//			.forEach(c -> System.out.println(c.getNome()));
		
//		cursos.stream().filter(c -> c.getAlunos() >= 100)
////			.map(c -> c.getAlunos())
//			.map(Curso::getAlunos)
////			.forEach(total -> System.out.println())
//			.forEach(System.out::println);
		
		cursos.stream().filter(c -> c.getAlunos() >= 100)
			.mapToInt(Curso::getAlunos);
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .findFirst();
		
		cursos.stream()
	    	.mapToInt(c -> c.getAlunos())
	    	.average();
		
		Stream<Curso> stream = cursos.stream()
			.filter(c -> c.getAlunos() > 50);
		
		List<Curso> cursosFiltrados = cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.collect(Collectors.toList());
		
	}
}