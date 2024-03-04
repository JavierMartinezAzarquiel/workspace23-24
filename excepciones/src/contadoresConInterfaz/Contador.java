package contadoresConInterfaz;

public interface Contador {
	//un interface es un conjunto de métodos(comportamiento) común a varias clases
	
	public void incrementar() throws ContadorException;
	public void decrementar() throws ContadorException;
	public void reset();
}
