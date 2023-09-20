package EnumHwNine;

public enum Size {
    EXTRASMALL("XS", 75, 60, "худе стерво"), //я знаю, що три поля треба було :)
    SMALL ("S", 80, 65, "стерво"),
    MEDIUM("M", 85, 70, "миленька"),
    LARGE("L", 90, 75, "левиця"),
    EXTRALARGE("XL", 95, 80,"харизматична левиця"),
    EXEXTRALARGE("XXL", 100, 85, "хазяцновита харизматична левиця");


    Size(String shortName, int leght, int weiht, String saySmth) {
        ShortName = shortName;
        Leght = leght;
        Weiht = weiht;
        SaySmth = saySmth;
    }

    private String ShortName;
    private int Leght;
    private int Weiht;
    private String SaySmth;


    public String getShortName() {
        return ShortName;
    }
    public int getLeght() {
        return Leght;
    }
    public int getWeiht() {
        return Weiht;
    }
    public String getSaySmth() {
        return SaySmth;
    }
}
