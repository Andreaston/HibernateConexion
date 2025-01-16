package repositorios;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entidades.Dpt; //LLamamos a la entidad en cuestión



public class DepartamentoRepositorio implements Repositorio<Dpt> {

    private Session session;

    public DepartamentoRepositorio(Session session) {
        super();
        this.session = session;
    }

    @Override
    public void guardar(Dpt t){
        Transaction trx = this.session.beginTransaction();
        session.persist(t);
        trx.commit();
    }

}
