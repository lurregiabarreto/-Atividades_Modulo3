package br.com.zup.Lista4Encapsulamento.LevelUp;

public class ControleRemoto {
    Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void aumentarVolume() {
        int novoVolume = tv.getVolume() + 1;
        tv.setVolume(novoVolume);
    }

    public void diminuirVolume() {
        int novoVolume = tv.getVolume() - 1;
        tv.setVolume(novoVolume);
    }

    public void aumentarCanal() {
        int novoCanal = tv.getCanal() + 1;
        tv.setVolume(novoCanal);

    }

    public void diminuirCanal() {
        int novoCanal = tv.getCanal() - 1;
        tv.setVolume(novoCanal);
    }

    public void trocarCanal(int novoCanal) {
        tv.setCanal(novoCanal);
    }

    public void desligarTV() {
        System.out.println("Obrigado e volte sempre");
        tv.setCanal(0);
        tv.setVolume(0);
    }

    public void mostrarDados() {
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
    }

}
