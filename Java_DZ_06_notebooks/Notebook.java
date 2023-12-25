public class Notebook {
    String brand;
    int ram;
    int hdd;
    String os;
    String color;
    int price;
    
    @Override
    public String toString() {
        return "Brand: " + brand + ", RAM: " + ram + ", HDD: " + hdd + ", OS: " + os + ", Color: " + color + ", Price: " + price; 
    }
   @Override
   public boolean equals(Object obj) {
       // TODO Auto-generated method stub
       return super.equals(obj);
   }

}   