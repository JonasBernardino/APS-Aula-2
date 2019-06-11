package br.ufpb.APS;

import java.util.HashMap;
import java.util.Map;

public class MarcaService {
	
	private Map<Integer, Marca> marcas = new HashMap<Integer,Marca>();
	
	private int proximoID = 1;
	
	public int cadastrar(Marca marca) {
		this.marcas.put(proximoID, marca);
		return proximoID++;
	}

	public Marca get(int vwID) {
		return this.marcas.get(vwID);
	}

}
