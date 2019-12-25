package bmnds.zerocode.sample.complexmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tire {

	private BrandEnum brand;
	private Integer radius;

}
