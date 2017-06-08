package com.nortal.lazar.realestate.model;

public class RealEstateWrapperModel {

	private RealEstateModel realEstateModel;

	private RealEstateAddressModel realEstateAddressModel;

	public RealEstateWrapperModel(RealEstateModel realEstateModel, RealEstateAddressModel realEstateAddressModel) {		
		this.realEstateModel = realEstateModel;
		this.realEstateAddressModel = realEstateAddressModel;
	}

	public RealEstateWrapperModel() {
		realEstateModel = new RealEstateModel();
		realEstateAddressModel = new RealEstateAddressModel();
	}

}
