package Prova;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int jogador,computador;
		
	Scanner teclado = new Scanner(System.in);
	System.out.println("____Pedra, Papel e Tesoura___");
	System.out.println("");
	System.out.println("1 - PEDRA");
    System.out.println("2 - PAPEL");
    System.out.println("3 - TESOURA");
    System.out.println("");
    System.out.println("Digite a opição que gostaria:");
    // logica do jogador
    jogador = teclado.nextInt();
     switch(jogador) {
     case 1:
    	 System.out.println("Jogador escoleu PEDAR");
    	 break;
     case 2:
    	 System.out.println("Jogador escoleu PAPEL");
    	 break;
     case 3:
    	 System.out.println("Jogador escoleu TESOURA");
    	 break;
    default:
    	System.out.println("Opção invalida!!!");
     }
    //logica do computador
    computador = (int)(Math.random()*3 + 1);
    teclado.close();
      switch(computador) {
      case 1:
     	 System.out.println("Computador escoleu PEDAR");
     	 break;
      case 2:
     	 System.out.println("Computador escoleu PAPEL");
     	 break;
      case 3:
     	 System.out.println("Computador escoleu TESOURA");
     	 break;
      }
      //logica do vencindor
      if(jogador == computador) {
      System.out.println("EMPATE");
	
	}else  if((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
		System.out.println("Jogador VEMCE");
		
	}else {
		System.out.println("Computador VEMCE");
	}
}
}
