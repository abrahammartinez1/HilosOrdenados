public class Programa {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("SOY EL HILO PRINCIPAL --> " + Thread.currentThread().getName());

        TareaHilo1 tarea1 = new TareaHilo1();
        Thread hilo1 = new Thread(tarea1);

        TareaHilo2 tarea2 = new TareaHilo2();
        Thread hilo2 = new Thread(tarea2);

        TareaHilo3 tarea3 = new TareaHilo3();
        Thread hilo3 = new Thread(tarea3);

        TareaHilo4 tarea4 = new TareaHilo4();
        Thread hilo4 = new Thread(tarea4);

        //Encadenamos join para que los hilos se
        //ejecuten de forma ordenada
        tarea1.nombre("Hilo1");
        hilo1.start();
        hilo1.join(); //hasta que termine el hilo1 no continua con resto de procesos

        tarea2.nombre("Hilo2");
        hilo2.start();
        hilo2.join();//hasta que termine el hilo2 no continua con resto de procesos

        tarea3.nombre("Hilo3");
        hilo3.start();
        hilo3.join();//hasta que termine el hilo3 no continua con resto de procesos

        tarea4.nombre("Hilo4");
        hilo4.start();
        hilo4.join();//hasta que termine el hilo4 no continua con resto de procesos

    }
}
