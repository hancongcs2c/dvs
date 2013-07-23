package com.cs2c.dvs.pojo;

public class Label {
	private int labelId;
	private String labelName;
	private String labelLevel;
	
	public Label() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Label(String labelName, String labelLevel) {
		super();
		this.labelName = labelName;
		this.labelLevel = labelLevel;
	}

	public Label(int labelId, String labelName, String labelLevel) {
		super();
		this.labelId = labelId;
		this.labelName = labelName;
		this.labelLevel = labelLevel;
	}

	public int getLabelId() {
		return labelId;
	}

	public void setLabelId(int labelId) {
		this.labelId = labelId;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getLabelLevel() {
		return labelLevel;
	}

	public void setLabelLevel(String labelLevel) {
		this.labelLevel = labelLevel;
	}

	@Override
	public String toString() {
		return "Label [labelId=" + labelId + ", labelName=" + labelName
				+ ", labelLevel=" + labelLevel + "]";
	}
	
	
}
