import java.util.ArrayList;

public class Gearbox{
    private int maxGears;
    private ArrayList<Gear> gears;
    private int currentGear = 0;
    private boolean clutchIn;

    //constructor for the OuterClass(Gearbox)
    public Gearbox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in){
        this.clutchIn = in;
    }

    public void addGear(int gearNumber, double ratio){
        if (gearNumber > 0 && gearNumber <= maxGears){
            this.gears.add(new Gear(gearNumber, ratio));
        }
    }

    public void changeGear(int gearNumber){
        int prevGear = this.currentGear;
        if (gearNumber >= 0 && gearNumber < this.gears.size() && this.clutchIn){
            this.currentGear = gearNumber;
            System.out.println("Gear changed to " + gearNumber + " from " + prevGear);
        } else {
            System.out.println("Problem changing gear :(");
            this.currentGear = 0;
        }
    }

    private class Gear{
        private int gearNumber;
        private double ratio;
        //constructor for the innerClass(Gear)
        public Gear(int gearNumber, double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        public double driveSpeed(int revs){
            return revs * this.ratio;
        }
    }

}

