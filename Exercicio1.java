package ArrayListExercicio;

import java.util.ArrayList;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArrayList<String> listaCores = new ArrayList<String>();		
		
		listaCores.add("Azul");
		listaCores.add("Verde");
		listaCores.add("Vermelho");
		listaCores.add("Verde");
		listaCores.add("Amarelo");
		
		System.out.println(listaCores);
		
		listaCores.sort(null);
		System.out.println(listaCores);
		
	}

}
