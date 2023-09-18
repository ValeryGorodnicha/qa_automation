package HwEight;

public class CatfishHwEight extends FishHwEight implements PredatoryFishHwEight{
    @Override
    public void swimSmwhere() {
        System.out.println("I live in the rivers and the lakes.");
    }

    @Override
    public void eat() {
        System.out.println( "I eat the little fishes, spawn,flies and a corpse.");
    }


    @Override
    public void bitePeople() {
        System.out.println("I am not attack human");

    }

    @Override
    public void swimSpeed() {
        System.out.println("5km/hour");

    }

    @Override
    public void size() {
        System.out.println("My size can be up to 1.5m ");
    }

    @Override
    public void age() {
        System.out.println("10 years");
    }

    }
