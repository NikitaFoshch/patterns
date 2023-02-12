package generative.prototype;

public abstract class Phone {
    private int cameraAmount;
    private int size;

    public Phone() {

    }

    public Phone(Phone target) {
        if (target != null) {
            this.cameraAmount = target.cameraAmount;
            this.size = target.size;
        }
    }

    public abstract Phone clone();

}
