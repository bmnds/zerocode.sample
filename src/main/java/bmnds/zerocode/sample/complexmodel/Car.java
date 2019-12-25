package bmnds.zerocode.sample.complexmodel;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {

	private UUID id;
	private ManufacturerEnum manufacturer;
	private Integer numberOfSeats;
	private Color color;
	private List<Tire> tires;

}