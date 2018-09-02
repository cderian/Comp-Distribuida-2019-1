/**
 * La clase es una estructura de datos con un tiempo de vida 100,
 * que conoce el id del destino y el origen
 */
public class Message{

	public final static VIDA = 10;
	private String origen;
	private String destino;
	private int tiempo_vida;

	/**
	 * Constructor de un Mensaje
	 * @param origen el origen del mensaje.
	 * @param destino el destino del mensaje.
	 */
    public Message(String origen, String destino){
    	this.origen = origen;
    	this.destino = destino;
    	this.tiempo_vida = VIDA;
    }

    public String getOrigen(){
    	return this.origen;
    }

    public String getDestino(){
    	return this.destino;
    }

    public int getTiempoVida(){
    	return this.tiempo_vida;
    }

    public void setOrigen(String origen){
    	this.origen = origen;
    }

    public void setDestino(String destino){
    	this.destino = destino;
    }

    public void setTiempoVida(int tiempo_vida){
    	this.tiempo_vida = tiempo_vida;
    }

    public String toString(){
    	String s = "Origen: " + this.origen + ". Destino: " + this.destino;
    	s+=". Tiempo de Vida: " + this.tiempo_vida + ".";
    	return s;
    }
    
}
