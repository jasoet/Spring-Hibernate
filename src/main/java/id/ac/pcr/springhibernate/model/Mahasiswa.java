package id.ac.pcr.springhibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: isaninside
 * Date: 4/3/13
 * Time: 10:10 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mahasiswa_id")
    private Long id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "nim")
    private String nim;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
