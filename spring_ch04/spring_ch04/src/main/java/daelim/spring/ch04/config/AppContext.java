package daelim.spring.ch04.config;

import daelim.spring.ch04.*;
import daelim.spring.ch04.service.ChangePasswordService;
import daelim.spring.ch04.service.MemberRegisterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberRegisterService memberRegisterService() {
        return new MemberRegisterService(memberDao());
    }

    @Bean
    public ChangePasswordService changePasswordService() {
        ChangePasswordService changePasswordService = new ChangePasswordService();
        // 세터 메서드를 통해 직접 의족을 주입하지 않아도 스프링이 @Autowired가 붙은 필드에 해당 타입의 빈 객체를 찾아서 주입한다.
        //changePasswordService.setMemberDao(memberDao());
        return changePasswordService;
    }

    @Bean
    public MemberPrinter memberPrinter() {
        return new MemberPrinter();
    }

    @Bean
    public MemberListPrinter memberListPrinter() {
        return new MemberListPrinter();
        //return new MemberListPrinter(memberDao(), memberPrinter());
        //AUTOWIRED로 생성자를 자동 주입 시켰으니 없어도 상관없음
    }

    @Bean
    public MemberInfoPrinter memberInfoPrinter() {
        MemberInfoPrinter memberInfoPrinter = new MemberInfoPrinter();
        //memberInfoPrinter.setMemberDao(memberDao());
        //memberInfoPrinter.setMemberPrinter(memberPrinter());
        return memberInfoPrinter;
    }
    @Bean
    public VersionPrinter versionPrinter() {
        VersionPrinter versionPrinter = new VersionPrinter();
        versionPrinter.setMajorVersion(2);
        versionPrinter.setMajorVersion(1);
        return versionPrinter;
    }


}