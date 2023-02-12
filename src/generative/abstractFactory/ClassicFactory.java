package generative.abstractFactory;

public class ClassicFactory implements Factory{
    @Override
    public Bullet createBullet() {
        return new ClassicBullet();
    }

    @Override
    public Rocket createRocket() {
        return new ClassicRocket();
    }
}
