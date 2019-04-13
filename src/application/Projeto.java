package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Projeto {

	public static void main(String[] args) {

       Locale.setDefault(Locale.US);
       
       Scanner sc = new Scanner(System.in);
       
       Retangulo ret = new Retangulo();
       
        System.out.println("Entre com a largura:");
        ret.altura = sc.nextDouble();
        
        System.out.println("Entre com a Altura:");
        ret.largura = sc.nextDouble();
        
        System.out.println("Area:"+ret.Area());
        System.out.println("Perimetro:"+ret.Perimetro());
        System.out.println("Diagonal:"+ret.Diagonal());
       
       sc.close();

	}

}
