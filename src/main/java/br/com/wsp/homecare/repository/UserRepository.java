package br.com.wsp.homecare.repository;

import br.com.wsp.homecare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}