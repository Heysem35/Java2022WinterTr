package JavaPractice.practice_basic_day05;

    public class ObjectClass {
        /*
         * Object Class’i olusturun burada OgretmenBilgileri Class indan
         * object ureterek yeni
         * ogretmenler olusturun ve bilgilerini yazdirin
         */

        public static void main(String[] args) {

            OgretmenBilgileri ogr1= new OgretmenBilgileri();

            ogr1.brans="turkce";
            ogr1.yas= 23;
            ogr1.sınıf= 8;
            System.out.println(ogr1.toString());

            OgretmenBilgileri ogr2= new OgretmenBilgileri("gazi lisesi","matematik",32,7);
            System.out.println(ogr2.toString());
        }

    }

