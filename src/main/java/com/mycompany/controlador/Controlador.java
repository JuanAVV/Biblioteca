package com.mycompany.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.interfaceService.IEstanteService;
import com.mycompany.interfaceService.ILibroService;
import com.mycompany.modelo.Estante;
import com.mycompany.modelo.Libro;

@Controller
public class Controlador {

	@Autowired
	private ILibroService lib;
	@Autowired
	private IEstanteService estan;

	@RequestMapping("/")
	public String listar(Model model, @Param ("clave")String clave) {
		List<Libro> libros = lib.listar(clave);
		model.addAttribute("libros", libros);
		return "index";
	}
	
	@RequestMapping("/agregar")
	public String agregar(Model model) {
		List<Estante>estante=estan.listar();
		Libro libro = new Libro(); 
		model.addAttribute("libro", libro);
		model.addAttribute("estante",estante);
		return "Agregar";
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(@ModelAttribute("libro")Libro libro) {
		lib.save(libro);
		return "redirect:/";
	}
	
	@RequestMapping("/editar/{idLibro}")
	public ModelAndView editar(@PathVariable(name = "idLibro")int id,Model model) {
		List<Estante>estante=estan.listar();
		model.addAttribute("estante", estante);
		ModelAndView modelo = new ModelAndView("Editar");
		Libro libro = lib.get(id);
		modelo.addObject("libro",libro);
		return modelo;
	}
	
	@RequestMapping("/eliminar/{idLibro}")
	public String eliminar(@PathVariable(name = "idLibro")int id) {
		lib.delete(id);
		return "redirect:/";
	}

}
