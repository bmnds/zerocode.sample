package bmnds.zerocode.sample.complexmodel.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import bmnds.zerocode.sample.complexmodel.Tire;

public class TireGenerator {

	private static final Random RND;
	private static final List<Integer> RADIUS;

	static {
		RND = new Random();
		RADIUS = Arrays.asList(13, 14, 15);
	}

	public static Tire generateTire() {
		return Tire.builder()
				.brand(BrandRandomizer.INSTANCE.randomize())
				.radius(RADIUS.get(RND.nextInt(RADIUS.size())))
				.build();
	}

}
