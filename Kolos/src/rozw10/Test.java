package rozw10;

import java.util.ArrayList;
import java.util.List;

public class Test {

        public static void main(String[] args) {
                List<Osoba> osoby = new ArrayList<>();
                
                osoby.add(new Pracownik("a", "b", 40, 600));
                osoby.add(new Student("a", "b", 20, 700));
                
                
                System.out.println(osoby.get(0).wydatekOsobowy());
                System.out.println(osoby.get(1).wydatekOsobowy());
           //     System.out.println(osoby.get(3).wydatekOsobowy());
                
                System.out.println(osoby.get(1) instanceof Pracownik);
                System.out.println(osoby.get(1) instanceof Osoba);
                System.out.println(osoby.get(1) instanceof Student);
                System.out.println(osoby.get(0) instanceof Pracownik);


                
                List<Premiowany> premiowani = new ArrayList<>();
                premiowani.add(new Pracownik("a", "b", 40, 345));
                premiowani.add(new Doktorant());
                System.out.println(premiowani.get(0) instanceof Student);
                
                premiowani.get(0).ustalPremie(300);
                System.out.println(premiowani.get(0));
                
        }

}
