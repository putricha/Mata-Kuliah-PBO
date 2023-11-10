package Tugas;

public class Barrier implements IDestroyable {
    protected int strength;


 public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        strength -= (0.1 * strength);
    }

    public String getBarrierInfo() {
        return "Strength: " + strength;
    }
}


