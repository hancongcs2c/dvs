package com.cs2c.dvs.label.action;

import java.sql.SQLException;
import java.util.List;

import com.cs2c.dvs.common.BaseAction;
import com.cs2c.dvs.label.service.LabelService;
import com.cs2c.dvs.pojo.Label;
import com.opensymphony.xwork2.Action;

public class LabelAction extends BaseAction  implements Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LabelService labelService;
	private List<Label> labelList;
	private Label label;

	private int labelId;
	private String labelName;
	private String labelLevel;
	
	public String getLabelLevel() {
		return labelLevel;
	}

	public void setLabelLevel(String labelLevel) {
		this.labelLevel = labelLevel;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	

	public LabelService getLabelService() {
		return labelService;
	}

	public void setLabelService(LabelService labelService) {
		this.labelService = labelService;
	}

	public List<Label> getLabelList() {
		return labelList;
	}

	public void setLabelList(List<Label> labelList) {
		this.labelList = labelList;
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
	
	public String queryAllLabel(){
		try {
			labelList = labelService.queryAllLabel();
			System.out.println("action:"+labelList);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "queryAllLabel";
		
	}
	
	/*@common.validation.FormValidator(input = "paraNull", 
			value = "labelName,,required")*/
	public String addLabel(){
		label = new Label(this.labelName,this.labelLevel);
		try {
			labelService.addLabel(label);
			//System.out.println(label.getLabelName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "addLabel";
	}
	/*@common.validation.FormValidator(input = "paraNull", 
			value = "labelName,,required")*/
	public String updateLabel(){
		label = new Label(this.labelId,this.labelName,this.labelLevel);
		try {
			labelService.updateLabel(label);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "updateLabel";
	}
	/*@common.validation.FormValidator(input = "paraNull", 
			value = "labelId,,required")*/
	public String deleteLabel(){
		try {
			labelService.deleteLabel(labelId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "delLabel";
	}

}
