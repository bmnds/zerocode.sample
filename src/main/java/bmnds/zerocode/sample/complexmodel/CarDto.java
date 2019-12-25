package bmnds.zerocode.sample.complexmodel;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {

	private UUID id;
	private String manufacturer;
	private Integer seatCount;
	private String colorName;
	private TireDto[] tires;

}
