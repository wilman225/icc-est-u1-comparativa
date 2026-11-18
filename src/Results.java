public class Results {
    private String nombre;
    private long tiempo;
    private String sample;
    


    public Results(String nombre, long tiempo, String sample) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.sample = sample;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    @Override
    public String toString() {

        long segundos = tiempo/10;
        return "Results{" +
                "nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo + "ns" +
                ", sample='" + sample + '\'' +
                '}';
    }


    
}
