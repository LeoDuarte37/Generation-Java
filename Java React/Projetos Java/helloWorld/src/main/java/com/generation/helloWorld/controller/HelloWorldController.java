package com.generation.helloWorld.controller;


import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
	
	@GetMapping("/OlaMundo")
	public String helloWorld() {
		return "<h1>Olá Mundo!!</h1>";
	}
	
	@GetMapping("/Bsm")
	public ArrayList<String> bsm() {
		ArrayList<String> listaBsm = new ArrayList<String>();
		
		listaBsm.addAll(Arrays.asList("Responsabilidade Pessoal", "Persistência", "Mentalidade de Crescimento", "Orientação ao Futuro"));
		
		return listaBsm;
	}
	
	@GetMapping("/Objetivos")
	public ArrayList<String> objetivos() {
		ArrayList<String> listaObjetivos = new ArrayList<String>();
		
		listaObjetivos.addAll(Arrays.asList("Rever conteúdo de Java e praticar", "Rever conteúdo de Spring", "Praticar SQL"));
		
		return listaObjetivos;
	}
}
