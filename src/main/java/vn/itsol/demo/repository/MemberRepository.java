package vn.itsol.demo.repository;

import org.springframework.stereotype.Repository;
import vn.itsol.demo.entity.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemberRepository {
    public Map<String, String> getCountryList() {
        Map<String, String> countryList = new HashMap<>();
        countryList.put("US", "United States");
        countryList.put("VN", "Việt Nam");
        return countryList;
    }

    public List<Member> getListMember() {
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Member member = new Member();
            member.setId(i);
            member.setName("Nguyen Van" + i);
        }
        return members;
    }
}
