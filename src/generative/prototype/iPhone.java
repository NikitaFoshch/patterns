package generative.prototype;

public class iPhone extends Phone {
    public int cameraAmount;
    public int size;

    public iPhone() {

    }

    public iPhone(iPhone target) {
        super(target);
        if (target != null) {
            this.cameraAmount = target.cameraAmount;
            this.size = target.size;
        }
    }

    @Override
    public Phone clone() {
        return new iPhone(this);
    }

}
