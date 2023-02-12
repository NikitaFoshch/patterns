package generative.abstractFactory;

public class App {
    public static void main (String[] arg){
        Factory factory = new ClassicFactory();
        Factory incendiaryFactory = new IncendiaryFactory();
        factory.createBullet().outputBullet();
        factory.createRocket().outputRocket();
        incendiaryFactory.createBullet().outputBullet();
        incendiaryFactory.createRocket().outputRocket();
    }
}
