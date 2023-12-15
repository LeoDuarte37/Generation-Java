package poo;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Empregado lista[] = new Empregado[3];
		
		lista[0] = new Empregado("Carol Ferreira", 20000);
		lista[1] = new Empregado("Leonardo Duarte", 35000);
		lista[2] = new Empregado("Carol Araujo", 10000);
		
		for (Empregado colaborador : lista) {
			colaborador.imprimir();
		}
		
		System.out.println("\n---------------------------------------------\n");
		
		for (Empregado colaborador : lista) {
			colaborador.aumentarSalario(10);
			colaborador.imprimir();
		}
	}

}
