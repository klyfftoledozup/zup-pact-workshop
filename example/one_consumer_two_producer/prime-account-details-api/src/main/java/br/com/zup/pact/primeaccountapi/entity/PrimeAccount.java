package br.com.zup.pact.primeaccountapi.entity;

import br.com.zup.pact.primeaccountapi.dto.PrimeAccountDetailsDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class PrimeAccount {

    private Boolean isPrime;
    private Integer discountPercentageFee;

    public static PrimeAccountDetailsDTO fromEntityToDto(PrimeAccount primeAccount) {
        if (Objects.nonNull(primeAccount)){
            return PrimeAccountDetailsDTO.builder()
                    .isPrime(primeAccount.getIsPrime())
                    .discountPercentageFee(primeAccount.getDiscountPercentageFee())
                    .build();
        }
        return null;
    }
}
