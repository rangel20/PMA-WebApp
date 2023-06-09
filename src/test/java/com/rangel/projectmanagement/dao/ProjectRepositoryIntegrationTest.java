package com.rangel.projectmanagement.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.rangel.projectmanagement.entities.Project;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProjectRepositoryIntegrationTest {
    
    @Autowired
    ProjectRepository proRepo;

    @Test
    public void ifNewProjectSaved_thenSuccess() {
        Project newProject = new Project("New Test Project", "COMPLETE", "Test description");
        proRepo.save(newProject);

        assertEquals(1, proRepo.findAll().size());
    }
}
