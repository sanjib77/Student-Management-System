package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{ 
//first parameter Student represents type of JPA entity and second parameter is type of the primary key
//Repository annotation is not written because JPARepository by default comes with it.
	//SImilarly in service layer we are not required to add Transactional annotation
}
