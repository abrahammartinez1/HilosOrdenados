public class TareaHilo4 extends Clase1 implements Runnable {

    private String nombreHilo = "";

    public void nombre(String nom){
        this.nombreHilo = nom;
    }

    @Override
    public void run() {
//        while (!hilo1fin) {
//            System.out.println("SOY EL HILO --> " + this.nombreHilo);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
        System.out.println("FIN HILO --> " + this.nombreHilo);
    }
}
