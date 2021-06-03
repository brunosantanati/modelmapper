package me.brunosantana.exemplo2;

public class ClasseB {

    private String igual1;
    private String igual2;
    private String algo1;
    private String algo2;
    private String semCorrespondencia;

    public ClasseB(){
    }

    public ClasseB(String igual1, String igual2, String algo1, String algo2, String semCorrespondencia) {
        this.igual1 = igual1;
        this.igual2 = igual2;
        this.algo1 = algo1;
        this.algo2 = algo2;
        this.semCorrespondencia = semCorrespondencia;
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

    public String getAlgo1() {
        return algo1;
    }

    public void setAlgo1(String algo1) {
        this.algo1 = algo1;
    }

    public String getAlgo2() {
        return algo2;
    }

    public void setAlgo2(String algo2) {
        this.algo2 = algo2;
    }

    public String getSemCorrespondencia() {
        return semCorrespondencia;
    }

    public void setSemCorrespondencia(String semCorrespondencia) {
        this.semCorrespondencia = semCorrespondencia;
    }

    @Override
    public String toString() {
        return "ClasseB{" +
                "igual1='" + igual1 + '\'' +
                ", igual2='" + igual2 + '\'' +
                ", algo1='" + algo1 + '\'' +
                ", algo2='" + algo2 + '\'' +
                ", semCorrespondencia='" + semCorrespondencia + '\'' +
                '}';
    }
}
