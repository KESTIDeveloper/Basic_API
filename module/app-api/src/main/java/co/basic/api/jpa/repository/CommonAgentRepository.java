package co.basic.api.jpa.repository;

import co.basic.api.jpa.entity.CommonAgent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonAgentRepository extends JpaRepository<CommonAgent, String> {
}
