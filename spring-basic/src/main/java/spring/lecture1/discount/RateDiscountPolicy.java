package spring.lecture1.discount;

import org.springframework.stereotype.Component;
import spring.lecture1.member.Grade;
import spring.lecture1.member.Member;

@Component
public class RateDiscountPolicy implements DiscountPolicy {

    private final int discountPercent=10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        }
        return 0;
    }
}
