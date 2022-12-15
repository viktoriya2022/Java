package Final_Project_Laptop;

public class Laptop {
    int id;
    String tm, model, colour, os;
    int ram, hd, price;
    double screen;

    public Laptop(int id, String tm, String colour, String os, int ram, int hd, int price, Double screen) {
        this.id = id;
        this.tm = tm;
        this.colour = colour;
        this.ram = ram;
        this.hd = hd;
        this.os = os;
        this.price = price;
        this.screen = screen;

    }

    public static StringBuilder getLaptopByTm(Laptop[] lt, String tm) {
        StringBuilder result = new StringBuilder();
        for (Laptop c : lt) {
            if (tm.equalsIgnoreCase(c.tm)) {
                result.append("tm: " + c.tm + ", ");
                result.append("colour: " + c.colour + ", ");
                result.append("RAM: " + c.ram + ", ");
                result.append("HD: " + c.hd + ", ");
                result.append("OS: " + c.os + ", ");
                result.append("price: " + c.price + ", ");
                result.append("screen: " + c.screen + "\n");
            }
        }
        return result;
    }

    public static StringBuilder getLaptopByHD(Laptop[] lt, int hd) {
        StringBuilder result = new StringBuilder();
        for (Laptop c : lt) {
            if (hd == c.hd) {
                result.append("tm: " + c.tm + ", ");
                result.append("colour: " + c.colour + ", ");
                result.append("HD: " + c.hd + ", ");
                result.append("RAM: " + c.ram + ", ");
                result.append("OS: " + c.os + ", ");
                result.append("price: " + c.price + ", ");
                result.append("screen: " + c.screen + "\n");
            }
        }
        return result;
    }

    public static StringBuilder getLaptopByRAM(Laptop[] lt, int ram) {
        StringBuilder result = new StringBuilder();
        for (Laptop c : lt) {
            if (ram == c.ram) {
                result.append("tm: " + c.tm + ", ");
                result.append("colour: " + c.colour + ", ");
                result.append("HD: " + c.hd + ", ");
                result.append("RAM: " + c.ram + ", ");
                result.append("OS: " + c.os + ", ");
                result.append("price: " + c.price + ", ");
                result.append("screen: " + c.screen + "\n");
            }
        }
        return result;
    }

    public static StringBuilder getLaptopByOS(Laptop[] lt, String os) {
        StringBuilder result = new StringBuilder();
        for (Laptop c : lt) {
            if (c.os.contains(os)) {
            // if (os.equalsIgnoreCase(c.os)) {
                result.append("tm: " + c.tm + ", ");
                result.append("colour: " + c.colour + ", ");
                result.append("RAM: " + c.ram + ", ");
                result.append("HD: " + c.hd + ", ");
                result.append("OS: " + c.os + ", ");
                result.append("price: " + c.price + ", ");
                result.append("screen: " + c.screen + "\n");
            }
        }
        return result;
    }

    public static StringBuilder getLaptopByColour(Laptop[] lt, String colour) {
        StringBuilder result = new StringBuilder();
        for (Laptop c : lt) {
            if (colour.equalsIgnoreCase(c.colour)) {
                result.append("tm: " + c.tm + ", ");
                result.append("colour: " + c.colour + ", ");
                result.append("RAM: " + c.ram + ", ");
                result.append("HD: " + c.hd + ", ");
                result.append("OS: " + c.os + ", ");
                result.append("price: " + c.price + ", ");
                result.append("screen: " + c.screen + "\n");
            }
        }
        return result;
    }

    public static StringBuilder getLaptopByPrice(Laptop[] lt, int price_min, int price_max) {
        StringBuilder result = new StringBuilder();
        for (Laptop c : lt) {
            if (c.price >= price_min && c.price <= price_max) {
                result.append("tm: " + c.tm + ", ");
                result.append("colour: " + c.colour + ", ");
                result.append("HD: " + c.hd + ", ");
                result.append("RAM: " + c.ram + ", ");
                result.append("OS: " + c.os + ", ");
                result.append("price: " + c.price + ", ");
                result.append("screen: " + c.screen + "\n");
            }
        }
        return result;
    }

    public static StringBuilder getLaptopByScreen(Laptop[] lt, Double scr) {
        StringBuilder result = new StringBuilder();
        for (Laptop c : lt) {
            if (scr == c.screen) {
                result.append("tm: " + c.tm + ", ");
                result.append("colour: " + c.colour + ", ");
                result.append("HD: " + c.hd + ", ");
                result.append("RAM: " + c.ram + ", ");
                result.append("OS: " + c.os + ", ");
                result.append("price: " + c.price + ", ");
                result.append("screen: " + c.screen + "\n");
            }
        }
        return result;
    }

    @Override
    public String toString() { // выводит на печать инфу по каждому ноуту
        return String.format("id: %d, TM: %s, RAM: %d, HD: %d, screen: %.1f, colour: %s, price: %d",
                id, tm, ram, hd, screen, colour, price);
    }
}
