package ar.com.meli.ic.operaciones;

public class Suma {
    private Integer numero1;

    private Integer numero2;

    public Suma(Integer n1, Integer n2){
        this.numero1 = n1;
        this.numero2 = n2;
    }

    public Integer sumar(){
        return this.numero1 + this.numero2;
    }
}
