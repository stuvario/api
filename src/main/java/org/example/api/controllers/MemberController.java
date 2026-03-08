package org.example.api.controllers;

import jakarta.validation.Valid;
import org.example.api.controllers.requests.CreateMemberRequest;
import org.example.api.controllers.responses.CreateMemberResponse;
import org.example.api.dto.MemberDto;
import org.example.api.entities.Member;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

    @PostMapping
    public CreateMemberResponse createMember(@Valid @RequestBody CreateMemberRequest memberDto) {
        Member member = Member.builder()
                .firstName(memberDto.firstName())
                .lastName(memberDto.lastName())
                .email(memberDto.email())
                .password(memberDto.password())
                .phone(memberDto.phone())
                .build();

        return new CreateMemberResponse(member);
    }

}
