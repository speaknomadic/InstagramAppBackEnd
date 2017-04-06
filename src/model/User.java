package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class User {

	/**
	 * Id value is set after the response from the database after the first
	 * insert of user to the database.
	 */
	private long id = 0L;

	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String profilePicUrl;
	private String biography;
	private String externalUrl;
	private int followsCount;
	private int followedByCount;
	private int postCount;
	private HashSet<User> follows;
	private HashSet<User> followers;
	private ArrayList<Post> posts;
	private ArrayList<Post> likedUserList;

	public User(String userName, String firstName, String lastName, String email, String phone, String profilePicUrl,
			String biography, String externalUrl, int followsCount, int followedByCount, int postCount,
			HashSet<User> follows, HashSet<User> followers, ArrayList<Post> posts) {

		if (userName != null && !userName.isEmpty()) {
			this.userName = userName;
		}
		if (firstName != null && !firstName.isEmpty()) {
			this.firstName = firstName;
		}
		if (lastName != null && !lastName.isEmpty()) {
			this.lastName = lastName;
		}
		if (email != null && !email.isEmpty()) {
			this.email = email;
		}
		if (phone != null && !phone.isEmpty()) {
			this.phone = phone;
		}
		if (profilePicUrl != null && !profilePicUrl.isEmpty()) {
			this.profilePicUrl = profilePicUrl;
		}
		if (biography != null && !biography.isEmpty()) {
			this.biography = biography;
		}
		if (externalUrl != null && !externalUrl.isEmpty()) {
			this.externalUrl = externalUrl;
		}
		if (followsCount >= 0) {
			this.followsCount = followsCount;
		}
		if (followedByCount >= 0) {
			this.followedByCount = followedByCount;
		}
		if (postCount >= 0) {
			this.postCount = postCount;
		}
		this.follows = new HashSet<User>(follows);
		this.followers = new HashSet<User>(followers);
		this.posts = new ArrayList<Post>(posts);
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		if (username != null && !username.isEmpty()) {
			this.userName = username;
		}
	}

	public int getFollowsCount() {
		return followsCount;
	}

	public void setFollowsCount(int followsCount) {
		if (followsCount >= 0) {
			this.followsCount = followsCount;
		}
	}

	public int getFollowedByCount() {
		return followedByCount;
	}

	public void setFollowedByCount(int followedByCount) {
		if (followedByCount >= 0) {
			this.followedByCount = followedByCount;
		}
	}

	public String getProfilePicUrl() {
		return profilePicUrl;
	}

	public void setProfilePicUrl(String profilePicUrl) {
		if (profilePicUrl != null && !profilePicUrl.isEmpty()) {
			this.profilePicUrl = profilePicUrl;
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if (id >= 0) {
			this.id = id;
		}
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		if (biography != null && !biography.isEmpty()) {
			this.biography = biography;
		}
	}

	public String getFullName() {
		return firstName;
	}

	public void setFullName(String fullName) {
		if (fullName != null && !fullName.isEmpty()) {
			this.firstName = fullName;
		}
	}

	public int getMediaCount() {
		return postCount;
	}

	public void setMediaCount(int mediaCount) {
		if (mediaCount >= 0) {
			this.postCount = mediaCount;
		}
	}

	public String getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		if (externalUrl != null && externalUrl.isEmpty()) {
			this.externalUrl = externalUrl;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null && !email.isEmpty()) {
			this.email = email;
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (phone != null && !phone.isEmpty()) {
			this.phone = phone;
		}
	}

	// public boolean like(Post post) {
	// // TODO
	// // get id of owner
	// //
	//
	// return false;
	// }
	//
	// public boolean unlike(Post post) {
	// // TODO
	// return false;
	// }
	//
	//
	// public boolean follow(User user) {
	// // TODO
	// follows.add(user);
	// return false;
	// }
	//
	// public boolean unfollow(User user) {
	// // TODO
	// follows.remove(user);
	// return false;
	// }
	//
	// public void setPhoto(String url) {
	// // TODO
	// }
	//
	// public boolean approveRequest(User user) {
	// // TODO
	// return followers.add(user);
	// }
	//
	// public boolean denyRequest(User user) {
	// // TODO
	// return followers.add(user);
	// }
	//
	// public boolean removeFollower(User user) {
	// // TODO
	// return followers.remove(user);
	// }
	//
	// public List<User> getUserFollowsList(String userId) {
	// return null;
	// }
	//
	// public List<User> getUserFollowedByList(String userId) {
	// // TODO
	// return null;
	// }
	//
	// public List<User> getUserRequestedByList() {
	// // TODO
	// return null;
	// }
	//
	// public User getUserBasicInfo(String userId) {
	// // TODO
	// return null;
	// }
	//
	// public List<Post> getPersonalFeed() {
	// // TODO
	// return null;
	// }
	//
	// public List<Post> getLikedPosts() {
	// // TODO
	// return null;
	// }
	//
	// public Post getMostRecentPost(String userId) {
	// // TODO
	// return null;
	// }
	//
	// public List<User> searchUsersByName(String name) {
	// // TODO
	// return null;
	// }

	// public boolean isFollower(User user){
	//
	// }

	// public void addCommentOnPost(Long postId, String comment) {
	// // TODO
	// }
	//
	// public void deleteCommentOnPost(Long postId, Long commentId) {
	// // TODO
	// }
}
