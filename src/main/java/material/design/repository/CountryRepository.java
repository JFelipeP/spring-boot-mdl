package material.design.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import material.design.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
