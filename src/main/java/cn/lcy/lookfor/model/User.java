package cn.lcy.lookfor.model;
// Generated 2017-10-28 21:22:06 by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "lookfor")
public class User implements java.io.Serializable {

	private String identifyId;
	private String selfIntroduction;
	private String popularityValue;
	private String creditValue;
	private Date creditTime;
	private Set postViews = new HashSet(0);
	private Set postUncovers = new HashSet(0);
	private Set postReleases = new HashSet(0);

	public User() {
	}

	public User(String identifyId, Date creditTime) {
		this.identifyId = identifyId;
		this.creditTime = creditTime;
	}

	public User(String identifyId, String selfIntroduction, String popularityValue, String creditValue, Date creditTime,
			Set postViews, Set postUncovers, Set postReleases) {
		this.identifyId = identifyId;
		this.selfIntroduction = selfIntroduction;
		this.popularityValue = popularityValue;
		this.creditValue = creditValue;
		this.creditTime = creditTime;
		this.postViews = postViews;
		this.postUncovers = postUncovers;
		this.postReleases = postReleases;
	}

	@Id

	@Column(name = "identify_id", unique = true, nullable = false, length = 10)
	public String getIdentifyId() {
		return this.identifyId;
	}

	public void setIdentifyId(String identifyId) {
		this.identifyId = identifyId;
	}

	@Column(name = "self_introduction", length = 100)
	public String getSelfIntroduction() {
		return this.selfIntroduction;
	}

	public void setSelfIntroduction(String selfIntroduction) {
		this.selfIntroduction = selfIntroduction;
	}

	@Column(name = "popularity_value", length = 8)
	public String getPopularityValue() {
		return this.popularityValue;
	}

	public void setPopularityValue(String popularityValue) {
		this.popularityValue = popularityValue;
	}

	@Column(name = "credit_value", length = 8)
	public String getCreditValue() {
		return this.creditValue;
	}

	public void setCreditValue(String creditValue) {
		this.creditValue = creditValue;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "credit_time", nullable = false, length = 19)
	public Date getCreditTime() {
		return this.creditTime;
	}

	public void setCreditTime(Date creditTime) {
		this.creditTime = creditTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set getPostViews() {
		return this.postViews;
	}

	public void setPostViews(Set postViews) {
		this.postViews = postViews;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set getPostUncovers() {
		return this.postUncovers;
	}

	public void setPostUncovers(Set postUncovers) {
		this.postUncovers = postUncovers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set getPostReleases() {
		return this.postReleases;
	}

	public void setPostReleases(Set postReleases) {
		this.postReleases = postReleases;
	}

}
