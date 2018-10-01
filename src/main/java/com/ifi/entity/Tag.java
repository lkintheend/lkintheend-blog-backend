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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tag generated by hbm2java
 */
@Entity
@Table(name = "tag", catalog = "tryhardmore")
public class Tag implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<PostTag> postTags = new HashSet<PostTag>(0);

	public Tag() {
	}

	public Tag(String name, Set<PostTag> postTags) {
		this.name = name;
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

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tag")
	public Set<PostTag> getPostTags() {
		return this.postTags;
	}

	public void setPostTags(Set<PostTag> postTags) {
		this.postTags = postTags;
	}

}