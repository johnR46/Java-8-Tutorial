class Car {
    private int gas;

    public Car(int inGas) {
        gas = inGas;
    }

    public void drive(int use) {
        gas -= use;
    }

    public int getGas() {
        return gas;
    }

}

class Truck extends Car {
    private String item;

    public Truck(int inGas) {
        super(inGas);
    }

    public void loadItem(String inItem) {
        item = inItem;
    }

    public String getItem() {
        return item;
    }

}

class RunSampleInheritance{
    public static void main(String []args){
        Truck T =  new Truck(200);
        T.loadItem("One Punch man ");
        T.drive(50);
        System.out.println("รถบรรทุก" + T.getItem());
        System.out.println("เหลือน้ำมัน "+ T.getGas());
    }
}

/*
 * class Truck {
 * 
 * private int gas; private String item;
 * 
 * public Truck(int inGas) { gas = inGas; }
 * 
 * public void drive(int use) { gas -= use; }
 * 
 * public int getGas() { return gas; }
 * 
 * public void loadItem(String inItem) { item = inItem; }
 * 
 * public String getItem() { return item; }
 * 
 * }
 */