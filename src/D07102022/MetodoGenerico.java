package D07102022;
public class MetodoGenerico{
    public static void main(String[] args) {
        Integer[] IntegerArray = { 1,2,3,4,5,6,7};

        String[] StringArray = {"Israel", "Goularte"};

        Double[] DoubleArray = { 1.2,2.2,3.4,3.6,};

        System.out.println("IntegerArray");
        imprimeArray(IntegerArray);
        System.out.println("StringArray");
        imprimeArray(StringArray);
        System.out.println("DoubleArray");
        imprimeArray(DoubleArray);
    }

    public static <T> void imprimeArray(T[] Array)
    {
        for(T i : Array)
        {
            System.out.print(i);
        }
        System.out.println();
    }


}