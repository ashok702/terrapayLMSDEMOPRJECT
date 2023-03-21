package com.terrapay.demoproject.LibraryManagementSystem.repository;


import com.terrapay.demoproject.LibraryManagementSystem.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {


    Member findByFirstName(String firstName);

}
