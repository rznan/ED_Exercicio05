package view;

import controller.SomatoriaController;

public class Main {
    public static void main(String[] args) {
        int n = 14;
        var somatoria = new SomatoriaController();

        System.out.println(somatoria.calcular(n));
    }
}