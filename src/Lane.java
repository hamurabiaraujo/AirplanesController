package src;
/**
 * @author RAFAEL FERNANDES DE QUEIROZ
 * @author HAMURABI DE MEDEIROS ARAÚJO
 */

/**
 * @see Classe para representar as pistas do aeroporto. Cada pista pode ter apenas um avião por vez ou simplesmente estar vazia.
 */
public class Lane {
	private Airplane airplane;
	private String name;
	private boolean isOccupied;//true = ocupada | false = livre

	/**	
	 * 
	 */
	public Lane() {
		this.airplane = null;
		this.name = "DEFAULT NAME";
		this.isOccupied = true;
	}
	
	/**
	 * @see Inicializa uma pista
	 * @param airplane Airplane - Avião à ser "setado" na pista
	 */
	public Lane(String name, Airplane airplane){
		this.name = name;
		this.airplane = airplane;
		this.isOccupied = true;
	}
	
	/**
	 * @see "Seta" o avião da pista
	 * @param airplane Airplane - Avião à ser "setado" na pista
	 */
	public void setAirplane(Airplane airplane){
		this.airplane = airplane;
	}
	
	/**
	 * @return Retorna o avião que está na pista, caso haja algum
	 */
	public Airplane getAirplane(){
		return this.airplane;
	}
	
	/**
	 * @return O nome da pista
	 */
	public String getName() {
		return name;
	}

	/**
	 * @see "Seta" o nome da pista
	 * @param Nome da pista
	 */
	public void setName(String name) {
		this.name = name;
	}

	public boolean isOccupied() {
		return this.isOccupied;
	}
	
}
