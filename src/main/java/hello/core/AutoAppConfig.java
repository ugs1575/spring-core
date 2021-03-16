package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( //컴포넌트 스캔 대상 제외
        //basePackages = "hello.core.member", //해당 위치부터 시작해서 하위 패키지를 탐색
        //basePackageClasses = AutoAppConfig.class, //해당 파일이 있는 패키지부터 탐색
        //만약 지정하지 않으 @ComponentScan붙인 패키지 시작해서 하위 패키지 탐색
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    /*@Bean(name = "memoryMemberRepository")
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }*/

}
