package br.com.wsp.fly.repository;

import br.com.wsp.fly.entity.ForYou;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IForYouRepository extends JpaRepository<ForYou, Long> {
}
