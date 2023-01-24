package guru.springframework.sdjpainheritence.domain.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sdjpainheritence.domain.joined.ElectricGuitar;
import guru.springframework.sdjpainheritence.domain.repositories.ElectricGuitarRepository;

@Component
public class Bootstrap implements CommandLineRunner {
	
	@Autowired
	ElectricGuitarRepository egr;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ElectricGuitar eg = new ElectricGuitar();
		eg.setNumberOfPickups(6);
		eg.setNumberOfStrings(2);
		egr.save(eg);
	}

}
