package desafioPwcJava;

public class DesafioDriver {

    public static void main(String[] args) {
        
        Desafio obj = new Desafio();

        String[] listaDeCasosSimples = {"Miritiba 339", "Babaçu 500", "Cambuí 804B"};
        String[] listaDeCasosMaisComplicados = {"Rio Branco 23", "Quirino dos Santos 23 b"};
        String[] listaDeCasosComplexos = {"4, Rue de la République", "100 Broadway Av", "Calle Sagasta, 26", "Calle 44 No 1991"};

        obj.exibir(listaDeCasosSimples);
        obj.exibir(listaDeCasosMaisComplicados);
        obj.exibir(listaDeCasosComplexos);
        
    }

}