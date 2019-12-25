package bmnds.zerocode.sample.simplemapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import bmnds.zerocode.sample.simplemodel.Beer;
import bmnds.zerocode.sample.simplemodel.BeerDto;

@Mapper
public interface BeerStructMapper {

	BeerStructMapper INSTANCE = Mappers.getMapper(BeerStructMapper.class);

	BeerDto toDto(Beer beer);

	Beer toEntity(BeerDto dto);

}
