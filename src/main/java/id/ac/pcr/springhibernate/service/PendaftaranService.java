package id.ac.pcr.springhibernate.service;

import id.ac.pcr.springhibernate.model.Mahasiswa;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Deny Prasetyo
 * Date: 4/2/13
 * Time: 11:42 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class PendaftaranService {

    @PersistenceContext
    protected EntityManager entityManager;

    @Transactional
    public void insertMahasiswa(Mahasiswa m) {
        entityManager.persist(m);
    }

    public List<Mahasiswa> getAllMahasiswa(){
           return entityManager.createQuery("SELECT o FROM Mahasiswa o").getResultList();
    }
}
