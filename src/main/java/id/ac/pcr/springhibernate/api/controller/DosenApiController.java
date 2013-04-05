package id.ac.pcr.springhibernate.api.controller;

import id.ac.pcr.springhibernate.model.Dosen;
import id.ac.pcr.springhibernate.repository.DosenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: Deny Prasetyo
 * Date: 4/5/13
 * Time: 9:01 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/api/dosen")
public class DosenApiController {

    @Autowired
    private DosenRepository dosenRepository;

    @RequestMapping("/")
    @ResponseBody
    public Page<Dosen> getAll(ModelMap modelMap, Pageable pageable) {
        return dosenRepository.findAll(pageable);
    }
}
