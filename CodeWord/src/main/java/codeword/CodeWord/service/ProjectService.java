package codeword.CodeWord.service;

import java.util.List;

import codeword.CodeWord.Entity.Project;

public interface ProjectService {

	List<Project> getAllProject();

	String createProject(Project project);

	Project findProject(String projectID);

	String deleteProject(String projectID);

}