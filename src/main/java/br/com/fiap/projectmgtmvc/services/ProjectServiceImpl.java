package br.com.fiap.projectmgtmvc.services;

import br.com.fiap.projectmgtmvc.entities.Project;
import br.com.fiap.projectmgtmvc.exceptions.EntityNotFound;
import br.com.fiap.projectmgtmvc.repositories.ProjectRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
final class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Page<Project> findAll(Pageable pageable) {
        return this.projectRepository.findAll(pageable);
    }

    @Override
    public Project findById(Long id) {
        return this.projectRepository.findById(id).orElseThrow(() -> new EntityNotFound("Page not found"));
    }

    @Override
    public Project saveOrUpdate(Project project) {
        return this.projectRepository.save(project);
    }

    @Override
    public void deleteById(Long id) {
        this.projectRepository.deleteById(id);
    }



}
