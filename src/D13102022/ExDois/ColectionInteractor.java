package D13102022.ExDois;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ColectionInteractor {
    public static void main(String[] args) {
        LinkedList<String> ListaUm = new LinkedList<>(List.of("Joao","Rodrigo","Ana","Matheus","Teto","Vitim"));
        LinkedList<String> ListaDois = new LinkedList<>(List.copyOf(ListaUm));

        ListaUm.removeLast();
        imprime(ListaUm, ListaDois);

        inserir(ListaUm, ListaDois);

    
    }
    
    public static<T> void imprime(List<T> Lista, List<T> Lista2)
    {
        
        Iterator<T> IT = Lista2.iterator();
        
        while(IT.hasNext())
        {
            T Temp = (T) IT.next();
            if(Lista.contains(Temp))
                System.out.println(Temp);
        }
    }

    public static<T> void   inserir(List<T> Lista, List<T> Lista2)
    {
        HashSet<T> hashUm = new HashSet<>(Lista);
        hashUm.retainAll(Lista2);
        System.out.println(hashUm);
    }
}
