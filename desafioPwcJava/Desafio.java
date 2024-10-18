package desafioPwcJava;

import java.util.Arrays;

public class Desafio {

    public String[] separarEndereco(String enderecoCompleto) {
        
        // Separar o enderecoCompleto e armazenar em uma lista
        String[] lista = enderecoCompleto.split(" ");
        String endereco = "";
        String numero = "";
    
        if (lista.length == 2) {
            endereco = lista[0];
            numero = lista[1];

        } else {

            if (isNumeric(lista[lista.length - 1])) { // Verifica se o último elemento é um dígito
            endereco = String.join(" ", java.util.Arrays.copyOfRange(lista, 0, lista.length - 1));
            numero = lista[lista.length -1];
            
            } else if (isNumeric(lista[lista.length - 2])) { // Verifica se o penúltimo elemento da lista é um dígito
                endereco = String.join(" ", java.util.Arrays.copyOfRange(lista, 0, lista.length - 2));
                numero = lista[lista.length - 2] + " " + lista[lista.length - 1];

            } else if (isNumeric(lista[0])) { // Verifica se o primeiro elemento da lista é um dígito
                endereco = String.join(" ", java.util.Arrays.copyOfRange(lista, 1, lista.length));
                numero = lista[0];
            } 

            if (enderecoCompleto.contains(", ")) { // Verifica se no endereço fornecido há uma vírgula
                String[] partes = enderecoCompleto.split(", ");

                if (partes[1].length() > partes[0].length()) {
                    endereco = partes[1];
                    numero = partes[0];

                } else {
                    endereco = partes[0];
                    numero = partes[1];
                }
            
            } else if (enderecoCompleto.contains("No ")) { // Verifica se no endereço fornecido há "No "

                int indice = Arrays.asList(lista).indexOf("No");
                endereco = String.join(" ", java.util.Arrays.copyOfRange(lista, 0, indice));
                numero = String.join(" ", java.util.Arrays.copyOfRange(lista, indice, lista.length));
            }
            
            
        }

        return new String[]{endereco, numero};
    }

    // função para exibir os endereços
    public void exibir(String[] listaDeEnderecos) {
        for (String endereco : listaDeEnderecos) {
            System.out.println();
            String[] resultado = separarEndereco(endereco);
            System.out.println(resultado[0] + ", " + resultado[1]);
        }
    }

    // verifica se a string contém apenas dígitos
    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

}