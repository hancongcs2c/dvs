package com.cs2c.dvs.data.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;

import com.cs2c.dvs.common.BaseAction;
import com.cs2c.dvs.common.Pager;
import com.cs2c.dvs.data.service.DataService;
import com.cs2c.dvs.pojo.Data;

public class DataAction extends BaseAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int dataId;
	private String community;
	private String project;
	private String name;
	private String email;
	private String affliation;
	private Date date;
	private String startDate;
	private String overDate;
	private int added;
	private int removed;
	private int changeset;
	
	private DataService service;
	private Data data;
	private List<Data> dataList;
	private String submitFlag;
	@SuppressWarnings("rawtypes")
	private List<HashMap> sumDataList;
	private Pager pager;
	private int pageNum;
	
	
	//total
	private List<Data> dataLists;
	private int csets;
	private int developers;
	private int employers;
	private int addeds;
	private int removeds;
	private int coms;
	private int pros;
	
	//rank
	@SuppressWarnings("rawtypes")
	private List<HashMap> rankMap;
	private JSONArray  dataSource;
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getOverDate() {
		return overDate;
	}
	public void setOverDate(String overDate) {
		this.overDate = overDate;
	}
	@SuppressWarnings("rawtypes")
	public List<HashMap> getSumDataList() {
		return sumDataList;
	}
	@SuppressWarnings("rawtypes")
	public void setSumDataList(List<HashMap> sumDataList) {
		this.sumDataList = sumDataList;
	}
	public JSONArray getDataSource() {
		return dataSource;
	}
	public void setDataSource(JSONArray dataSource) {
		this.dataSource = dataSource;
	}
	@SuppressWarnings("rawtypes")
	public List<HashMap> getRankMap() {
		return rankMap;
	}
	@SuppressWarnings("rawtypes")
	public void setRankMap(List<HashMap> rankMap) {
		this.rankMap = rankMap;
	}
	public int getComs() {
		return coms;
	}
	public void setComs(int coms) {
		this.coms = coms;
	}
	public int getPros() {
		return pros;
	}
	public void setPros(int pros) {
		this.pros = pros;
	}
	public List<Data> getDataLists() {
		return dataLists;
	}
	public void setDataLists(List<Data> dataLists) {
		this.dataLists = dataLists;
	}
	public int getCsets() {
		return csets;
	}
	public void setCsets(int csets) {
		this.csets = csets;
	}
	public int getDevelopers() {
		return developers;
	}
	public void setDevelopers(int developers) {
		this.developers = developers;
	}
	public int getEmployers() {
		return employers;
	}
	public void setEmployers(int employers) {
		this.employers = employers;
	}
	public int getAddeds() {
		return addeds;
	}
	public void setAddeds(int addeds) {
		this.addeds = addeds;
	}
	public int getRemoveds() {
		return removeds;
	}
	public void setRemoveds(int removeds) {
		this.removeds = removeds;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public String getSubmitFlag() {
		return submitFlag;
	}
	public void setSubmitFlag(String submitFlag) {
		this.submitFlag = submitFlag;
	}
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getDataId() {
		return dataId;
	}
	public void setDataId(int dataId) {
		this.dataId = dataId;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAffliation() {
		return affliation;
	}
	public void setAffliation(String affliation) {
		this.affliation = affliation;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
		
	}
	public int getAdded() {
		return added;
	}
	public void setAdded(int added) {
		this.added = added;
	}
	public int getRemoved() {
		return removed;
	}
	public void setRemoved(int removed) {
		this.removed = removed;
	}
	public int getChangeset() {
		return changeset;
	}
	public void setChangeset(int changeset) {
		this.changeset = changeset;
	}
	public DataService getService() {
		return service;
	}
	public void setService(DataService service) {
		this.service = service;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	
	
	public List<Data> getDataList() {
		return dataList;
	}
	public void setDataList(List<Data> dataList) {
		this.dataList = dataList;
	}
	
	
	
	//Top changeset contributors by employer
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String rankData(){
		try {
			//取出所有数据
			rankMap = service.queryRank(community);
			
			int total=0;
			int otherTotal=0;
			int sumTemp=0;
			float perTemp = 0;
			int otherTemp = 0;
			int rankSize=rankMap.size();
			//计算总changeset数量
			for(int i = 0;i < rankSize;i++){
				sumTemp = Integer.parseInt(rankMap.get(i).get("sum").toString());
				total += sumTemp;
			}
			
			//计算percent，替换排名之外的项为others
			for(int i = 0;i < rankSize;i++){
				sumTemp = Integer.parseInt(rankMap.get(i).get("sum").toString());
				//DecimalFormat formater = new DecimalFormat("##.##");
				//rankMap.get(i).put("percent", formater.format(100.0*sumTemp/total));
				rankMap.get(i).put("percent", 100.0*sumTemp/total);
				if((rankMap.get(i).get("affliation").equals("(Unknown)"))||(i > 10)){
					rankMap.get(i).put("affliation", "Others");
				}
			}
			
			//累加others中的sum
			for(int i = 0;i < rankSize;i++){
				if(rankMap.get(i).get("affliation").equals("Others")){
					otherTemp = Integer.parseInt(rankMap.get(i).get("sum").toString());
					otherTotal+=otherTemp;
				}
			}
			
			//获取others的条目，如果满足条件，需要删除，给rankSize--，如果不是需要删除的，i++下一个
			for(int i = 0;i < rankSize;){
				if(rankMap.get(i).get("affliation").equals("Others")){
					rankMap.remove(i);
					rankSize--;
				}
				else{
					i++;
				}
			}
			
			//map中添加累加起来的数组
			//DecimalFormat formater = new DecimalFormat("##.##");
			perTemp = (float) (100.0*otherTotal/total);
			HashMap map = new HashMap();
			//map.put("percent", formater.format(perTemp));
			map.put("percent", perTemp);
			map.put("sum", otherTotal);
			map.put("affliation", "Others");
			rankMap.add(map);
			
			//转化为json类型，直接用于饼状图数据源
			dataSource = JSONArray.fromObject(rankMap);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "rankData";
	}
	/*
	 * 查询汇总数据
	 */
	public String querySumData(){
		try {
			sumDataList = service.querySumData();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "querySumData";
	}
	
	public void init(){
		if(name!=null&&name.toString().length()==0){
			name=null;
		}
		if(project!=null&&project.toString().length()==0){
			project=null;
		}
		if(startDate!=null&&startDate.toString().length()==0){
			startDate=null;
		}
		if(overDate!=null&&overDate.toString().length()==0){
			overDate=null;
		}
	}
	
	public String queryData(){
		
		try {
			
			init();
			HttpSession session = servletRequest.getSession();
			
			/*用session记录查询条件*/
			if ("yes".equals(this.submitFlag)) {
				session.setAttribute("name", this.name);
				session.setAttribute("project", this.project);
				session.setAttribute("affliation", this.affliation);
				session.setAttribute("startDate", this.startDate);
				session.setAttribute("overDate", this.overDate);
			}
				
			if (session.getAttribute("name") != null) {
				this.name = (String) session.getAttribute("name");
			}
			if (session.getAttribute("project") != null) {
				this.project = (String) session.getAttribute("project");
			}
			if (session.getAttribute("affliation") != null) {
				this.affliation = (String) session.getAttribute("affliation");
			}
			
			Date startDate1 = null;
			Date overDate1 = null;
			if (session.getAttribute("startDate") != null&&session.getAttribute("startDate").toString().length()!=0) {
				this.startDate = (String) session.getAttribute("startDate");
				startDate1 = java.sql.Date.valueOf(startDate);
			}
			if (session.getAttribute("overDate") != null && session.getAttribute("overDate").toString().length()!=0 ) {
				this.overDate = (String) session.getAttribute("overDate");
				overDate1 = java.sql.Date.valueOf(overDate);
			}
			
				//pagination list
				pager = new Pager(service.getCount(name,project,affliation,startDate1,overDate1), pageNum);
				dataList = service.queryData(pager,name,project,affliation,startDate1,overDate1);
				dataLists = service.queryData(name,project,affliation,startDate1,overDate1);
				//total
				List<String> listTemp = new ArrayList<String>();
				String opTemp;
				int numTemp=0;
				
				//计算贡献者数量
				for(int i = 0;i < dataLists.size();i++){
					opTemp = dataLists.get(i).getName();
					if(!listTemp.contains(opTemp)) {  
						listTemp.add(opTemp);
		            }
				}
				developers = listTemp.size();
				listTemp.clear();
				
				//计算项目数量
				for(int i = 0;i < dataLists.size();i++){
					opTemp = dataLists.get(i).getProject();
					if(!listTemp.contains(opTemp)) {  
						listTemp.add(opTemp);
		            }
				}
				pros = listTemp.size();
				listTemp.clear();
				
				//计算社区数量
				for(int i = 0;i < dataLists.size();i++){
					opTemp = dataLists.get(i).getCommunity();
					if(!listTemp.contains(opTemp)) {
						listTemp.add(opTemp);
		            }
				}
				coms = listTemp.size();
				listTemp.clear();
				
				//计算公司数量
				for(int i = 0;i < dataLists.size();i++){
					opTemp = dataLists.get(i).getAffliation();
					if(!listTemp.contains(opTemp)) {  
						listTemp.add(opTemp);
		            }
				}
				employers = listTemp.size();
				listTemp.clear();
				
				//总的added数量
				addeds=0;
				for(int i = 0;i < dataLists.size();i++){
					numTemp = dataLists.get(i).getAdded();
					addeds+=numTemp;
				}
				
				//总的removed数量
				removeds=0;
				for(int i = 0;i < dataLists.size();i++){
					numTemp = dataLists.get(i).getRemoved();
					removeds+=numTemp;
				}
				
				//总的changeset数量
				csets=0;
				for(int i = 0;i < dataLists.size();i++){
					numTemp = dataLists.get(i).getChangeset();
					csets+=numTemp;
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
				pageNum=1;
			}
		return "queryData";
	}
	
}
