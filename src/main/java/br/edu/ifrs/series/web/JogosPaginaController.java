package br.edu.ifrs.series.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.ifrs.series.dao.JogoDAO;
import br.edu.ifrs.series.dominio.Jogo;

@Controller
public class JogosPaginaController {
	
	private final JogoDAO dao;
	
	public JogosPaginaController(JogoDAO dao) {
		this.dao = dao;
	}
	
	@GetMapping("/paginas/jogos")
    public String listar(Model model) {
        model.addAttribute("jogos", dao.listarTodas());
        return "jogos/lista";
    }
	
	@GetMapping("/paginas/jogos/novo")
	public String formulario(Model model) {
	    model.addAttribute("jogo", new Jogo());
	    return "jogos/formulario";
	}
	
	@PostMapping("/paginas/jogos/novo")
	public String cadastrar(@ModelAttribute("jogo") Jogo jogo) {
	    dao.salvar(jogo);
	    return "redirect:/paginas/jogos";
	}
}