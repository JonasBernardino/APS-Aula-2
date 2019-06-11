package br.ufpb.APS;

public class App {

	private static MarcaService marcaService = new MarcaService();
	
	public static void main(String[] args) {
		Marca vw = new Marca("Volkswagen");
		
		int vwID = marcaService.cadastrar(vw);
		
		Marca vwRetornada = marcaService.get(vwID);
		
		System.out.print(vwRetornada);
		
	
		
	
	

	}

}
