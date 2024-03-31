package daelim.spring.ch04.service;

import daelim.spring.ch04.Member;
import daelim.spring.ch04.MemberDao;
import daelim.spring.ch04.exception.MemberNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;


public class ChangePasswordService {

    @Autowired
    private MemberDao memberDao;
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void changePassword(String email, String oldPassword, String newPassword) {
        Member member = memberDao.selectByEmail(email);
        if(member == null)
            throw new MemberNotFoundException();

        member.changePassword(oldPassword, newPassword);
        memberDao.update(member);
    }
}
