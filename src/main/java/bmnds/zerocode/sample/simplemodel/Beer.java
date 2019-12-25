package bmnds.zerocode.sample.simplemodel;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Beer {

	private UUID id;
	private String beerName;
	private BeerStyleEnum beerStyle;
	private Long upc;
	private BigDecimal price;
	private Integer minOnHand;
	private Integer quantityToBrew;
	private Long version;
	private LocalDateTime createdDate;
	private LocalDateTime lastModifiedDate;

}
