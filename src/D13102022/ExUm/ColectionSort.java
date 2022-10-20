package D13102022.ExUm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ColectionSort {
    public static void main(String[] args) {
        LinkedList<String> Nomes = new LinkedList<>(List.of("Joao","Rodrigo","Ana","Matheus","Teto","Vitim"));
        
        Collections.sort(Nomes);

        System.out.println(Nomes);
    }
}
