package codeword.CodeWord.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codeword.CodeWord.Entity.Project;
import codeword.CodeWord.repository.ProjectRepo;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepo ProjectRepository;
	
	@Override
	public List<Project> getAllProject(){
		return ProjectRepository.getAllProject();
	}
	
	@Override
	public String createProject(Project project) {
		return ProjectRepository.createProject(project);
	}
	
	@Override
	public Project findProject(String projectID) {
		return ProjectRepository.findProject(projectID);
	}
	
	@Override
	public String deleteProject(String projectID) {
		return ProjectRepository.deleteProject(projectID);
	}
	
}
