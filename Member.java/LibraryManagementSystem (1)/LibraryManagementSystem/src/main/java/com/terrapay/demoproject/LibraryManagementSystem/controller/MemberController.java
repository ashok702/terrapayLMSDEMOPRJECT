package com.terrapay.demoproject.LibraryManagementSystem.controller;


import com.terrapay.demoproject.LibraryManagementSystem.model.Member;
import com.terrapay.demoproject.LibraryManagementSystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MemberController

{


    @Autowired
    private MemberService memberService;

    @PostMapping("/members")
    public Member saveMember(@RequestBody Member member)

    {

        return memberService.saveMember( member);

    }


    @GetMapping("/members")
    public List<Member> fetchMembersList()

    {

        return memberService.fetchMembersList();
    }

    @GetMapping("/members/{id}")
    public Optional<Member> fetchMembersById(@PathVariable("id") Long id)
    {
        return memberService.fetchTextBooksById(id);
    }








    @DeleteMapping("/members/{id}")
    public String deleteMembersById(@PathVariable("id") Long id)

    {

        memberService.deleteMembersById(id);

        return "Member deleted successfully";

    }


    @GetMapping("/members/name/{firstName}")
    public Member fetchTextMembersByName(@PathVariable("firstName") String firstName)

    {
        return memberService.fetchMembersByFirstName(firstName);

    }

    @PutMapping("/members/{id}")
    public Member updateMember(@PathVariable("id") Long id, @RequestBody Member member)

    {

        return memberService.updateMember(id, member);
    }



}
