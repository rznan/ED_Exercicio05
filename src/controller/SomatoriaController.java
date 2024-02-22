package controller;

public class SomatoriaController {
    public SomatoriaController() {}

    public double calcular(double n){
        // começando de 1/n e diminuindo n nas chamadas recursivas a condição de parada é o quando o valor de n alcança
        // 1, porque nesse momento a expressão se torna 1/1, elemento inicial da sequência.
        if(n <= 1) return 1;

        return 1/n + calcular(--n);

    }
}
