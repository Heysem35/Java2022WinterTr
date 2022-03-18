package day12_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir kelime isteyin,
        // kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle= "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkkullanım= cumle.indexOf(kelime); // -1 dönerse yok demektir
int ikincikullanım = cumle.indexOf(kelime,ilkkullanım+1);

        if (ilkkullanım==(-1)) {
            System.out.println("kullanılmamıs");

        } else if (ikincikullanım ==-1) {
            System.out.println("cumlede 1 kere kullanılmıs");

        }else {
            System.out.println("1den fazla kullanılmıs ");

        }


    }
}
