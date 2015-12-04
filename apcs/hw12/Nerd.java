public class Nerd extends Actor{
    private int smarts;

    public Nerd(String name, int str, int agi, int intel, int health){
        super(name,str,agi,intel,health);
        smarts = 20;
    }
    public Nerd(String name){
        this(name,8,10,15,15);
    }
    public Nerd(){
        this("Tim with glasses");
    }

    public String attack(){
        return getName()+" throws facts and spits pitifully";
    }

    public String specialAttack(){
        return getName()+" shoots beams out of his overpowered brain";
    }

    public String getResourceName(){
        return "smarts";
    }
    public int getResource(){
        return smarts;
    }
}