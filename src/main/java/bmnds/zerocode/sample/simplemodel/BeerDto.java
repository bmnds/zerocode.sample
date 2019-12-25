package bmnds.zerocode.sample.simplemodel;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {

	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;
	private BigDecimal price;
	private Integer minOnHand;
	private Integer quantityToBrew;

}
