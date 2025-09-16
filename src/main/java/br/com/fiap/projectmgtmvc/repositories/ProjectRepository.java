package br.com.fiap.projectmgtmvc.repositories;

import br.com.fiap.projectmgtmvc.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
