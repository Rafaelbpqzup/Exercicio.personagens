package br.com.exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class brExercicios {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<String> personagens = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("digite o nome do personagem");
			personagens.add(entrada.nextLine());
			if (personagens.contains("Homem de Ferro"));
		}
		
		System.out.println(personagens);
		for (String personagem : personagens) {
			System.out.println(personagem);
			
		}
	}
}
