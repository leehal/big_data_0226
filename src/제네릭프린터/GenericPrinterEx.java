package 제네릭프린터;

public class GenericPrinterEx {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        powderGenericPrinter.setMaterial(new Powder());
        Powder powder = powderGenericPrinter.getMaterial();
//        System.out.println(powderGenericPrinter);
        System.out.println(powder);

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();
        plasticGenericPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticGenericPrinter.getMaterial();
        System.out.println(plastic);
    }
}
