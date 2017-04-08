package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class User implements Serializable {

	/**
	 * Id value is set after the response from the database after the first
	 * insert of user to the database.
	 */
	private long id = 0L;

	private String userName = "";
	private String firstName = "";
	private String lastName = "";
	private String password = "";
	private String email = "";
	private String phone = "";
	private String profilePicUrl = "";
	private String biography = "";
	private String externalUrl = "";
	private int followsCount = 0;
	private int followedByCount = 0;
	private int postCount = 0;
	private HashSet<User> follows = null;
	private HashSet<User> followers = null;
	private ArrayList<Post> posts = null;
	private ArrayList<Post> likedUserList = null;

	public User(String userName, String firstName, String lastName, String password, String email, String phone,
			String profilePicUrl, String biography, String externalUrl, int followsCount, int followedByCount,
			int postCount, HashSet<User> follows, HashSet<User> followers, ArrayList<Post> posts,
			ArrayList<Post> likedUserList) {
		if (userName != null && !userName.isEmpty()) {
			this.userName = userName;
		}
		if (firstName != null && !firstName.isEmpty()) {
			this.firstName = firstName;
		}
		if (lastName != null && !lastName.isEmpty()) {
			this.lastName = lastName;
		}
		if (password != null && !password.isEmpty()) {
			this.password = password;
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
		this.likedUserList = new ArrayList<Post>(likedUserList);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (userName != null && !userName.isEmpty()) {
			this.userName = userName;
		}
	}

	public String getFirstName() {
		return userName;
	}

	public void setFirstName(String username) {
		if (username != null && !username.isEmpty()) {
			this.userName = username;
		}
	}

	public String getLastName() {
		return userName;
	}

	public void setLastName(String username) {
		if (username != null && !username.isEmpty()) {
			this.userName = username;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password != null && !password.isEmpty()) {
			this.password = password;
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

	public String getProfilePicUrl() {
		return profilePicUrl;
	}

	public void setProfilePicUrl(String profilePicUrl) {
		if (profilePicUrl != null && !profilePicUrl.isEmpty()) {
			this.profilePicUrl = profilePicUrl;
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

	public String getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		if (externalUrl != null && externalUrl.isEmpty()) {
			this.externalUrl = externalUrl;
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

	public void setId(long id) {
		if (id >= 0) {
			this.id = id;
		}
	}

	public int getPostCount() {
		return postCount;
	}

	public void setPostCount(int mediaCount) {
		if (mediaCount >= 0) {
			this.postCount = mediaCount;
		}
	}

	public HashSet<User> getFollows() {
		return (HashSet<User>) Collections.unmodifiableSet(follows);
	}

	public HashSet<User> getFollowers() {
		return (HashSet<User>) Collections.unmodifiableSet(followers);
	}

	public ArrayList<Post> getPosts() {
		return (ArrayList<Post>) Collections.unmodifiableList(posts);
	}

	public ArrayList<Post> getlikedUserList() {
		return (ArrayList<Post>) Collections.unmodifiableList(likedUserList);
	}

	/**
	 * @inheritdoc
	 * @param o
	 * @return
	 */
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		User user = (User) o;

		if (id != user.id)
			return false;
		if (getFollowsCount() != user.getFollowsCount())
			return false;
		if (getFollowedByCount() != user.getFollowedByCount())
			return false;
		if (getPostCount() != user.getPostCount())
			return false;
		if (!getUserName().equals(user.getUserName()))
			return false;
		if (!getFirstName().equals(user.getFirstName()))
			return false;
		if (!getLastName().equals(user.getLastName()))
			return false;
		if (!getPassword().equals(user.getPassword()))
			return false;
		if (!getEmail().equals(user.getEmail()))
			return false;
		if (!getPhone().equals(user.getPhone()))
			return false;
		if (!getProfilePicUrl().equals(user.getProfilePicUrl()))
			return false;
		if (!getBiography().equals(user.getBiography()))
			return false;
		if (!getExternalUrl().equals(user.getExternalUrl()))
			return false;
		if (!getFollows().equals(user.getFollows()))
			return false;
		if (!getFollowers().equals(user.getFollowers()))
			return false;
		if (!getPosts().equals(user.getPosts()))
			return false;
		return likedUserList.equals(user.likedUserList);

	}

	/**
	 * @inheritdoc
	 * @return
	 */
	public int hashCode() {
		int result = (int) (id ^ (id >>> 32));
		result = 31 * result + getUserName().hashCode();
		result = 31 * result + getFirstName().hashCode();
		result = 31 * result + getLastName().hashCode();
		result = 31 * result + getPassword().hashCode();
		result = 31 * result + getEmail().hashCode();
		result = 31 * result + getPhone().hashCode();
		result = 31 * result + getProfilePicUrl().hashCode();
		result = 31 * result + getBiography().hashCode();
		result = 31 * result + getExternalUrl().hashCode();
		result = 31 * result + getFollowsCount();
		result = 31 * result + getFollowedByCount();
		result = 31 * result + getPostCount();
		result = 31 * result + getFollows().hashCode();
		result = 31 * result + getFollowers().hashCode();
		result = 31 * result + getPosts().hashCode();
		result = 31 * result + likedUserList.hashCode();
		return result;
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
