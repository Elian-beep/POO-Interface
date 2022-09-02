package entities;

import entities.services.AnimalDomesticado;
import entities.services.Mamifero;

public class Cavalo extends Mamifero implements AnimalDomesticado{


//	MÉTODOS ABSTRATOS DA CLASSE Mamifero
	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
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
}
