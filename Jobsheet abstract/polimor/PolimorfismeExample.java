package polimor;

class Hewan {
    public void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

class Kucing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Meong!");
    }
}

class Anjing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Guk guk!");
    }
}

public class PolimorfismeExample {
    public static void main(String[] args) {

        //polimorfisme
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();
        //override
        Kucing kcg = new Kucing();
        Anjing ajg = new Anjing();

        hewan1.bersuara(); // Output: Meong!
        hewan2.bersuara(); // Output: Guk guk!
        kcg.bersuara();
        ajg.bersuara();
    }
}

