package JavaPractice.practice_basic_day05;

public class OgretmenBilgileri {
    /* OgretmenBilgileri  Class’i olusturun bu Class’da bir Ogretmen icin gerekli
     * bilgileri girebilecegim Instance Variable’lar olusturun
     * ve main method icinde bu variable’lara deger atayin (variable lar buasamada static olmali..)
     * ve yazdirin
     *Not:Ornegin; 1 class, class icinde 1 tane static ve 1 tane de instance variable var.
	 Bu class'dan 10 object olusturulursa 1 tane static variable ve 10 tane
	 instance variable uretilmis demektir.
     */


    String okulismi= "yildiz koleji";
    String brans;
    int yas;
    int sınıf;


    OgretmenBilgileri(){}


    OgretmenBilgileri(String okulismi, String brans, int yas, int sınıf){

        this.okulismi=okulismi;
        this.brans=brans;
        this.yas=yas;
        this.sınıf=sınıf;

}

    public String toString(){
        String ogretmenbilgileri= "okulismi: "+okulismi +"\n bransı: "+ brans + "\n yası:" + yas +
                "\n sınıf :" +sınıf;

        return ogretmenbilgileri;
    }
}
