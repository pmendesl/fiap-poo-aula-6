package br.com.ridefiap.model;

public class TelefoneFixo extends Celular {
    private boolean possuiFio;

    public TelefoneFixo(String marca, String cor, int capacidadeemGb, Bateria bateria, boolean possuiFio) {
        super(marca, cor, capacidadeemGb, bateria);
        this.possuiFio = possuiFio;
    }

    public boolean isPossuiFio() {
        return possuiFio;
    }

    public void setPossuiFio(boolean possuiFio) {
        this.possuiFio = possuiFio;
    }

    public void ligarParaEmergencia() {
        System.out.println("Ligando para emergência via linha fixa...");
    }
}