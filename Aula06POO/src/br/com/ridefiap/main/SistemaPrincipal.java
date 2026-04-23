package br.com.ridefiap.main;

import br.com.ridefiap.model.Bateria;
import br.com.ridefiap.model.Celular;
import br.com.ridefiap.model.Smartphone;
import br.com.ridefiap.model.TelefoneFixo;

public class SistemaPrincipal {
    public static void main(String[] args) {
        // Criando baterias para os dispositivos
        Bateria batSmartphone = new Bateria(5000, 90);
        Bateria batFixo = new Bateria(1000, 100);

        // 1. Testando a subclasse Smartphone
        Smartphone meuSmartphone = new Smartphone("Samsung", "Preto", 256, batSmartphone, "Android 14");
        
        System.out.println("--- Teste de Smartphone (Herdeiro 1) ---");
        System.out.println("Marca: " + meuSmartphone.getMarca());
        System.out.println("Sistema: " + meuSmartphone.getSistemaOperacional()); // Atributo exclusivo
        System.out.println("Bateria: " + meuSmartphone.getBateria().getPercentualCarga() + "%");
        meuSmartphone.instalarApp("WhatsApp");
        System.out.println();

        // 2. Testando a subclasse TelefoneFixo
        TelefoneFixo meuFixo = new TelefoneFixo("Intelbras", "Branco", 0, batFixo, true);
        
        System.out.println("--- Teste de Telefone Fixo (Herdeiro 2) ---");
        System.out.println("Marca: " + meuFixo.getMarca());
        System.out.println("Possui fio: " + (meuFixo.isPossuiFio() ? "Sim" : "Não")); // Atributo exclusivo
        meuFixo.ligarParaEmergencia();
        System.out.println();

        // 3. Testando polimorfismo/herança básica
        System.out.println("--- Teste de Herança (Método da Superclasse) ---");
        meuSmartphone.alterarCor("Azul");
        System.out.println("Nova cor do Smartphone: " + meuSmartphone.getCor());
    }
}