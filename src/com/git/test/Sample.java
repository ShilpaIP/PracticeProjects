package com.git.test;

public class Sample {
	
	private int sampleId;
	private String sampleName;
	
	public Sample(int sampleId){
		this.sampleId = sampleId;
	}
	
	public int getSampleId(){
		return sampleId;
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	

}
