package com.ifi.entity;
// Generated Oct 1, 2018 4:26:22 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PostTag generated by hbm2java
 */
@Entity
@Table(name = "post_tag", catalog = "tryhardmore")
public class PostTag implements java.io.Serializable {

	private PostTagId id;
	private Post post;
	private Tag tag;

	public PostTag() {
	}

	public PostTag(PostTagId id) {
		this.id = id;
	}

	public PostTag(PostTagId id, Post post, Tag tag) {
		this.id = id;
		this.post = post;
		this.tag = tag;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "tagId", column = @Column(name = "tag_id")),
			@AttributeOverride(name = "postId", column = @Column(name = "post_id")) })
	public PostTagId getId() {
		return this.id;
	}

	public void setId(PostTagId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_id", insertable = false, updatable = false)
	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tag_id", insertable = false, updatable = false)
	public Tag getTag() {
		return this.tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

}
