package animalabstract;

public abstract class Padrãoanimal {

	private String nome;
	private String sexo;
	private String raca;
		
		
	
		public Padrãoanimal(String nome, String sexo, String raca) {
		
	}
		public String getnome() {
			return nome;
		}
		public void setnome(String nome) {
			this.nome = nome;
		}
		public String getsexo() {
			return sexo;
		}
		public void setsexo(String sexo) {
			this.sexo = sexo;
		}
		public String getraca() {
			return raca;
		}
		public void setraca(String raca) {
			this.raca = raca;
		}
		
	
	public abstract void dormir();
	public abstract void caminhar();
	public abstract void correr();
}
