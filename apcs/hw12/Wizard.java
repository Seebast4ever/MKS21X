public class Wizard extends Actor{
    private int mana;

    public Wizard(String name, int str, int agi, int intel, int health){
        super(name,str,agi,intel,health);
        mana = 20;
    }
    public Wizard(String name){
        this(name,8,10,15,15);
    }
    public Wizard(){
        this("Oz the great and powerful");
    }

    public String attack(){
        return getName()+" swings his staff at the target";
    }

    public String specialAttack(){
        return getName()+" blasts the target with cosmic energy";
    }

    public String getResourceName(){
        return "mana";
    }
    public int getResource(){
        return mana;
    }
}