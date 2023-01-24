package guru.springframework.sdjpainheritence.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.sdjpainheritence.domain.joined.ElectricGuitar;

public interface ElectricGuitarRepository extends JpaRepository<ElectricGuitar, Long> {

}
