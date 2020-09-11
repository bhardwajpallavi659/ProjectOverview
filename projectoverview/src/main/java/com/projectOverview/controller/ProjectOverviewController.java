package com.projectOverview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.projectOverview.controller.ProjectService;;

@RestController
public class ProjectOverviewController {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping("/projects")
	public List<Project> getOverview() {
		return projectService.getAllProjects();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/projects")
	public void createProject(@RequestBody Project project) {
		projectService.createProject(project);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/projects/{name}")
	public void updateProject(@RequestBody Project project, @PathVariable String name) {
		projectService.updateProject(name, project);
	}
}
