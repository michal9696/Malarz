package MalarzPodstawy;

class Obraz2{
    private String kolor;
    private int dlugosc;
    public Obraz2(String kolor,int dlugosc){
        this.kolor=kolor;
        this.dlugosc=dlugosc;
    }

    public void zmienKolor(String kolor){
        this.kolor=kolor;
    }

    public void skrocObraz(int x){
        System.out.println("Proba skrocenia obrazu o"+x+"!");
        if(x>this.dlugosc)System.out.println("Nie można o tyle skrocic obrazu");
        else this.dlugosc-=x;
    }
    public void podajWlasciwosci(){
        System.out.println("Kolor obrazu to: "+this.kolor+"a jego dlugosc to: "+this.dlugosc+"!");
    }
}
class Malarz2{
    private int wiek;
    public Malarz2(int wiek){
        this.wiek=wiek;
    }
    public void pomalujObraz(Obraz2 cos,String kolor){
        System.out.println("Ja malarz w wieku: "+this.wiek+"lat, pomaluje obraz na kolor: "+kolor+"!");
        if(this.wiek<40)cos.zmienKolor(kolor);
        else System.out.println("koloru nie mozna zmienic");
    }
}
public class Test2{
    public static void main(String[] args){
        Obraz2 o1=new Obraz2("niebieski",20);
        Malarz2 m1=new Malarz2(25);
        Malarz2 m2=new Malarz2(45);
        o1.podajWlasciwosci();
        m2.pomalujObraz(o1,"czerwony");
        o1.podajWlasciwosci();
        m1.pomalujObraz(o1,"czarny");
        o1.podajWlasciwosci();
        o1.skrocObraz(30);
        o1.podajWlasciwosci();
        o1.skrocObraz(5);
        o1.podajWlasciwosci();
    }
}
