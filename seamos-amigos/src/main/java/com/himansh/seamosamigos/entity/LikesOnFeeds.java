package com.himansh.seamosamigos.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "likes_on_feeds")
public class LikesOnFeeds implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer likeId;
	private Integer feedId;
	private Integer userId;
	private Integer commentId;
	
	
	public Integer getLikeId() {
		return likeId;
	}
	public void setLikeId(Integer likeId) {
		this.likeId = likeId;
	}
	public Integer getFeedId() {
		return feedId;
	}
	public void setFeedId(Integer feedId) {
		this.feedId = feedId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCommentId() {
		return commentId;
	}
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}
	
}
