public class Square {
    int side;

    Square(int side) {
        this.side = side;
    }

    public void information() {
        System.out.println("Square side  = " + side);
        System.out.println("Wide         = " + countWide());
        System.out.println("Arroun       = " + countArround());
        
    }

    public int countWide() {
        int wide = side * side;
        return wide;
    }

    public int countArround() {
        int around = 4 * side;
        return around;
    }

}
