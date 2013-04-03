package id.ac.pcr.springhibernate.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Deny Prasetyo, S.T.
 * jasoet87@gmail.com
 * [at] jasoet
 * github.com/jasoet
 * bitbucket.org/jasoet
 */
@Controller
@SuppressWarnings("unchecked")
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(ModelMap modelMap) {
        return "home";
    }
}
