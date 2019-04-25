package codeword.CodeWord.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import codeword.CodeWord.Entity.Project;

@Repository
public class ProjectRepoImpl implements ProjectRepo {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Project> getAllProject(){	
		List<Project> allProject = null;
		return allProject;
	}
	
	@Override
	public String createProject(Project project) {
		em.persist(project);
//		em.getReference(Project.class, primaryKey)
		return "Project Created";
	}
	
	@Override
	public Project findProject(String projectID) {
		return em.find(Project.class, projectID);
	}
	
	@Override
	public String deleteProject(String projectID) {
		em.remove(projectID);
		return "Project" + projectID;
	}
	
}
