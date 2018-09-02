import java.util.HashMap;
import java.util.LinkedList;

public class Transport{

    public final static int CAPACIDAD = 500;

    private static Transport transport;
    private HashMap<String, LinkedList<Message>> map;
    private int size;

    /**
     * Constructor de Transport
     */
    private Transport(){
        map = new HashMap<String, LinkedList<Message>>();
        size = 0;
    }

    public static Transport getInstance(){
        if(transport == null){
            transport = new Transport();
        }
        return transport;
    }

    public synchronized boolean put(Message m){
        boolean status = false;

        if(!map.containsKey(m.getDestino())){
            map.put(m.getDestination(), new LinkedList<Message>());
        }
        
        if(size < CAPACIDAD){
            map.get(m.getDestino()).add(m);
            size++;
            status = true;
            sleep(10);
        }
        
        return status;
    }

    public synchronized Message pop(String key){
        Message m = null;

        if(map.containsKey(key)){
            LinkedList<Message> list = map.get(key);
        
            if(!list.isEmpty()){
                m = list.pop();
                size--;
                sleep(30);
            }
        }
        return m;
    }

    private void sleep(int ms){
        try{
            Thread.sleep(ms);
        }catch(Exception ex){
        }
    }
}
