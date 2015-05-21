package com.js.octopus.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="system_status")
public class SystemEntity implements Serializable{

	private static final long serialVersionUID = -5697979303514616220L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "hostip")
	private String hostIp;
	
	@Column(name = "nloadaverage")
	private Float nLoadAverage; 
	
	@Column(name = "nblockin")
	private Integer nBlockIn;    
	
	@Column(name = "nblockout")
	private Integer nBlockOut;   
	
	@Column(name = "nsariowait")
	private Float nSarIowait;   
	
	@Column(name = "nsaridle")
	private Float nSarIdle;     
	
	@Column(name = "nsaruser")
	private Float nSarUser;     
	
	@Column(name = "nsarsystem")
	private Float nSarSystem;   
	
	@Column(name = "nmemtotal")
	private Long nMemTotal;    
	
	@Column(name = "nmemused")
	private Long nMemUsed;     
	
	@Column(name = "nmemfree")
	private Long nMemFree;     
	
	@Column(name = "nswaptotal")
	private Long nSwapTotal;   
	
	@Column(name = "nswapused")
	private Long nSwapUsed;    
	
	@Column(name = "nswapfree")
	private Long nSwapFree;    
	
	@Column(name = "actual_time")
	private Date actualTime;    
	 
	@Column(name = "enabled")
	private String enabled;
	
	@Column(name = "comment")
	private String comment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHostIp() {
		return hostIp;
	}

	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}

	public Float getnLoadAverage() {
		return nLoadAverage;
	}

	public void setnLoadAverage(Float nLoadAverage) {
		this.nLoadAverage = nLoadAverage;
	}

	public Integer getnBlockIn() {
		return nBlockIn;
	}

	public void setnBlockIn(Integer nBlockIn) {
		this.nBlockIn = nBlockIn;
	}

	public Integer getnBlockOut() {
		return nBlockOut;
	}

	public void setnBlockOut(Integer nBlockOut) {
		this.nBlockOut = nBlockOut;
	}

	public Float getnSarIowait() {
		return nSarIowait;
	}

	public void setnSarIowait(Float nSarIowait) {
		this.nSarIowait = nSarIowait;
	}

	public Float getnSarIdle() {
		return nSarIdle;
	}

	public void setnSarIdle(Float nSarIdle) {
		this.nSarIdle = nSarIdle;
	}

	public Float getnSarUser() {
		return nSarUser;
	}

	public void setnSarUser(Float nSarUser) {
		this.nSarUser = nSarUser;
	}

	public Float getnSarSystem() {
		return nSarSystem;
	}

	public void setnSarSystem(Float nSarSystem) {
		this.nSarSystem = nSarSystem;
	}

	public Long getnMemTotal() {
		return nMemTotal;
	}

	public void setnMemTotal(Long nMemTotal) {
		this.nMemTotal = nMemTotal;
	}

	public Long getnMemUsed() {
		return nMemUsed;
	}

	public void setnMemUsed(Long nMemUsed) {
		this.nMemUsed = nMemUsed;
	}

	public Long getnMemFree() {
		return nMemFree;
	}

	public void setnMemFree(Long nMemFree) {
		this.nMemFree = nMemFree;
	}

	public Long getnSwapTotal() {
		return nSwapTotal;
	}

	public void setnSwapTotal(Long nSwapTotal) {
		this.nSwapTotal = nSwapTotal;
	}

	public Long getnSwapUsed() {
		return nSwapUsed;
	}

	public void setnSwapUsed(Long nSwapUsed) {
		this.nSwapUsed = nSwapUsed;
	}

	public Long getnSwapFree() {
		return nSwapFree;
	}

	public void setnSwapFree(Long nSwapFree) {
		this.nSwapFree = nSwapFree;
	}

	public Date getActualTime() {
		return actualTime;
	}

	public void setActualTime(Date actualTime) {
		this.actualTime = actualTime;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}        

	
}
