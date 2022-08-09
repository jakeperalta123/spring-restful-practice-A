package com.example.springrestfulpracticeA.Controller;

import com.example.springrestfulpracticeA.Model.Member;
import com.example.springrestfulpracticeA.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Member")
public class MemberController {
    @Autowired
    private MemberService memberservice;

    @GetMapping()
    public List<Member> getAllMembers() {
        List<Member> memberList = this.memberservice.getAllMembers();
        return memberList;
    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable int id) {
        Member member = (Member) this.memberservice.getMember(id);
        return member;
    }

    @PostMapping()
    public Member createMember(@RequestBody Member member) {
        return this.memberservice.createMember(member);
    }

    @PutMapping("/{Id}")
    public Member updateMember(@PathVariable int Id, @RequestBody Member member) {
        Member updateMember = this.memberservice.updateMember(Id, member);
        return member;
    }

    @DeleteMapping("/{Id}")
    public Member deleteMember(@PathVariable int Id) {
        Member deleteMember = this.memberservice.deleteMember(Id);
        return deleteMember;
    }

}
