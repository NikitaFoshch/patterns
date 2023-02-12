package generative.singleton;

public class Pizza {
    private static Pizza dough;
    private static String text = "TAKE DOUGH!\n\n";

    public static Pizza getDough() {
        if (dough == null){
            dough = new Pizza();
        }
        return dough;
    }

    private Pizza(){

    }
    public void addText(String action){
        text += action + "\n";
    }

    public void showText(){
        System.out.println(text);
    }


}
