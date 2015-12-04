public class Teacher extends Actor{
    private int authority;

    public Teacher(String name, int str, int agi, int intel, int health){
        super(name,str,agi,intel,health);
        authority = 20;
    }
    public Teacher(String name){
        this(name,8,10,15,15);
    }
    public Teacher(){
        this("Mr. Anderson");
    }

    public String attack(){
        return getName()+" puts the foot down";
    }

    public String specialAttack(){
        return getName()+" suspends the target and reduces their grades";
    }

    public String getResourceName(){
        return "authority";
    }
    public int getResource(){
        return authority;
    }
}