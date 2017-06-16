package src.main.java.labs.lab2;



public class PostStamp {
    private String name;
    private double price;
    private boolean  imported;
    private int date;
    private boolean unscathed;



    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isUnscathed() {
        return unscathed;
    }

    public void setUnscathed(boolean unscathed) {
        this.unscathed = unscathed;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostStamp(String name, double price, boolean imported, int date, boolean unscathed) {
        this.name = name;
        this.price = price;
        this.imported = imported;
        this.date = date;
        this.unscathed = unscathed;
    }

    public void countPrice() {
        int addPrice = 0;
        if (imported && !unscathed) {
            addPrice += 100;
        } else {
            if (imported) {
                addPrice += 50;
            }
        }
        if (date > 1930 && date < 1950) {
            addPrice += 40;
        } else {
            if (date <= 1930) {
                addPrice += 200;
            }
        }
        System.out.println("Цена марки" + (price + addPrice));


    }

    @Override
    public String toString() {
        return "PostStamp{" + "name='" + name + ", price=" + price +
                ", isInternational=" + imported +
                ", date=" + date + ", unscathed=" + unscathed + '}';
    }


}
