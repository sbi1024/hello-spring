package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    // @Autowired 필드 주입
    // private MemberService memberService;

    // @Autowired 세터주입
    // public void setMemberController(MemberService memberService) {
    //     this.memberService = memberService;
    // }

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
