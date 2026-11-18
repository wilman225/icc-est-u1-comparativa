public class Benchmark {


    public static Results medir(Runnable accion, String nombre) {
        System.out.println("funcion: "+nombre);


        //tiempo actual
        long tA = System.nanoTime();
        accion.run();
        long tF = System.nanoTime();

        Results results = new Results(nombre, (tF-tA), "100000");
        return results;

        


        //tiempo

        //tiempo final 

        //retornar el timepo duracion 
    }
    
}
