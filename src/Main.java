import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        LocalDate data = mentoria.getData();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        String dataFormateed = data.format(formatter);

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);
        System.out.println(mentoria.getData());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Java Developer");
        bootcampJava.setDescricao("Descrição bootcamp java developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);



        Dev dev1 = new Dev();
        dev1.setNome("Rodrigo");
        dev1.inscreverBootcamp(bootcampJava);
        System.out.println(dev1.getNome() + " Conteúdos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println(dev1.getNome() + " Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println(dev1.getNome() + " Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        dev1.progredir();
        System.out.println(dev1.getNome() + " Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println(dev1.getNome() + " Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        dev1.progredir();

        System.out.println("------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Bruno");
        dev2.inscreverBootcamp(bootcampJava);
        System.out.println(dev2.getNome() + " Conteúdos inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println(dev2.getNome() + " Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println(dev2.getNome() + " Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}