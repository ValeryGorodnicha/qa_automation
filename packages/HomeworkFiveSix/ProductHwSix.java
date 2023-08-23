package valerypackage;

public class ProductHwSix {

    public ProductHwSix (){
        System.out.println("New product is created.");
    }
//fields
    private String NameOfItem;
    private int ArtikelNumber;
    private double PriceOfItem;
    private String Discription;
    private boolean Availability;

//methods
public void setNameOfItem(String NameOfItem) {
    this.NameOfItem = NameOfItem;
}
public String getNameOfItem() {
        return NameOfItem;
    }
    public void setArtikelNumber(int ArtikelNumber) {
        this.ArtikelNumber = ArtikelNumber;
    }
    public int getArtikelNumber() {
        return ArtikelNumber;
    }
    public void setPriceOfItem(double PriceOfItem) {
        this.PriceOfItem = PriceOfItem;
    }
    public double getPriceOfItem() {
        return PriceOfItem;
    }

    public void setDiscription(String Discription) {
        this.Discription = Discription;
    }
    public String getDiscription() {
        return Discription;
    }

    public void setAvailability(boolean Availability) {
        this.Availability = Availability;
    }
    public boolean getAvailability() {
        return Availability;
    }


}




