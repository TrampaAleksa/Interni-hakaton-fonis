package com.fonis.interni;

import org.springframework.stereotype.Component;

@Component
public class RepositoryStorage {


    private MemberRepository memberRepository;

    public RepositoryStorage(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
