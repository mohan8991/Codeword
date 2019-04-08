package codeword.CodeWord.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codeword.CodeWord.Entity.Project;

@RestController
public class ProjectController {

	
	//TODO Need to add Project id
	@RequestMapping("/project")
	public Project getAllProject() {
		return new Project();
		
	}

}
