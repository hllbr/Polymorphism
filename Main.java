//1.class
class Hayvan {
    private String isim ;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus (){
        return "hayvan konusuyor" ;
        
    }
}
//2.class
class Kopek extends Hayvan{
    
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() +" havlıyor..."; //To change body of generated methods, choose Tools | Templates.
    }
    
}
//3.class
class aslan extends Hayvan{
    
    public aslan(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() +" Kükrüyor..";//To change body of generated methods, choose Tools | Templates.
    }
    
}
//4.class
class sırtlan extends Hayvan{

    @Override
    public String konus() {
        return this.getIsim() +" Sırıtıyor.."; //To change body of generated methods, choose Tools | Templates.
    }
    
    public sırtlan(String isim) {
        super(isim);
    }
    
}
//5.class
class At extends Hayvan{
    
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() +" Kişniyor.."; //To change body of generated methods, choose Tools | Templates.
    }
    
} 

public class Main {
    //işlemleri hızlandırmak ve çokbiçimlilik net olarak görmek için yazılmış bir metod
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    public static void main(String[] args) {
        konustur(new aslan("mıko"));//çok biçimliliğin zirve noktalarından biri kullanım kolaylığı en yüksek noktada
        konustur(new At("diego"));
        /*standart yöntem
        Hayvan hy = new Hayvan("habu");
        System.out.println(hy.konus());
        Hayvan hır = new sırtlan("phip");//çok biçimlilik
        System.out.println(hır.konus());
        //2. bir class ile deneyelim
        Hayvan hayvan22 = new aslan("mophi");
        System.out.println(hayvan22.konus());
        Hayvan hayvan_at = new At("düldül");
        System.out.println(hayvan_at.konus());
        */

        /*
        oop için önemli konulardan bir tanesidir.
        türkçe adı çok biçimliliktir.
        ne işe yarar çok biçimlilik ?
        bir nesnenin birden farklı nesne gibi davranması olarak tanımlanabilir.
        biz bir java dosyasının içine birden fazla class koyabiliyoruz şimdi bu özelliğimizden yararlanacağız.
        */
        
        /*
        burada referansımız birden fazla obje gibi davranıyor...
        çok biçimlilik oluşması için şartlar var
        1 adet ana class bizim projemizde bu hayvan classı oluyor.
        diğer classlar alt class olacak 
        alt classların referanslarını üst classtaki referansa eşitleyebiliyoruz.
        bizim phip bir sırtlan gibi davrandı 
        
        ***********bir objeyi birden faklı obje gibi kullanabiliyorsunuz 
        ancak bunun için mutlaka ve mutlaka inheritance şeklinde bir yapının olması gerekiyor 
        ****************
        */
  
        /*
        eğer bizim at classımızda konus metodu olmasaydı hayvan da bulunan konus metodunu çağıracaktı.
        öncelik alt sınıfta bulunana veriliyor.
        çok biçimlilikte tür dönüşümü ihtiyacı ortadan kaldırılıyor.
        
        */
        
    }
    
}
