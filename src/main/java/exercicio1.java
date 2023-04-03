import org.jetbrains.annotations.NotNull;

import java.util.List;

public class exercicio1 {

    public double calculaMedia(@NotNull List<Integer> lista) {
        return lista.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }

    public boolean estaOrdenada(List<Integer> listaDeInteiros) {
        return estaOrdenada(listaDeInteiros, listaDeInteiros.size());
    }

    private boolean estaOrdenada(List<Integer> listaDeInteiros, int indiceTamanho) {
        if (indiceTamanho < 2) {
            return true;
        } else if (listaDeInteiros.get(indiceTamanho - 2).compareTo(listaDeInteiros.get(indiceTamanho - 1)) > 0) {
            return false;
        } else {
            return estaOrdenada(listaDeInteiros, indiceTamanho - 1);
        }
    }

    public int fatorial(int numero)
    {
        int resultado = 1, i;
        for (i=2; i<=numero; i++)
            resultado *= i;
        return resultado;
    }

    public double converteTemperatura (double celsius){
        return (celsius * 1.8) + 32;
    }

    public boolean ePrimo(int numero){
        int divisores = 0;
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0)
                divisores++;
        }
        return divisores == 2;
    }

    public boolean listaOrdenada(List<Integer> listaDeInteiros) {
        return listaOrdenada(listaDeInteiros, 0) ||
                estaOrdenada(listaDeInteiros, listaDeInteiros.size());
    }

    private boolean listaOrdenada(@NotNull List<Integer> listaDeInteiros, int indice) {
        if (indice == listaDeInteiros.size() -1) {
            return true;
        } else if (listaDeInteiros.get(indice).compareTo(listaDeInteiros.get(indice + 1)) < 0) {
            return false;
        } else {
            return listaOrdenada(listaDeInteiros, indice + 1);
        }
    }

}
