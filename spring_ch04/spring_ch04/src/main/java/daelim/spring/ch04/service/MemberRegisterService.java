package daelim.spring.ch04.service;

import daelim.spring.ch04.Member;
import daelim.spring.ch04.MemberDao;
import daelim.spring.ch04.RegisterRequest;
import daelim.spring.ch04.exception.DuplicationMemberException;
import org.springframework.beans.factory.annotation.Autowired;


import java.time.LocalDateTime;

public class MemberRegisterService {
    @Autowired
    private MemberDao memberDao;


    // 생성자를 통해 의존 객체를 주입받음
    public MemberRegisterService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }



    public void regist(RegisterRequest req) {
        // 이메일로 회원 데이터 조회
        Member member = memberDao.selectByEmail(req.getEmail());
        //daelim.spring.ch04.Member member = memberDao.selectByEmail(req.getEmail());
        if(member != null) {
            // 이미 같은 이메일 가진 회원이 존재
            throw new DuplicationMemberException("Duplication Email : "+ req.getEmail());
        }
        //신규회원 등록
        memberDao.insert(
                new Member(req.getEmail(),req.getPassword(), req.getName(), LocalDateTime.now())
        );
    }
/*
    public void selectAll(){
        Collection<daelim.spring.ch04.Member>
    }

 */
}