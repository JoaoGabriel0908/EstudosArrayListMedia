package br.senai.array.listmedia;

public class Main {

	public static void main(String[] args) {
		
		Media objMedia = new Media();
		
		objMedia.receberNotas();
		objMedia.exibirNota();
		System.out.println("M�DIA FINAL: " + objMedia.calcularMedia());

	}

}
