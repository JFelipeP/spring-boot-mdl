package material.design.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import material.design.model.Users;

public interface UsersRepository extends JpaRepository<Users, String> {

}
