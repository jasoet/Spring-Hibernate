package id.ac.pcr.springhibernate.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    public String home(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
        return "home";
    }
}
