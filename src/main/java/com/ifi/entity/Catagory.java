package com.ifi.entity;
// Generated Oct 1, 2018 4:26:22 PM by Hibernate Tools 5.2.11.Final

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

/**
 * Catagory generated by hbm2java
 */
@Entity
@Table(name = "catagory", catalog = "tryhardmore")
public class Catagory implements java.io.Serializable {

	private Integer id;
	private GroupsCatagory groupsCatagory;
	private String name;
	private Set<Post> posts = new HashSet<Post>(0);

	public Catagory() {
	}

	public Catagory(GroupsCatagory groupsCatagory, String name, Set<Post> posts) {
		this.groupsCatagory = groupsCatagory;
		this.name = name;
		this.posts = posts;
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
	@JoinColumn(name = "catagory_group_id")
	public GroupsCatagory getGroupsCatagory() {
		return this.groupsCatagory;
	}

	public void setGroupsCatagory(GroupsCatagory groupsCatagory) {
		this.groupsCatagory = groupsCatagory;
	}

	@Column(name = "name", length = 11)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catagory")
	public Set<Post> getPosts() {
		return this.posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

}
