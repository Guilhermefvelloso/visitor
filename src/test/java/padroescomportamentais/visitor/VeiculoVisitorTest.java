package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoVisitorTest {

    @Test
    void deveExibirCarro() {
        Carro carro = new Carro(1, "Corolla", new Fabricante("Toyota"));

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Carro{codigo=1, modelo='Corolla', fabricante=Toyota}", visitor.exibir(carro));
    }

    @Test
    void deveExibirMoto() {
        Moto moto = new Moto(1, "CG 160", 160);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Moto{codigo=1, modelo='CG 160', cilindradas=160}", visitor.exibir(moto));
    }

    @Test
    void deveExibirCaminhao() {
        Caminhao caminhao = new Caminhao(1, "Volvo FH", 25.0f);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Caminhao{codigo=1, modelo='Volvo FH', capacidadeCarga=25.0}", visitor.exibir(caminhao));
    }

}