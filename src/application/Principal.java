package application;

import java.util.Scanner;

import entities.Dollar;
import util.CurrencyConverter;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Dollar dl = new Dollar();
	
	System.out.println("What is the dollar price? ");
	dl.dollarPrice =  sc.nextDouble();
	
	System.out.println("How many dollars will be bought? ");
	dl.bought = sc.nextDouble();
	
	System.out.println("Amount to be paid in reais =  " + CurrencyConverter.conv(dl.dollarPrice, dl.bought) + "    PS:  6% IOF tax applied"  );
	

	
	sc.close();	

	}

}
