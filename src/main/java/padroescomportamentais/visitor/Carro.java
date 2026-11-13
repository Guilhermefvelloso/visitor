package padroescomportamentais.visitor;

public class Carro implements Veiculo {

    private int codigo;
    private String modelo;
    private Fabricante fabricante;

    public Carro(int codigo, String modelo, Fabricante fabricante) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNomeFabricante() {
        return this.fabricante.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCarro(this);
    }

}