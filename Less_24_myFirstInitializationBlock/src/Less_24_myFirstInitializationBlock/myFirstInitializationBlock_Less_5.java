package Less_24_myFirstInitializationBlock;

public class myFirstInitializationBlock_Less_5 {
    public static void main(String[] args) {
        Blade blade = new Blade();
    }
}

class IronOre {
    public IronOre() {
        System.out.println("Constructor of master-class IronOre");
    }
    static {System.out.println("1 - Static block of IronOre");}
    {System.out.println("Non static block of IronOre");}
}

class SteelBar extends IronOre {
    public SteelBar() {
        System.out.println("Constructor of SteelBar");
    }
    static {System.out.println("1 - Static block of SteelBar");}
    {System.out.println("Non static block of SteelBar");}
}

class Blade extends SteelBar {
    public Blade() {
        System.out.println("Constructor of Blade");
    }
    static {System.out.println("1 - Static block of Blade");}
    {System.out.println("Non static block of Blade");}
}