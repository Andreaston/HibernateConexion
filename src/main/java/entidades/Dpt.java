package entidades;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//Decir que es una entidad
@Entity
//Decir como se llama la tabla
@Table(name = "Dpto")
public class Dpt {

    //Creamos el ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dpto_id")
    private int id;
    //Resto de la variables
    private String nombreDepto;
    private String localidad;
    //Conectamos con la otra tabla de Emplados
    @OneToMany(mappedBy = "dptoElement", cascade = CascadeType.ALL)
    private List<Empleados> empleadosList;

    //Constructores
    public Dpt() {

    }

    public Dpt(String nombreDepto, String localidad) {
        super();
        this.nombreDepto = nombreDepto;
        this.localidad = localidad;
        this.empleadosList = new ArrayList<Empleados>();
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDepto() {
        return nombreDepto;
    }

    public void setNombreDepto(String nombreDepto) {
        this.nombreDepto = nombreDepto;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public List<Empleados> getEmpleadosList() {
        return empleadosList;
    }

    public void setEmpleadosList(List<Empleados> empleadosList) {
        this.empleadosList = empleadosList;
    }

    public void addEmps(Empleados empleados){
        this.empleadosList.add(empleados);
        empleados.setDptoElement(this);
    }
}
