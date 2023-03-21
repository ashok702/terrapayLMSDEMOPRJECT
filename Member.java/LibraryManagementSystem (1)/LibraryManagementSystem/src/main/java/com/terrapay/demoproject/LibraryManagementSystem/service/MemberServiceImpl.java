package com.terrapay.demoproject.LibraryManagementSystem.service;


import com.terrapay.demoproject.LibraryManagementSystem.model.Member;
import com.terrapay.demoproject.LibraryManagementSystem.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member saveMember(Member member) {

        return memberRepository.save(member);

    }

    @Override
    public List<Member> fetchMembersList() {

        return memberRepository.findAll();

    }

    @Override
    public void deleteMembersById(Long id) {

        memberRepository.deleteById(id);

    }

    @Override
    public Member updateMember(Long id, Member member) {

        {

            Member memberDB = memberRepository.findById(id).get();

            if (Objects.nonNull(member.getType()) && !"".equalsIgnoreCase(memberDB.getType())) {

                memberDB.setType(member.getType());


            }


            if (Objects.nonNull(member.getFirstName()) && !"".equalsIgnoreCase(member.getFirstName())) {

                memberDB.setFirstName(member.getFirstName());
            }


            if (Objects.nonNull(member.getMiddleName()) && !"".equalsIgnoreCase(member.getMiddleName())) {

                memberDB.setFirstName(member.getMiddleName());
            }


            if (Objects.nonNull(member.getLastName()) && !"".equalsIgnoreCase(member.getLastName())) {

                memberDB.setLastName(member.getLastName());
            }


            if (Objects.nonNull(member.getGender()) && !"".equalsIgnoreCase(String.valueOf(member.getGender()))) {

                memberDB.setGender(member.getGender());
            }

            if (Objects.nonNull(member.getContact()) && !"".equalsIgnoreCase(member.getContact())) {

                memberDB.setContact(member.getContact());
            }

            if (Objects.nonNull(member.getEmail()) && !"".equalsIgnoreCase(member.getEmail())) {

                memberDB.setEmail(member.getEmail());
            }

            return memberRepository.save(memberDB);

        }


    }

    @Override
    public Optional<Member> fetchTextBooksById(Long id) {
        return Optional.of(memberRepository.findById(id).get());
    }

    @Override
    public Member fetchMembersByFirstName(String firstName) {
        return memberRepository.findByFirstName(firstName);
    }


}






