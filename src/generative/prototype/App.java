package generative.prototype;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] arg){
        List<Phone> phones = new ArrayList<>();
        List<Phone> phonesCopy = new ArrayList<>();

        iPhone iphone = new iPhone();
        iphone.cameraAmount = 3;
        iphone.size = 10;
        phones.add(iphone);

        iPhone copyIphone = (iPhone) iphone.clone();
        phonesCopy.add(copyIphone);

        Samsung samsung = new Samsung();
        samsung.cameraAmount = 3;
        samsung.size = 10;
        phones.add(samsung);

        Samsung copySamsung = (Samsung) samsung.clone();
        phonesCopy.add(copySamsung);

        cloneAndCompare(phones,phonesCopy);
    }

    private static void cloneAndCompare(List<Phone> phones, List<Phone> phonesCopy) {

        for (Phone phone : phones) {
            phonesCopy.add(phone.clone());
        }

        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i) != phonesCopy.get(i)) {
                System.out.println(i + ": different");
                if (phones.get(i).equals(phonesCopy.get(i))) {
                    System.out.println(i + ": identical");
                } else {
                    System.out.println(i + ": identical");
                }
            } else {
                System.out.println(i + ": same");
            }
        }
    }
}
