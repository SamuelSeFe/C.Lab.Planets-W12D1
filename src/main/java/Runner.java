public class Runner {
    public static void main(String[] args) {
        Planet planet = new Planet("Mars", 908973);
        System.out.println(String.format("%s is %s", planet.getName(), planet.getSize()));
        System.out.println(planet.explode());
    }
}