package com.SorceManagement.SM.Repository;

import com.SorceManagement.SM.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student,String> {
}
