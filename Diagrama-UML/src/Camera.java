public class Camera extends Aplicativos {
    int zoom = 0;
    boolean flash;

    void aumentarZoom() {
        System.out.println("Aumentar Zoom");
        zoom ++;
    }
    void diminuirZoom() {
        System.out.println("Diminuir Zoom");
    }
    void alternarFlash() {
        if (flash) {
            System.out.println("Flash Ativado");
        }
        else {
            System.out.println("Flash Desativado");
        }
        flash = !flash;
    }
    void tirarFoto() {
        System.out.println("Tirando foto");
    }
    void gravarVideo() {
        System.out.println("Gravando Vídeo");
    }
}
