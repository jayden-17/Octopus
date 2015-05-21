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
@Table(name="storage_status")
public class StorageEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7756443988920778400L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;          
	
	@Column(name = "hostip")
	private String hostip;  
	
	@Column(name = "nmounted")
	private String nmounted;
	
	@Column(name = "ntotal")
	private Long ntotal;    
	
	@Column(name = "nuse")
	private Long nuse;      
	
	@Column(name = "nfree")
	private Long nfree;     
	
	@Column(name = "npersent")
	private Integer npersent;
	
	@Column(name = "actual_time")
	private Date actual_time;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHostip() {
		return hostip;
	}

	public void setHostip(String hostip) {
		this.hostip = hostip;
	}

	public String getNmounted() {
		return nmounted;
	}

	public void setNmounted(String nmounted) {
		this.nmounted = nmounted;
	}

	public Long getNtotal() {
		return ntotal;
	}

	public void setNtotal(Long ntotal) {
		this.ntotal = ntotal;
	}

	public Long getNuse() {
		return nuse;
	}

	public void setNuse(Long nuse) {
		this.nuse = nuse;
	}

	public Long getNfree() {
		return nfree;
	}

	public void setNfree(Long nfree) {
		this.nfree = nfree;
	}

	public Integer getNpersent() {
		return npersent;
	}

	public void setNpersent(Integer npersent) {
		this.npersent = npersent;
	}

	public Date getActual_time() {
		return actual_time;
	}

	public void setActual_time(Date actual_time) {
		this.actual_time = actual_time;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	
	
}
