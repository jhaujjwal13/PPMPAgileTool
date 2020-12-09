package org.ujjhappmp.com.ppmptool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ujjhappmp.com.ppmptool.domain.Project;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    @Override
    List<Project> findAllById(Iterable<Long> iterable);
}
