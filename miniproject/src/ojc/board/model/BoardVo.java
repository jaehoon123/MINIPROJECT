package ojc.board.model;

import lombok.Data;

@Data
public class BoardVo {
	private String weekId;  
	private String subject;  
	private String deptCode;  
	private String deptNm;  
	private String createId;  
	private String createDate;  
	private String updateDate;  
	private String deleteYn;  
	private String weekJobRp;

	private String nxweekJobRp;
	private String weekJobPl;
	private String nxweekJobPl;
	private String etc;
	private String flag;

	
	public final String getDeptNm() {
		return deptNm;
	}
	public final void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}
	public final String getFlag() {
		return flag;
	}
	public final void setFlag(String flag) {
		this.flag = flag;
	}
	public final String getNxweekJobRp() {
		return nxweekJobRp;
	}
	public final void setNxweekJobRp(String nxweekJobRp) {
		this.nxweekJobRp = nxweekJobRp;
	}
	public final String getweekJobPl() {
		return weekJobPl;
	}
	public final void setWeekJobPl(String weekJobPl) {
		this.weekJobPl = weekJobPl;
	}
	public final String getNxweekJobPl() {
		return nxweekJobPl;
	}
	public final void setnxweekJobPl(String nxweekJobPl) {
		this.nxweekJobPl = nxweekJobPl;
	}
	public final String getEtc() {
		return etc;
	}
	public final void setEtc(String etc) {
		this.etc = etc;
	}
	public final String getWeekId() {
		return weekId;
	}
	public final void setWeekId(String weekId) {
		this.weekId = weekId;
	}
	public final String getSubject() {
		return subject;
	}
	public final void setSubject(String subject) {
		this.subject = subject;
	}
	public final String getDeptCode() {
		return deptCode;
	}
	public final void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public final String getCreateId() {
		return createId;
	}
	public final void setCreateId(String createId) {
		this.createId = createId;
	}
	public final String getCreateDate() {
		return createDate;
	}
	public final void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public final String getUpdateDate() {
		return updateDate;
	}
	public final void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public final String getDeleteYn() {
		return deleteYn;
	}
	public final void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}
	public final String getweekJobRp() {
		return weekJobRp;
	}
	public final void setWeekJobRp(String weekJobRp) {
		this.weekJobRp = weekJobRp;
	}  
	
	
	

}