//Atributos de la clase coche
public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;
    int distancia;
    int litrosGasolina;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 20; //determino una velocidad inicial
        this.distancia = 0;
        this.litrosGasolina=10;
    }
}
