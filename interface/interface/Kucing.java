public class Kucing extends Hewan implements  IVivipar{

    String habitat;

 


    public void makan() {
        System.out.println("Kucing sedang makan.");
    }

    public void minum() {
        System.out.println("Kucing sedang minum.");
    }
    
    public void melahirkan() {
        System.out.println("Kucing  melahirkan anaknya.");
    }
    
    public void menyusui() {
        System.out.println("Kucing menyusui");
    }

    public void mengeong() {
        System.out.println("Kucing mengeong");
    }

    public void getHabitat() {
        habitat = "Darat";
    }


}
