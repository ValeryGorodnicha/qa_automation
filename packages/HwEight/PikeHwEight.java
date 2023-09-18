package HwEight;

public class PikeHwEight extends FishHwEight implements PredatoryFishHwEight {
    @Override
    public void swimSmwhere() {
        System.out.println("I live in the river.");
    }

    @Override
    public void eat() {
        System.out.println("I eat other fishes.");

    }
    public void color(String color){
        System.out.println("I am" + color);
    }

    @Override
    public void bitePeople() {
        System.out.println("I can attack people.");

    }

    @Override
    public void swimSpeed() {
        System.out.println("My speed is 10 km/hour.");

    }

    @Override
    public void size() {
        System.out.println("The length of my body can be 1.5 m.");

    }

    @Override
    public void age() {
        System.out.println("My life circle is 10 years");

    }
}
