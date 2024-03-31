package daelim.spring.ch03.service;

import daelim.spring.ch03.Member;
import daelim.spring.ch03.MemberDao;
import daelim.spring.ch03.exception.MemberNotFoundException;

public class ChangePasswordService {
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
