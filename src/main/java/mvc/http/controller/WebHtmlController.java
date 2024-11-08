package mvc.http.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebHtmlController {
    @RequestMapping(value = "/beautyNeils", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

    @RequestMapping(value = "/beautyNeils/info", method = RequestMethod.GET)
    public ModelAndView beautyNeils(ModelAndView modelAndView) {
        modelAndView.setViewName("beautyNeils.html");
        return modelAndView;
    }

    @RequestMapping(value = "/beautyNeils/services", method = RequestMethod.GET)
    public ModelAndView services(ModelAndView modelAndView) {
        modelAndView.setViewName("services.html");
        return modelAndView;
    }

    @RequestMapping(value = "/beautyNeils/contact", method = RequestMethod.GET)
    public ModelAndView contact(ModelAndView modelAndView) {
        modelAndView.setViewName("contact.html");
        return modelAndView;
    }

    @RequestMapping(value = "/beautyNeils/gallery", method = RequestMethod.GET)
    public ModelAndView gallery(ModelAndView modelAndView) {
        modelAndView.setViewName("gallery.html");
        return modelAndView;
    }

}
