package bmnds.zerocode.sample.simplemapper;

import org.modelmapper.ModelMapper;

import bmnds.zerocode.sample.simplemodel.Beer;
import bmnds.zerocode.sample.simplemodel.BeerDto;

public class BeerModelMapper {

	private ModelMapper mapper;

	public static final BeerModelMapper INSTANCE = new BeerModelMapper();

	public BeerModelMapper() {
		this.mapper = new ModelMapper();
	}

	public BeerDto toDto(Beer beer) {
		return mapper.map(beer, BeerDto.class);
	}

	public Beer toEntity(BeerDto dto) {
		return mapper.map(dto, Beer.class);
	}

}
