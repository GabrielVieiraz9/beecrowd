package distance_between_two_points;

import java.util.Scanner;
import java.text.DecimalFormat;

public class distance2p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas do primeiro ponto:");
		System.out.print("Digite o x1: ");
		double pontox1 = scanner.nextDouble();
		
		System.out.print("Digite o y1: ");
		double pontoy1 = scanner.nextDouble();
		
		System.out.println("Digite as coordenadas do segundo ponto:");
		System.out.print("Digite o x2: ");
		double pontox2 = scanner.nextDouble();
		
		System.out.print("Digite o y2: ");
		double pontoy2 = scanner.nextDouble();		
		
		double result = Math.sqrt(Math.pow(pontox2 - pontox1, 2) + Math.pow(pontoy2 - pontoy1, 2));
		
		DecimalFormat df = new DecimalFormat("#.####");
		
		String result4casas = df.format(result);
		
		System.out.println("A distância entre os pontos é: " + result4casas);
		
		scanner.close();

	}

}
