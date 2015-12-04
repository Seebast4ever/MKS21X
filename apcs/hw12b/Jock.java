public class Jock extends Actor{
    private int buff;

    public Jock(String name, int str, int agi, int intel, int health){
        super(name,str,agi,intel,health);
        buff = 20;
    }
    public Jock(String name){
        this(name,8,10,15,15);
    }
    public Jock(){
        this("Joe Football");
    }

    public String attack(){
        return getName()+" punches the guts";
    }

    public String specialAttack(){
        return getName()+" sends a pulse of raw masculinity";
    }

    public String getResourceName(){
        return "buff";
    }
    public int getResource(){
        return buff;
    }
}