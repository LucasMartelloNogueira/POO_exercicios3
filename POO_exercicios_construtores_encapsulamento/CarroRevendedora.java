package POO_exercicios_construtores_encapsulamento;

public class CarroRevendedora extends Carro {
    private int precoRevenda;

    CarroRevendedora(String _placa, int _precoRevenda){
        super(_placa);
        this.precoRevenda = _precoRevenda;
    }

    // metodo get
    public int getPrecoRevenda(){
        return this.precoRevenda;
    }

    // metodo set
    public void setPrecoRevenda(int novoPreco){
        this.precoRevenda = novoPreco;
    }
}
