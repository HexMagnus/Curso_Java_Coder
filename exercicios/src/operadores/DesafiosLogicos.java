package operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		//Trabalho na terça(V ou F)
		//Trabalho na quinta(V ou F)
		
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		
		System.out.println("Comprou TV 50\"? " + comprouTV50); // barra na frente indica "ESCAPE"
		System.out.println("Comprou TV 50\"? " + comprouTV32);
		System.out.println("Comprou TV 32\" Sorvete? " + comprouSorvete);
		
		
		//Operador Unário!
		System.out.println("Mais saudávek" + !comprouSorvete);
	}

}
