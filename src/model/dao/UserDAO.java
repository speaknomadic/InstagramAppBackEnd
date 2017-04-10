package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

import model.User;
import model.db.DBManager;

public class UserDAO {

	private UserDAO(){

	}




	public static synchronized User addUser( User u) throws SQLException {

		String userName = u.getUserName();
		String pass = u.getPassword();
		String phone = u.getPhone();
		String email= u.getEmail();
		String firstName= u.getFirstName();
		String lastName= u.getLastName();

		String checkUserkSql ="select username,password,email from users where username = ? and password = ?";
		PreparedStatement chek= DBManager.getInstance().getConnection().prepareStatement(checkUserkSql);
		chek.setString(1, userName);
		chek.setString(2, pass);
		chek.execute();

		if(!chek.getResultSet().next()){

			String sql= "insert into users (username,password,phone,email,first_name, lastName ) values(?,?,?,?,?,?)";

			PreparedStatement ps= DBManager.getInstance().getConnection().prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, pass);
			ps.setString(3,phone);
			ps.setString(4, email);
			ps.setString(5, firstName);
			ps.setString(6,lastName);
			ps.execute();
			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			long id = rs.getLong(1);

			u.setId(id);

			return u;
		}
		else{

			return null;
		}

	}
	
	//................................................................................................

	public static synchronized User loginUser(String username, String password) throws SQLException{
		if(!username.isEmpty()&&!password.isEmpty()){
			
			String checkUserkSql ="select user_id, username,password,phone,email,first_name, lastName  from users where username = '"+username+"' and password = '"+password+"'";
			PreparedStatement check= DBManager.getInstance().getConnection().prepareStatement(checkUserkSql);
			check.execute();
			ResultSet set= check.getResultSet();
			if(check.getResultSet().next()){

				User user = new User(set.getString("username"), set.getString("first_name"), 
						set.getString("lastName"), set.getString("password"), set.getString("email"), 
						set.getString("phone"),
						"profilePicUrl", "biography", "externalUrl", 0, 0, 
						0, new HashSet<>(), new HashSet<>(), new ArrayList<>(), new ArrayList<>());
				user.setId(set.getLong("user_id"));
				return user;

			}
			else{
				return null;
			}

		}
		else{
			return null;
		}


	}
	
	//................................................................................................
	
	public static synchronized boolean checkUsername(String username) throws SQLException{
		
		if(!username.isEmpty()){
			String checkUserkSql ="select username from users where username = ?";
			PreparedStatement chek= DBManager.getInstance().getConnection().prepareStatement(checkUserkSql);
			chek.setString(1, username);
			chek.execute();
			if(chek.getResultSet().next()){
				return true;
			}
			
		}
		return false;
		
	}

}
