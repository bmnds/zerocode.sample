package bmnds.zerocode.sample.complexmodel.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

import bmnds.zerocode.sample.complexmodel.Car;
import bmnds.zerocode.sample.complexmodel.CarDto;

public class CarModelMapper {

	public static final CarModelMapper INSTANCE = new CarModelMapper();

	private ModelMapper mapper;

	public CarModelMapper() {
		mapper = new ModelMapper();

		TypeMap<Car, CarDto> dtoTypeMap = mapper.createTypeMap(Car.class,
				CarDto.class);
		dtoTypeMap.addMapping(Car::getNumberOfSeats, CarDto::setSeatCount);

		TypeMap<CarDto, Car> entityTypeMap = mapper.createTypeMap(CarDto.class,
				Car.class);
		entityTypeMap.addMapping(CarDto::getSeatCount, Car::setNumberOfSeats);
	}

	public CarDto toDto(Car car) {
		return mapper.map(car, CarDto.class);
	}

	public Car toEntity(CarDto dto) {
		return mapper.map(dto, Car.class);
	}

}
