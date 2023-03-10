package emiione.springframework.spring5jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import emiione.springframework.spring5jokesapp.services.JokeService;

@Controller
public class JokeController {
	
	private final JokeService jokeService;

	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@GetMapping({"/", ""})
	public String showJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "index";
	}

}
