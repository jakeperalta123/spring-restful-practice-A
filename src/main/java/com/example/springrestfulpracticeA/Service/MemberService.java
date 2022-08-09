package com.example.springrestfulpracticeA.Service;

import com.example.springrestfulpracticeA.Model.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private List<Member> memberList = new ArrayList<>();
    public List<Member> getAllMembers(){
    return this.memberList;
    }
    public MemberService(){
        memberList.add(new Member(1,"Jake"));
        memberList.add(new Member(2,"Henry"));
        memberList.add(new Member(3,"Johnny"));
    }
    public Member getMember(int Id){
        for (Member member : this.memberList) {
            if (Id == member.getId()) {
                return member;
            }
        }
        return null;
    }

    public Member createMember(Member member){
        this.memberList.add(member);
        return member;
    }

    public Member updateMember(int Id, Member member) {
        for (Member updateMember : this.memberList) {
            if (Id == updateMember.getId()) {
                updateMember.setName(member.getName());
            }
        }
        return member;
    }

    public Member deleteMember(int Id) {
        for (Member deleteMember : this.memberList) {
            if (Id == deleteMember.getId()) {
                this.memberList.remove(deleteMember);
                return deleteMember;
            }
        }
        return null;
    }
}
