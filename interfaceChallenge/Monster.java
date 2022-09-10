import java.util.List;
import java.util.ArrayList;

public class Monster implements ISaveable{
    // write code here
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    // three getters
    public String getName(){
        return this.name;
    }

    public int getHitPoints(){
        return this.hitPoints;
    }

    public int getStrength(){
        return this.strength;
    }

    public List<String> write(){
        List<String> list = new ArrayList<>();
        list.add( this.getName() );
        list.add( "" + this.getHitPoints() );
        list.add( "" + this.getStrength() );
        return list;
    }

    public void read(List<String> list){
        if (list.size() > 0 && list != null){
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt( list.get(1) );
            this.strength = Integer.parseInt( list.get(2) );
        }
    }

    public String toString(){
        return "Monster{name='" + this.getName() + "', hitPoints=" + this.getHitPoints() + ", strength=" + this.getStrength() + "}";
    }
}