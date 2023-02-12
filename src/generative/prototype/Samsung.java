package generative.prototype;

public class Samsung extends Phone {
    public int cameraAmount;
    public int size;

    public Samsung() {

    }

    public Samsung(Samsung target) {
        super(target);
        if (target != null) {
            this.cameraAmount = target.cameraAmount;
            this.size = target.size;
        }
    }

    @Override
    public Phone clone() {
        return new Samsung(this);
    }
}