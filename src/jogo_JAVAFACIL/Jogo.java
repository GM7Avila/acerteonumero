package jogo_JAVAFACIL;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class Jogo {

	public static void main(String[] args) {
		
		PrintStream show = System.out;
		Scanner sc = new Scanner(System.in);
		Random generator  = new Random();
		
		int option;
		int escolha_computer;
		int escolha_user=0;
		int hp;
		
		show.println("Ol�! Qual o seu nome?");
		String nome = sc.nextLine();
		show.println("Prazer em conhece-lo " + nome+ "!");
		show.println(nome + ", voc� quer jogar comigo?");
		show.println("Press 1 to Play or 2 to Exit");
		show.print("\n Informe o n�mero da sua op��o");
		option = sc.nextInt();
		
		if(option==2) {
			show.println("Que pena! Mas tudo bem, fica para a pr�xima.");
		}
		
		else if(option ==1) {
			show.println("\nOk! o jogo � assim...");
			show.println("Eu vou escolher um n�mero de 0 a 10!");
			show.println("Mas n�o vou te contar qual �...");
			show.println("Voc� inicia o jogo com 3 pontos de vida, e tem chance de acertar o n�mero que eu escolher, cada vez que voc� errar, voc� perder� 1 ponto de vida.");
			show.println("Se sua vida chegar a 0, voc� perde o jogo, caso voc� acerte o n�mero, voc� ganha o jogo!");
			
			escolha_computer = generator.nextInt(11);
			
			show.println("Ok, " +nome+". Eu j� escolhi!");
			show.println("Agora tente adivinhar!");

			for(hp=3; escolha_user != escolha_computer; hp--) {
				
				System.out.println("\nHP atual: "+hp+"/3");
				
				if (hp==0) {
					System.out.println("\n\nVoc� perdeu!");
					break;
				}
				
				System.out.print("Digite o n�mero: ");
				escolha_user = sc.nextInt();
				
				
				
				if (escolha_user == escolha_computer) {
					System.out.println("\n\nVoc� venceu!");
					break;
				}
				
				else System.out.println("N�mero errado! -1 de vida! ");
				
				
			}
			
			sc.close();

			
			System.out.println("\n\nFim do jogo");
			System.out.println("Score: " + hp);
		}
			
		

	}

}
