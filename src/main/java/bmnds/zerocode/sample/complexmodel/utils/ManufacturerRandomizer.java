package bmnds.zerocode.sample.complexmodel.utils;

import bmnds.zerocode.sample.complexmodel.ManufacturerEnum;

public class ManufacturerRandomizer
		extends
			EnumRandomizer<ManufacturerEnum> {

	public static final ManufacturerRandomizer INSTANCE = new ManufacturerRandomizer();

	private ManufacturerRandomizer() {
		super(ManufacturerEnum.class);
	}

}
