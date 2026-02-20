package cotroller;

public class Frases {
	
	public Frases() {
		super();
	}
	
	public int quantPalavras(String texto) {
		
		String[] partes = texto.split(";");

        return partes.length;
		
	}

}
