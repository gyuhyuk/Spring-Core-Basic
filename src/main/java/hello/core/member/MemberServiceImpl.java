package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    public MemberServiceImpl(MemberRepository memberRepository) { // 생성자를 통해서 설정
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
