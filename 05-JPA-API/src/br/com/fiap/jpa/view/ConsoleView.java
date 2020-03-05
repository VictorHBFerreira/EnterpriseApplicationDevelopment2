package br.com.fiap.jpa.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.dao.FilmeDao;
import br.com.fiap.jpa.dao.FilmeDaoImpl;
import br.com.fiap.jpa.entity.Filme;
import br.com.fiap.jpa.entity.Genero;

public class ConsoleView {

	public static void main(String[] args) throws Exception {
		// Cadastrar um filme
		Scanner sc = new Scanner(System.in);
		// Cadastrar no banco de dados
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		FilmeDao dao = new FilmeDaoImpl(em);

		System.out.println("Digite a opção: \n1-Cadastrar\n2-Ler\n3-Atualizar\n4-Remover");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			Filme filme = carregarFilme(sc); //recebe os dados do usuário
			dao.cadastrar(filme);
			dao.commit();
			break;
		case 2:
			System.out.print("Digite o código: ");
			filme = dao.ler(sc.nextInt());
			System.out.println(filme.getNome());
			break;
		case 3:
			filme = carregarFilme(sc);
			System.out.print("Digite o código: ");
			filme.setCodigo(sc.nextInt());
			dao.atualizar(filme);
			dao.commit();
			break;
		case 4:
			System.out.print("Digite o código: ");
			dao.deletar(sc.nextInt());
			dao.commit();
		}
		
		em.close();
		fabrica.close();
		sc.close();
	}

	private static Filme carregarFilme(Scanner sc) throws ParseException {
		Filme filme = new Filme();

		System.out.print("Digite o nome: ");
		filme.setNome(sc.next() + sc.nextLine());

		System.out.print("Digite a data: (dd/mm/yyyy): ");
		Calendar data = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		data.setTime(sdf.parse(sc.next()));
		filme.setDataLancamento(data);

		System.out.print("Digite a duração: ");
		filme.setDuracao(sc.nextInt());

		// Exibe as constantes do Enum Genero
		System.out.println("Gêneros: ");
		for (Genero g : Genero.values()) {
			System.out.println(g);
		}

		System.out.print("Digite o gênero: ");
		filme.setGenero(Genero.valueOf(sc.next()));

		return filme;
	}

}
