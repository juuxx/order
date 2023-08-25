package dev.practice.order.domain.partner;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Builder
@Getter
public class PartnerCommand {
    private final String partnerName;
    private final String businessNo;
    private final String email;

    public Partner toEntity() {
        return Partner.builder()
                .partnerName(partnerName)
                .businessNumber(businessNo)
                .email(email)
                .build();
    }
}
