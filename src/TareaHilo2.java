public class TareaHilo2 extends Clase1 implements Runnable {
    private String nombreHilo = "";

    public void nombre(String nom){
        this.nombreHilo = nom;
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++){//Cada segundo durante 5 segundos muestra el mensaje
            try {
                System.out.println("EJECUTANDO HILO --> " + this.nombreHilo);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("FIN HILO --> " + this.nombreHilo);
    }
}
