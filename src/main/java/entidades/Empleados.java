package entidades;

import jakarta.persistence.*;

//Entidad
@Entity
//Nombre de la tabla
@Table(name = "Emp")
public class Empleados {
//Generar el ID
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id_emp")
   private long id;
   private String nombre;
   private String puesto;
   private Double sueldo;
   private int edad;
   private String DNI;
   private boolean esJefe;

   @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JoinColumn(name = "dpto_id")
   private Dpt dptoElement;


   public Empleados(){
       super();
   }

    public Empleados(String nombre, String puesto, double sueldo, int edad, String DNI, boolean esJefe) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.edad = edad;
        this.DNI = DNI;
        this.esJefe = esJefe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public boolean isEsJefe() {
        return esJefe;
    }

    public void setEsJefe(boolean esJefe) {
        this.esJefe = esJefe;
    }

    public Dpt getDptoElement() {
        return dptoElement;
    }

    public void setDptoElement(Dpt dptoElement) {
        this.dptoElement = dptoElement;
    }
}
