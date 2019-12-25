package bmnds.zerocode.sample.complexmodel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import bmnds.zerocode.sample.complexmodel.Car;
import bmnds.zerocode.sample.complexmodel.CarDto;

@Mapper
public interface CarStructMapper {

	CarStructMapper INSTANCE = Mappers.getMapper(CarStructMapper.class);

	@Mapping(source = "numberOfSeats", target = "seatCount")
	@Mapping(source = "color.name", target = "colorName")
	CarDto toDto(Car car);

	@Mapping(source = "seatCount", target = "numberOfSeats")
	@Mapping(source = "colorName", target = "color.name")
	Car toEntity(CarDto dto);

}
