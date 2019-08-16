package com.prueba.control;



	@Controller
	public class Controller {

	    @RequestMapping(value = "/hello")
	    public ModelAndView saluda() {
	        ModelAndView mv = new ModelAndView();
	        mv.addObject("titulo", "Tutoriales Spring MVC");
	        mv.addObject("mensaje", "Mi Primera Aplicacion Web Spring MVC");
	        mv.setViewName("hello");
	        
	        return mv;
	    }
}
