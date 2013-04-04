package id.ac.pcr.springhibernate.main;

import id.ac.pcr.springhibernate.model.Dosen;
import id.ac.pcr.springhibernate.model.Mahasiswa;
import id.ac.pcr.springhibernate.provider.ApplicationContextProvider;
import id.ac.pcr.springhibernate.service.DosenService;
import id.ac.pcr.springhibernate.service.PendaftaranService;
import org.springframework.context.ApplicationContext;

import java.util.List;


public class MainClass {
    public static void main(String[] args) {
        ApplicationContext acp = ApplicationContextProvider.getInstance().getApplicationContext();
        PendaftaranService ps = acp.getBean("pendaftaranService", PendaftaranService.class);
        DosenService ds = acp.getBean("dosenService", DosenService.class);

        Mahasiswa m = new Mahasiswa();
        m.setNama("Jasoet");
        m.setNim("717171771");

        ps.insertMahasiswa(m);

        Dosen d = new Dosen();
        d.setNiy("009");
        d.setNama("Deny");

        ds.save(d);


        List<Mahasiswa> lm = ps.getAllMahasiswa();

        System.out.println(lm.size());
    }
}
