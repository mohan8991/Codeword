package codeword.CodeWord.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import codeword.CodeWord.Entity.Project;
import codeword.CodeWord.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@RequestMapping(method = RequestMethod.GET, path ="/getAllPrj", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Project> getAllProject(){
		return projectService.getAllProject();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/get/{projectID}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Project getProjectByID(@PathVariable("projectID") String projectID) {
		return projectService.findProject(projectID);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/create", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String createProject(@RequestBody Project project) {
		return projectService.createProject(project);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = "/delete/{projectID}")
	public String deleteProject(@PathVariable("projectID") String projectID) {
		return projectService.deleteProject(projectID);
	}

}
