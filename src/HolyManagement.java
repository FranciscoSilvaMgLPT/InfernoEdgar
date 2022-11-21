public class HolyManagement {

    public static void main(String[] args) {

        Hell hell = new Hell(1000, 800, "Devil");
        Paradise paradise = new Paradise(true);
        Paradise.Angel francisco = paradise.addAngel("FancyAngel", "Marika");
        Hell.Demon rafa = hell.addDemon(5, "Torture", "Ozuna");
        francisco.fly();
        rafa.info();
        francisco.info();
        rafa.fight();

    }
}