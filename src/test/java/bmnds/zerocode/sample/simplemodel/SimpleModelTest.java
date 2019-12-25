package bmnds.zerocode.sample.simplemodel;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;

import bmnds.zerocode.sample.simplemapper.BeerModelMapper;
import bmnds.zerocode.sample.simplemapper.BeerStructMapper;

public class SimpleModelTest {

	@Test
	@DisplayName("testing BeanUtils Entity to Data Transfer Object")
	void testBeanUtils() {
		Beer beer = generateBeer();

		BeerDto dto = new BeerDto();
		BeanUtils.copyProperties(beer, dto);
		this.assertEntityToDto(beer, dto);

		Beer entity = new Beer();
		BeanUtils.copyProperties(dto, entity);
		this.assertDtoToEntity(dto, entity);
	}

	@Test
	@DisplayName("testing Mapstruct Entity to Data Transfer Object")
	void testMapstruct() {
		Beer beer = generateBeer();

		BeerDto dto = BeerStructMapper.INSTANCE.toDto(beer);
		this.assertEntityToDto(beer, dto);

		Beer entity = BeerStructMapper.INSTANCE.toEntity(dto);
		this.assertDtoToEntity(dto, entity);
	}

	@Test
	@DisplayName("testing ModelMapper Entity to Data Transfer Object")
	void testModelMapper() {
		Beer beer = generateBeer();

		BeerDto dto = BeerModelMapper.INSTANCE.toDto(beer);
		this.assertEntityToDto(beer, dto);

		Beer entity = BeerModelMapper.INSTANCE.toEntity(dto);
		this.assertDtoToEntity(dto, entity);
	}

	private void assertEntityToDto(Beer beer, BeerDto dto) {
		assertAll("Mapping from Entity to Data Transfer Object",
				() -> assertEquals(beer.getId(), dto.getId(), "Id"),
				() -> assertEquals(beer.getBeerName(), dto.getBeerName(),
						"Beer Name"),
				() -> assertEquals(beer.getUpc(), dto.getUpc(), "UPC"),
				() -> assertEquals(beer.getPrice(), dto.getPrice(), "Price"),
				() -> assertEquals(beer.getQuantityToBrew(),
						dto.getQuantityToBrew(), "Quantity to Brew"),
				() -> assertEquals(beer.getMinOnHand(), dto.getMinOnHand(),
						"Min on Hand"));
	}

	private void assertDtoToEntity(BeerDto dto, Beer entity) {
		assertAll("Mapping from Data Transfer Object to Entity",
				() -> assertEquals(dto.getId(), entity.getId(), "Id"),
				() -> assertEquals(dto.getBeerName(), entity.getBeerName(),
						"Beer Name"),
				() -> assertEquals(dto.getUpc(), entity.getUpc(), "UPC"),
				() -> assertEquals(dto.getPrice(), entity.getPrice(), "Price"),
				() -> assertEquals(dto.getQuantityToBrew(),
						entity.getQuantityToBrew(), "Quantity to Brew"),
				() -> assertEquals(dto.getMinOnHand(), entity.getMinOnHand(),
						"Min on Hand"));
	}

	private Beer generateBeer() {
		return Beer.builder()
				.id(UUID.randomUUID())
				.beerName("Skol")
				.upc(13L)
				.beerStyle(BeerStyleEnum.PIELSEN)
				.minOnHand(12)
				.quantityToBrew(120)
				.price(new BigDecimal("7.5"))
				.build();
	}

}
