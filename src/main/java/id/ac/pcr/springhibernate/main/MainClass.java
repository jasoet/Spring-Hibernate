package id.ac.pcr.springhibernate.main;

import id.ac.pcr.springhibernate.model.Mahasiswa;
import id.ac.pcr.springhibernate.provider.ApplicationContextProvider;
import id.ac.pcr.springhibernate.service.PendaftaranService;
import org.springframework.context.ApplicationContext;

import java.util.List;


public class MainClass {
    public static void main(String[] args) {
        ApplicationContext acp = ApplicationContextProvider.getInstance().getApplicationContext();
        PendaftaranService ps = acp.getBean("pendaftaranService", PendaftaranService.class);


        Mahasiswa m = new Mahasiswa();
        m.setNama("Jasoet");
        m.setNim("717171771");

        ps.insertMahasiswa(m);

        List<Mahasiswa> lm = ps.getAllMahasiswa();

        System.out.println(lm.size());
    }
}
