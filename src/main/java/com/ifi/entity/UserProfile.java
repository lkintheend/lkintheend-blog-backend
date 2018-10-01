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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserProfile generated by hbm2java
 */
@Entity
@Table(name = "user_profile", catalog = "tryhardmore")
public class UserProfile implements java.io.Serializable {

	private Integer id;
	private Role role;
	private String fullname;
	private Date birthday;
	private String avt;
	private Date createdTime;
	private Set<Comment> comments = new HashSet<Comment>(0);
	private User user;
	private Set<Post> posts = new HashSet<Post>(0);
	private GmailUser gmailUser;

	public UserProfile() {
	}

	public UserProfile(Role role) {
		this.role = role;
	}

	public UserProfile(Role role, String fullname, Date birthday, String avt, Date createdTime, Set<Comment> comments,
			User user, Set<Post> posts, GmailUser gmailUser) {
		this.role = role;
		this.fullname = fullname;
		this.birthday = birthday;
		this.avt = avt;
		this.createdTime = createdTime;
		this.comments = comments;
		this.user = user;
		this.posts = posts;
		this.gmailUser = gmailUser;
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
	@JoinColumn(name = "role_id", nullable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name = "fullname", length = 50)
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "birthday", length = 19)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "avt", length = 50)
	public String getAvt() {
		return this.avt;
	}

	public void setAvt(String avt) {
		this.avt = avt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_time", length = 19)
	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public Set<Post> getPosts() {
		return this.posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "userProfile")
	public GmailUser getGmailUser() {
		return this.gmailUser;
	}

	public void setGmailUser(GmailUser gmailUser) {
		this.gmailUser = gmailUser;
	}

}