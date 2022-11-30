public class TareaHilo3 extends Clase1 implements Runnable {

    private String nombreHilo = "";

    public void nombre(String nom){
        this.nombreHilo = nom;
    }

    @Override
    public void run() {
        for (Integer i=0;i<5;i++){
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
