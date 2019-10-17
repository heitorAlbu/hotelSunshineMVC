package org.hotelSunshine.controllers;

import org.hotelSunshine.models.Quarto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.QuartoDAO;

@Controller
public class QuartoController {
	
	@Autowired
	private QuartoDAO dao;
	
	@RequestMapping("quarto/quartoForm")
	public String form() {
		return "quarto/quartoForm";
	}
	@RequestMapping("quarto/createQuarto")
	public String create(Quarto quarto) {
	
		dao.create(quarto);
		return "quarto/confirmacao";
	}
	
	
}
