package br.com.wsp.fly.repository;

import br.com.wsp.fly.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long> {
}
