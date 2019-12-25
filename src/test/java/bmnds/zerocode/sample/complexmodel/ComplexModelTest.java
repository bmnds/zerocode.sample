package bmnds.zerocode.sample.complexmodel;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import bmnds.zerocode.sample.complexmodel.mapper.CarModelMapper;
import bmnds.zerocode.sample.complexmodel.mapper.CarStructMapper;
import bmnds.zerocode.sample.complexmodel.utils.CarGenerator;

public class ComplexModelTest {

	@Test
	@DisplayName("testing Mapstruct Entity to Data Transfer Object")
	void testMapstruct() {
		Car car = CarGenerator.generateCar();

		CarDto dto = CarStructMapper.INSTANCE.toDto(car);
		this.assertMapping(car, dto,
				"Mapping from Entity to Data Transfer Object");

		Car entity = CarStructMapper.INSTANCE.toEntity(dto);
		this.assertMapping(entity, dto,
				"Mapping from Data Transfer Object to Entity");
	}

	@Test
	@DisplayName("testing ModelMapper Entity to Data Transfer Object")
	void testModelMapper() {
		Car car = CarGenerator.generateCar();

		CarDto dto = CarModelMapper.INSTANCE.toDto(car);
		this.assertMapping(car, dto,
				"Mapping from Entity to Data Transfer Object");

		Car entity = CarModelMapper.INSTANCE.toEntity(dto);
		this.assertMapping(entity, dto,
				"Mapping from Data Transfer Object to Entity");
	}

	private void assertMapping(Car entity, CarDto dto, String message) {
		assertAll(message,
				() -> assertEquals(entity.getId(), dto.getId(), "Id"),
				() -> assertEquals(entity.getManufacturer().name(),
						dto.getManufacturer(), "Manufacturer"),
				() -> assertEquals(entity.getNumberOfSeats(),
						dto.getSeatCount(), "Seat Count"),
				() -> assertEquals(entity.getColor().getName(),
						dto.getColorName(), "Color"),
				() -> assertEquals(entity.getTires().size(),
						dto.getTires().length, "Quantity of Tires"),
				() -> assertEquals(entity.getTires().get(0).getRadius(),
						dto.getTires()[0].getRadius(), "Radius of First Tire"),
				() -> assertEquals(entity.getTires().get(0).getBrand().name(),
						dto.getTires()[0].getBrand(),
						"Brand of First Tire"));
	}

}
