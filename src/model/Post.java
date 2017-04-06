package model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Post {

	public enum Type {
		VIDEO, IMAGE;
	}

	/**
	 * Id value is set after the response from the database after the first
	 * insert of the post to database.
	 */
	private long id = 0L;

	private LocalDate date;
	private Type type;
	private String imageUrl;
	private String caption;
	private String videoUrl;
	private int commentsCount;
	private ArrayList<Comment> commentsList;
	private int likesCount;
	private int videoViews;

	public Post(LocalDate date, Type type, String imageUrl, String caption, String videoUrl, int commentsCount,
			int likesCount, int videoViews, ArrayList<Comment> commentsList) {
		if (date != null) {
			this.date = date;
		}
		if (type != null) {
			this.type = type;
		}
		if (imageUrl != null) {
			this.imageUrl = imageUrl;
		}
		if (caption != null && !caption.isEmpty()) {
			this.caption = caption;
		}
		if (videoUrl != null && !videoUrl.isEmpty()) {
			this.videoUrl = videoUrl;
		}
		if (commentsCount >= 0) {
			this.commentsCount = commentsCount;
		}
		this.commentsList = new ArrayList<Comment>();
		if (likesCount >= 0) {
			this.likesCount = likesCount;
		}
		if (videoViews >= 0) {
			this.videoViews = videoViews;
		}
		if (commentsList != null) {
			this.commentsList = new ArrayList<Comment>(commentsList);
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		if (id > 0) {
			this.id = id;
		}
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		if (date != null) {
			this.date = date;
		}
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		if (type != null) {
			this.type = type;
		}
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		if (imageUrl != null && !imageUrl.isEmpty()) {
			this.imageUrl = imageUrl;
		}
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		if (caption != null && !caption.isEmpty()) {
			this.caption = caption;
		}
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		if (videoUrl != null && !videoUrl.isEmpty()) {
			this.videoUrl = videoUrl;
		}
	}

	public int getCommentsCount() {
		return commentsCount;
	}

	public void setCommentsCount(int commentsCount) {
		if (commentsCount >= 0) {
			this.commentsCount = commentsCount;
		}
	}

	public ArrayList<Comment> getPreviewCommentsList() {
		ArrayList<Comment> result = (ArrayList<Comment>) Collections.unmodifiableCollection(commentsList);
		return result;
	}

	public int getLikesCount() {
		return likesCount;
	}

	public void setLikesCount(int likesCount) {
		if (likesCount >= 0) {
			this.likesCount = likesCount;
		}
	}

	public int getVideoViews() {
		return videoViews;
	}

	public void setVideoViews(int videoViews) {
		if (videoViews >= 0) {
			this.videoViews = videoViews;
		}
	}

	public Post getPostInfo(long postId) {
		if ((postId > 0) && (postId == this.getId())) {
			return this;
		}
		return null;
	}

	public void add(Comment comment) {
		if (comment != null) {
			commentsList.add(comment);
		}
	}

	public ArrayList<Comment> getCommentsOnPost(long postIdL) {
		ArrayList<Comment> result = (ArrayList<Comment>) Collections.unmodifiableCollection(commentsList);
		return result;
	}

	public TreeSet<Comment> getCommentsSortedByDate(long postIdL) {
		// TODO
		return null;

	}
}
