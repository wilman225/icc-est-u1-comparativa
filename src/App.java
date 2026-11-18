import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Generador g = new Generador();
        List<Integer> list = g.generate(100000);
        System.out.println("Lista generada: "+list);

        Benchmark b = new Benchmark();
        Results benGenList = b.medir(() -> g.generate(100), "Geneacion de listado");

        System.out.println(benGenList);

    }}



        //long nanoTime=System.nanoTime();

        //long currentTimeMillis=System.currentTimeMillis();
        //System.out.println("Tiempo actual en nanosegundos: "+nanoTime);
        //System.out.println("Tiempo actual en milisegundos: "+currentTimeMillis);

        

        //Runnable x =() -> {
            //System.out.println("ejecucion tarea 1");
           // System.out.println("ejecucion tarea 2");
        //};

        //List<Integer> list = new ArrayList<>();

        //MetodosOrd  mO = new MetodosOrd();
        //mO.ordenarBurbuja(list);

        //Runnable burbujaOrden = () ->mO.ordenarBurbuja(list);
        

        //Callable para que retorne un valor
        //System.out.println("ejecucion de a funcion runnable");

        //x.run();



           
           // }
        
    

