package MalarzPodstawy;

class Obraz{
    private String kolor;
    private int dlugosc;
    public Obraz(String kolor,int dlugosc){
        this.kolor=kolor;
        this.dlugosc=dlugosc;
    }
//    public String getKolor(){
//        return this.kolor;
//    }
//    public void setKolor(String kolor){
//        this.kolor=kolor;
//    }
//    public int getDlugosc(){
//        return this.dlugosc;
//    }
//    public void setDlugosc(int dlugosc){
//        this.dlugosc=dlugosc;
//    }
    public void zmienKolor(String kolor){
         this.kolor=kolor;
    }
    public void skrocObrazoPrzekazanaWartosc(int skroc){
        if (skroc>this.dlugosc)System.out.println("Nie moge skrocic tej wartosci");
        else this.dlugosc-=skroc;
        }
        public void podajWlasciwosci(){
        System.out.println("Kolor:"+this.kolor+" Dlugosc:"+this.dlugosc);
        }
}

class Malarz{
    private int wiek;
    public Malarz(int wiek){
        this.wiek=wiek;
    }
//    public int getWiek(){
//        return this.wiek;
//    }
//    public void setWiek(int wiek){
//        this.wiek=wiek;
//    }
    public void PomalujObraz(Obraz cos,String kolor) {
        System.out.println("Malarz w wieku:"+this.wiek+" Pomaluje na kolor:"+kolor);
        if(this.wiek<40) cos.zmienKolor(kolor);
        else System.out.println("Nie można zmienić koloru!");
    }
}

public class Test{
    public static void main(String[]args){
        Obraz obr=new Obraz("czarny",40);
        Malarz mal=new Malarz(45);
        Malarz mal2=new Malarz(24);
        obr.podajWlasciwosci();
        mal2.PomalujObraz(obr,"czerwony");
        obr.podajWlasciwosci();
        mal.PomalujObraz(obr,"niebieski");
        obr.podajWlasciwosci();
        obr.skrocObrazoPrzekazanaWartosc(32);
        obr.podajWlasciwosci();
        obr.skrocObrazoPrzekazanaWartosc(9);
        obr.podajWlasciwosci();
    }
}
