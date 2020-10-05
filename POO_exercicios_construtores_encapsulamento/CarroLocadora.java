package POO_exercicios_construtores_encapsulamento;

public class CarroLocadora extends Carro {
    private int precoAluguel;

    CarroLocadora(String _placa, int _precoAluguel){
        super(_placa);
        this.precoAluguel = _precoAluguel;
    }

    // metodo get
    public int getPrecoAluguel(){
        return this.precoAluguel;
    }

    // metodo set
    public void setPrecoAluguel(int novoPrecoAluguel){
        this.precoAluguel = novoPrecoAluguel;
    }
}
