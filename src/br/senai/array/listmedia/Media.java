package br.senai.array.listmedia;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {
	
	Scanner sc;
	
	//CRIAÇÃO DE UM OBJETO DO TIPO ARRAYLIST DE STRINGS
	ArrayList<Double> arrNota = new ArrayList<Double>();
	
	
	double soma;
	double media;
	int contNota;
	
	//CONSTRUTOR DA CLASSE
	public Media() {
		
		sc = new Scanner (System.in);
		
		/*arrNota.add(10.0);
		arrNota.add(5.5);
		arrNota.add(8.0);
		arrNota.add(2.5);*/
	}

	public void receberNotas() {
		
		System.out.println("DIGITE UMA NOTA OU -1 PARA ENCERRAR: ");
		
		double nota = sc.nextDouble();
		
		while (nota >=0) {
			
			arrNota.add(nota);
			System.out.println("DIGITE UMA NOTA OU -1 PARA ENCERRAR: ");
			nota = sc.nextDouble();
			contNota++;
		}
	}
	public void exibirNota() {
		
		for (int i = 0; i < arrNota.size(); i++) {
			System.out.println("NOTA " + (i + 1) + " = " + arrNota.get(i));
		}
		
	}
	public double calcularMedia() {
		
		arrNota.forEach(nota->{
			
			soma += nota;
			
		});
		
		media = soma/contNota;
		return media;
	}

}
