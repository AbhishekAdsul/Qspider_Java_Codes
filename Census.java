public class Census {
    public static void main(String[] args) {
        long currentPopulation = 312032486;
        double seconds = (365*24*60*60)*5;
        double birth = seconds/7;
        double death = seconds/13;
        double immigrant = seconds/45;
        double newPopulation = currentPopulation+birth+immigrant-death;
        System.out.println("Current Population: "+currentPopulation);
        System.out.println("New Population: "+newPopulation);
    }
}
