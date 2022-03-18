package day12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir kelime isteyin,
        // kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle= "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkkullanım= cumle.indexOf(kelime); // -1 dönerse yok demektir
        int sonkullanım= cumle.lastIndexOf(kelime);
        if (ilkkullanım==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if (ilkkullanım==sonkullanım){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }

        String str="eclipse";
        System.out.println(str.lastIndexOf("p",4)); //4 dahil




    }
}
