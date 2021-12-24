package com.agileProject.projectManagementTool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agileProject.projectManagementTool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

//    @Override
//    Iterable<Project> findAllById(Iterable<Long> iterable);

	Project findByProjectIdentifier(String projectId);
	
	@Override
    Iterable<Project> findAll();
}