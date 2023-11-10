package Tugas;

public class JumpingZombie extends Zombie{
    JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += health * 0.3;
                break;
            case 2:
                health += health * 0.4;
                break;
            case 3:
                health += health * 0.5;
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 1.906;
    }
    public String getZombieInfo() {
        String info = "Jumping Zombie Data\n";
        info += "Health : " + health + "\n";
        info += "Level  : " + level;
        return info;
    }
}
