package com.training.microservicesBoot.DAO;

import com.training.microservicesBoot.domain.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamDAO extends CrudRepository<Team, Long>{

    List<Team> findAll();

    Team findByName(String name);

}
