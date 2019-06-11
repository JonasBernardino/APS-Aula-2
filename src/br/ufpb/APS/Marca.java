package br.ufpb.APS;

public class Marca {
	
		private String nome;

		public Marca(String nome) {
			this.nome = nome;
		}

		public String getNome() {
			return this.nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		@Override
		public String toString() {
			return "Marca [nome=" + nome + "]";
		}
		
	}


