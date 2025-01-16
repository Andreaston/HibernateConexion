package repositorios;


import entidades.Empleados;
import org.hibernate.*;


public class EmpRepositorio implements Repositorio<Empleados>{
    private Session session;

    public EmpRepositorio(Session session) {
        super();
        this.session = session;
    }

   @Override
   public void guardar(Empleados t){
        Transaction trx = this.session.beginTransaction();
        session.persist(t);
        trx.commit();
   }

}
