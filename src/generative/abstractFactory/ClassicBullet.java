package generative.abstractFactory;

public class ClassicBullet implements Bullet{
    @Override
    public void outputBullet() {
        System.out.println("Classic Bullet!");
    }
}
