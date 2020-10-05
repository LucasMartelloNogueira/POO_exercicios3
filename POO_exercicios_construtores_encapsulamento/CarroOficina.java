package POO_exercicios_construtores_encapsulamento;

public class CarroOficina extends Carro{
    private int precoReparo;

    CarroOficina(String _placa, int _precoReparo){
        super(_placa);
        this.precoReparo = _precoReparo;
    }

    // metodo get
    public int getPrecoReparo(){
        return this.precoReparo;
    }

    // metodo set
    public void setPrecoReparo(int novoPrecoReparo){
        this.precoReparo = novoPrecoReparo;
    }
}