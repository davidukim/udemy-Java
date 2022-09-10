import java.util.List;
import java.util.ArrayList;

public class Player {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getWeapon(){
        return this.weapon;
    }

    public void setWeapon(String weapon){
        this.weapon = weapon;
    }

    public int getHitPoints(){
        return this.hitPoints;
    }

    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public int getStrength(){
        return this.strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public List<String> write(){
        List<String> list = new ArrayList<>();
        list.add(this.name);
        list.add(this.weapon);
        list.add( "" + this.getHitPoints() );
        list.add( "" + this.getStrength() );
        return list;
    }

    public void read(List<String> list){
        if (list.size() > 0 && list != null){
            this.name = list.get(0);
            this.weapon = list.get(1);
            this.hitPoints = Integer.parseInt(list.get(2));
            this.strength = Integer.parseInt(list.get(3));
        }
    }

    public String toString(){
        return "Player{name ='" + this.getName() + "', hitPoints=" + this.getHitPoints() + ", strength=" + this.getStrength() + ",  weapon='" + this.getWeapon() + "'}";
    }
}

