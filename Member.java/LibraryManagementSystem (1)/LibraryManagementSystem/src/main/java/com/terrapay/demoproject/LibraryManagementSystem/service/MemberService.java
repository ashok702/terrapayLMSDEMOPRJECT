package com.terrapay.demoproject.LibraryManagementSystem.service;

import com.terrapay.demoproject.LibraryManagementSystem.model.Member;

import java.util.List;
import java.util.Optional;

public interface MemberService {


    public Member saveMember(Member member);

    public List<Member> fetchMembersList();

    public void deleteMembersById(Long id);

    public Member updateMember(Long id, Member member);


    public Optional<Member> fetchTextBooksById(Long id);


    public Member fetchMembersByFirstName(String firstName);


}
