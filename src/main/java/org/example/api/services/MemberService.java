package org.example.api.services;

import lombok.RequiredArgsConstructor;
import org.example.api.entities.Member;
import org.example.api.repositories.MemberRepository;
import org.example.api.services.interfaces.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements IMemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member createMember(Member member) {
        //hash pw etc
        //send emails
        //bleh bleh bleh



        return memberRepository.save(member);
    }
}
