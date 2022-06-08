package br.com.fiap.gs1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import br.com.fiap.gs1.model.Viagem;
import br.com.fiap.gs1.repository.ViagemRepository;

@Controller
@RequestMapping("viagens")
public class ViagemController {
	private ViagemRepository viagemRepository;

	public ViagemController(ViagemRepository viagemRepository) {
		this.viagemRepository = viagemRepository;
	}

	@GetMapping
	public String list(Model model) {
		model.addAttribute("viagens", viagemRepository.findAll());
		return "viagem/list";
	}

	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("viagem", new Viagem());
		return "viagem/form";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable Long id, Model model) {
		model.addAttribute("viagem", viagemRepository.findById(id).get());
		return "viagem/form";
	}

	@GetMapping("/{id}/delete")
	public RedirectView delete(@PathVariable Long id) {
		viagemRepository.deleteById(id);
		RedirectView redirectView = new RedirectView("/viagens");
		return redirectView;
	}

	@PostMapping("/save")
	public RedirectView saveViagem(@ModelAttribute("viagem") Viagem viagem, RedirectAttributes attrs) {
		// salvar o viagem

		Viagem savedViagem = viagemRepository.save(viagem);

		// redirecionar para a tela de cadastros GET /addViagem
		attrs.addFlashAttribute("addViagemSucess", true);
		attrs.addFlashAttribute("savedViagem", savedViagem);

		RedirectView redirectView = new RedirectView("/viagens");
		return redirectView;
	}

}
