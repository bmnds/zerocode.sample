package bmnds.zerocode.sample.complexmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TireDto {

	private String brand;
	private Integer radius;

}
