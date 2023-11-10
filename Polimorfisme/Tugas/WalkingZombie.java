package Tugas;

public class WalkingZombie extends Zombie {

    WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += health * 0.2;
                break;
            case 2:
                health += health * 0.3;
                break;
            case 3:
                health += health * 0.4;
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.19;
    }


    
    public String getZombieInfo() {
        String info = "Walking Zombie Data\n" ;
        info += "Health : " + health + "\n";
        info += "Level  : " + level;
        return info;
    }
}
