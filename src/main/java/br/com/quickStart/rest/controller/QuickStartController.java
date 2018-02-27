package br.com.quickStart.rest.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quickStart.entities.Nome;
import br.com.quickStart.rest.response.NomeResponse;

@RestController
@RequestMapping(value ="/home")
public class QuickStartController {
	
	
	@RequestMapping(value="/list")
	public List<NomeResponse> listar(){
		Nome nome1 = new Nome("bruno");
		Nome nome2 = new Nome("João");
		Nome nome3 = new Nome("Tacy");
		Nome nome4 = new Nome("Jose");
		Nome nome5 = new Nome("Tiao");
		Nome nome6 = new Nome("Neves");
		Nome nome7 = new Nome("Maria");
		
		List<Nome> nomes = Arrays.asList(nome1,nome2,nome3,nome4,nome5,nome6,nome7);
		List<NomeResponse> nomesResponse= new ArrayList<>();
		List<Nome> listNome = new ArrayList<>();
		NomeResponse listaNomes = new NomeResponse();
		nomes.stream().forEach(n ->{
			Nome nome = new Nome();
			nome.setNome(n.getNome());
			listNome.add(nome);
			
		});
		listaNomes.setNomes(listNome);
		nomesResponse.add(listaNomes);
		return nomesResponse;
		
	}
	
	
}
