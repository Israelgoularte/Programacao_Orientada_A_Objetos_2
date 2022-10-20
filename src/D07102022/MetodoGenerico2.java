package D07102022;
public class MetodoGenerico2 {

    public static void main(String[] args) {
        Integer x=1,y=2,z=3;
        System.out.println("Integer: "+ x +" "+ y +" " +z +  " de " + calcula(x, y, z));

        Double d1=2.1,d2=2.3,d3=3.5;
        System.out.println("Double: "+ d1 +" "+ d2 +" " +d3 +  " de " + calcula(d1, d2, d3));

        Float f1=1.2F,f2=2.3F,f3=3.8F;
        System.out.println("Float: "+ f1 +" "+ f2 +" " +f3 +  " de "+calcula(f1, f2, f3));
    }

    public static  <T extends Comparable<T>>  T calcula(T  um, T dois, T tres)
    {
        if(um.compareTo( dois)>0)
        {
            if(um.compareTo( tres)>0)
            {
                return um;
            }else return tres;
        }else if(dois.compareTo( tres)>0)
                return dois;
        else return tres;
    }
    
}
