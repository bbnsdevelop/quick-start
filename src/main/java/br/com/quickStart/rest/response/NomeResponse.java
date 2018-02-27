package br.com.quickStart.rest.response;

import java.util.List;

import br.com.quickStart.entities.Nome;

public class NomeResponse {
	private List<Nome> listaNomesJson;
	
	public NomeResponse() {
		
	}
	public NomeResponse(List<Nome> listaNomesJson) {
		this.listaNomesJson =  listaNomesJson;
	}
	
	public List<Nome> getNomes() {
		return listaNomesJson;
	}
	public void setNomes(List<Nome> listaNomesJson) {
		this.listaNomesJson = listaNomesJson;
	}
	
	
}
