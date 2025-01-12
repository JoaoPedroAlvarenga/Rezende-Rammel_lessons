package com.gomes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo02 {
	
	File file = new File("C:\\Trabalhos-Lucas\\eclipse-files\\informacoes02.txt"); 
	//Passar o arquivo de texto caso ele seja usado o mesmo diret�rio mais de uma vez;
	
	/*public void salvar() {
		
		String[] info = new String[4]; //V�riavel para passar os valores
		
		try {
			FileWriter fw = new FileWriter(file); //Ler o Arquivo
			Scanner sc = new Scanner(System.in); //Habilita ao console a permiss�o
			
			System.out.println("Digite: ");
			
			for (int i = 0; i < info.length; i++) {
				info[i] = sc.nextLine(); //Passar valores;
				fw.write(info[i] + "\r\n"); //Joga para o arquivo de texto;
			}
			
			System.out.println("\n===== SALVO ===== \n");
			
			sc.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} */
	
	public void recuperarTransferir() {
	
		try {
			FileWriter fw = new FileWriter("C:\\Trabalhos-Lucas\\eclipse-files\\info03.txt"); //Cria um outro arquivo;
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite o n�mero (1-4) desej�vel para a transfer�ncia: ");
			int num = sc.nextInt(); //Uso do scanner;
			
			//System.out.println("Transferindo dados... \n");
			//System.out.println("Dados transferidos:");
			
			String linha = bf.readLine(); //Para iniciar a leitura linha a linha; 
			
			while(linha != null) {
				
				if ( num == Integer.parseInt( linha.substring(0, 4)) ) {
					System.out.println(linha.substring(4, linha.length() )); //subString() => ler a string como um array de characteres ( char[] ); 
					fw.write(linha);
				}
				
				linha = bf.readLine();
			}
			
			sc.close();
			fw.close();
			bf.close();
			fr.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}