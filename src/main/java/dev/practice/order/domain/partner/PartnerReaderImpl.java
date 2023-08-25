package dev.practice.order.domain.partner;

import dev.practice.order.common.exception.EntityNotFoundException;
import dev.practice.order.infrastructure.PartnerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class PartnerReaderImpl implements PartnerReader {

    private final PartnerRepository partnerRepository;
    @Override
    public Partner getPartner(String partnerToken) {
        return partnerRepository.findByPartnerToken(partnerToken).orElseThrow(EntityNotFoundException::new);
    }
}
