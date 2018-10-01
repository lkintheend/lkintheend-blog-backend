package com.ifi.entity;
// Generated Oct 1, 2018 4:26:22 PM by Hibernate Tools 5.2.11.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Post generated by hbm2java
 */
@Entity
@Table(name = "post", catalog = "tryhardmore")
public class Post implements java.io.Serializable {

	private Integer id;
	private Catagory catagory;
	private UserProfile userProfile;
	private String title;
	private String content;
	private Date createdTime;
	private Date updatedTime;
	private Boolean showStatus;
	private Set<Comment> comments = new HashSet<Comment>(0);
	private Set<PostTag> postTags = new HashSet<PostTag>(0);

	public Post() {
	}

	public Post(Catagory catagory, UserProfile userProfile, String title, String content, Date createdTime,
			Date updatedTime, Boolean showStatus, Set<Comment> comments, Set<PostTag> postTags) {
		this.catagory = catagory;
		this.userProfile = userProfile;
		this.title = title;
		this.content = content;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.showStatus = showStatus;
		this.comments = comments;
		this.postTags = postTags;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "catagory_id")
	public Catagory getCatagory() {
		return this.catagory;
	}

	public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_profile_id")
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Column(name = "title", length = 20)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "content", length = 1024)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_time", length = 19)
	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_time", length = 19)
	public Date getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	@Column(name = "show_status")
	public Boolean getShowStatus() {
		return this.showStatus;
	}

	public void setShowStatus(Boolean showStatus) {
		this.showStatus = showStatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "post")
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "post")
	public Set<PostTag> getPostTags() {
		return this.postTags;
	}

	public void setPostTags(Set<PostTag> postTags) {
		this.postTags = postTags;
	}

}
