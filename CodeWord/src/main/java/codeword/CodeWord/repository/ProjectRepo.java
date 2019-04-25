package codeword.CodeWord.repository;

import java.util.List;

import codeword.CodeWord.Entity.Project;

public interface ProjectRepo {

	List<Project> getAllProject();

	String createProject(Project project);

	Project findProject(String projectID);

	String deleteProject(String projectID);

}