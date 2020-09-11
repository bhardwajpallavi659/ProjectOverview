package com.projectOverview.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	
	List<Project> projects = new ArrayList<>(Arrays.asList(
			new Project("Azure Migration","Manager","Active"),
			new Project("Data Management","Manager","Active"),
			new Project("Nuxeo Migration","Manager","Active"),
			new Project("HBase Application Interfaces","Manager","Active"),
			new Project("Documentum Migration I","Manager","Done"),
			new Project("Documentum Migration II","Manager","Planned"),
			new Project("Documentum Migration III","Manager","Failed")
	));
	
	public List<Project> getAllProjects() {
		return projects;
	}
	
	public void createProject(Project project) {
		projects.add(project);
	}
	
	public void updateProject(String name, Project project) {
		for(int i=0; i<projects.size(); i++) {
			Project p = projects.get(i);
			if(p.getName().equals(name)) {
				projects.set(i, project);
				return;
			}
		}
	}
	
}
