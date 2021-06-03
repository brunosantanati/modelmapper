package me.brunosantana.exemplo2;

public class ClasseA {

    private String igual1;
    private String igual2;
    private String diferente1;
    private String diferente2;

    public ClasseA(){
    }

    public ClasseA(String igual1, String igual2, String diferente1, String diferente2) {
        this.igual1 = igual1;
        this.igual2 = igual2;
        this.diferente1 = diferente1;
        this.diferente2 = diferente2;
    }

    public String getIgual1() {
        return igual1;
    }

    public void setIgual1(String igual1) {
        this.igual1 = igual1;
    }

    public String getIgual2() {
        return igual2;
    }

    public void setIgual2(String igual2) {
        this.igual2 = igual2;
    }

    public String getDiferente1() {
        return diferente1;
    }

    public void setDiferente1(String diferente1) {
        this.diferente1 = diferente1;
    }

    public String getDiferente2() {
        return diferente2;
    }

    public void setDiferente2(String diferente2) {
        this.diferente2 = diferente2;
    }

    @Override
    public String toString() {
        return "ClasseA{" +
                "igual1='" + igual1 + '\'' +
                ", igual2='" + igual2 + '\'' +
                ", diferente1='" + diferente1 + '\'' +
                ", diferente2='" + diferente2 + '\'' +
                '}';
    }
}
