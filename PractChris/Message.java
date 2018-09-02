import java.io.Serializable;

/*
La clase es una estructura de datos con un tiempo de vida 100, que conoce el id del destino y el origen
*/
public class Message{

        public final static int TTL_DEFAULT = 10;
    private int ttl;
    private String source;
    private String destination;
    private Serializable content;
    public Message(String source, String destination, Serializable content){
        this.source = source;
        this.destination = destination;
        this.content = content;
        this.ttl = TTL_DEFAULT;
    }
    public int getTTL(){
        return ttl;
    }
    public String getSource(){
        return source;
    }
    public String getDestination(){
        return destination;
    }
    public Serializable getContent(){
        return content;
    }
    public void setTTL(int ttl){
        this.ttl = ttl;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public String toString(){
        return "{source: "+ source+", destination: "+destination+", ttl: "+ttl+"}";
    }

        public Message clone(){
        Message m  = new Message(source, destination, content);
        m.ttl = this.ttl;
        return m;
    }
    
}