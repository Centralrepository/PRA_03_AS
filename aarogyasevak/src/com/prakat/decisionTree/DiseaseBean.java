package com.prakat.decisionTree;

public class DiseaseBean {
	String disease=null;
	String remarks=null;

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDisease() {
		System.out.println(disease);
		return disease;
	}

	public void setDisease(String disease) {
		System.out.println(disease);
		this.disease = disease;
	}

}
