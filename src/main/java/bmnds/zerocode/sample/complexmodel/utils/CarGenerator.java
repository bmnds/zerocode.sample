package bmnds.zerocode.sample.complexmodel.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bmnds.zerocode.sample.complexmodel.Car;
import bmnds.zerocode.sample.complexmodel.Color;

public class CarGenerator {

	private static Random RND;
	private static List<String> COLORS;

	static {
		RND = new Random();
		COLORS = Arrays.asList("Branco Glacial", "Vermelho Flash",
				"Cinza Urano", "Preto Ninja", "Prata Light", "Cinza Cosmo",
				"Azul Índigo");
	}

	public static Car generateCar() {
		return Car.builder()
				.id(UUID.randomUUID())
				.manufacturer(ManufacturerRandomizer.INSTANCE.randomize())
				.numberOfSeats(4 + RND.nextInt(3))
				.color(Color.builder()
						.name(COLORS.get(RND.nextInt(COLORS.size())))
						.build())
				.tires(Stream.generate(TireGenerator::generateTire)
						.limit(4)
						.collect(Collectors.toList()))
				.build();
	}

}
