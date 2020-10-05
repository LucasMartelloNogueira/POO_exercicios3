package POO_exercicios_construtores_encapsulamento;

public class CarroDetran extends Carro{
    private int codigoDetran;

    CarroDetran(String _placa, int _codigoDetran){
        super(_placa);
        this.codigoDetran = _codigoDetran;
    }

    // metodo get
    public int getCodigoDetran(){
        return this.codigoDetran;
    }

    // metodo set
    public void setCodigoDetran(int novoCodigo){
        this.codigoDetran = novoCodigo;
    }
}
