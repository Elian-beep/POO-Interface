package entities;

import entities.services.AnimalDomesticado;
import entities.services.AnimalEstimacao;
import entities.services.Mamifero;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
	
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

//	MÉTODOS ABSTRATOS DA CLASSE Mamifero
	@Override
	public void amamentar() {
		
	}

	@Override
	public void emitirSom() {
		
	}

//	MÉTODOS REDUNDANTEMENTE ABSTRATOS DA INTERFACE AnimalDomesticado
	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}

//	MÉTODOS REDUNDANTEMENTE ABSTRATOS DA INTERFACE AnimalEstimacao
	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}
	
	
}
