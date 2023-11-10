package Tugas;
public abstract class Zombie implements IDestroyable {
    protected int health;
    protected int level;
    
    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    public abstract void heal();

    public abstract void destroyed();

    public String getZombieInfo() {
        String info = "";
        info += "Health : " + health +"\n";
        info += "Level  : " + level;
        return info;
    }
}
