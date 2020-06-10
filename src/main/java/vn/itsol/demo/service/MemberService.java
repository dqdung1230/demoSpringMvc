package vn.itsol.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.itsol.demo.entity.Member;
import vn.itsol.demo.repository.MemberRepository;

import java.util.List;
import java.util.Map;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Map<String, String> getCountryList() {
        return memberRepository.getCountryList();
    }
    public List<Member> getMemberList(){
        return memberRepository.getListMember();
    }
}
