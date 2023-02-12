package generative.abstractFactory;

public class IncendiaryFactory implements Factory{
    @Override
    public Bullet createBullet() {
        return new IncendiaryBullet();
    }

    @Override
    public Rocket createRocket() {
        return new IncendiaryRocket();
    }
}
