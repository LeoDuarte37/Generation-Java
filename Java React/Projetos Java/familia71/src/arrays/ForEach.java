package arrays;

public class ForEach {

	public static void main(String[] args) {
		
		// Vetor
		String pessoas[] = { "Felipe", "Jonas", "Julia", "Marcos" };

        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }
        
        System.out.println("\n------------\n");
        
        // Matriz	
		String alunes[][] = { {"Felipe", "Jonas", "Julia"}, {"Mariana", "Carlos", "Juliana"}, {"Augusto", "Sabrina", "Julius"} };

		for (String[] linha : alunes) {
			for (String alune : linha) {
				System.out.println(alune);
			}
		}

	}

}
