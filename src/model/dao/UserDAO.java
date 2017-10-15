package model.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import library.ConnectMySQLLibrary;
import model.bean.User;
import constant.define;

public class UserDAO {
	private ConnectMySQLLibrary connectMySQLLibrary;
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	
	public UserDAO() {
		  connectMySQLLibrary = new ConnectMySQLLibrary();
	}
	
	public ArrayList<User> getItems(){
		ArrayList<User> listUser = new ArrayList<>();
		conn = connectMySQLLibrary.getConnectMySQL();
		
		String sql = "select * FROM users ORDER BY id_User DESC";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()){
			   User objUser = new User(
					   rs.getInt("id_User"),
					   rs.getString("ten_User"),
					   rs.getString("chuc_danh_khoa_hoc"), 
					   rs.getString("dia_chi_co_quan"), 
					   rs.getString("dien_thoai_co_quan"), 
					   rs.getString("hoc_vi"),  
					   rs.getString("nam_sinh"), 
					   rs.getString("dia_chi_nha_rieng"),  
					   rs.getString("dien_thoai_nha_rieng"), 
					   rs.getString("email"), 
					   rs.getString("fax"), 
					   rs.getString("ten_tai_khoan"), 
					   rs.getString("mat_khau"), 
					   rs.getInt("id_loai_tai_khoan"), 
					   rs.getInt("id_khoa")
					   );
               listUser.add(objUser);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listUser;
		
	}

	public int addItem(User objUser) {
		int result = 0;
		conn = connectMySQLLibrary.getConnectMySQL();
		
		String sql="insert into user ("
				+ "ten_User,"
				+ "chuc_danh_khoa_hoc,"
				+ "dia_chi_co_quan,"
				+ "dien_thoai_co_quan,"
				+ "hoc_vi,"
				+ "nam_sinh,"
				+ "dia_chi_nha_rieng,"
				+ "dien_thoai_nha_rieng,"
				+ "email,"
				+ "fax,"
				+ "ten_tai_khoan,"
				+ "mat_khau,"
				+ "id_loai_tai_khoan,"
				+ "id_khoa) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, objUser.getTenUser());
			pst.setString(2, objUser.getChucDanhKhoaHoc());
			pst.setString(3, objUser.getDiaChiCoQuan());
			pst.setString(4, objUser.getDienThoaiCoQuan());
			pst.setString(5, objUser.getHocVi());
			pst.setString(6, objUser.getNamSinh());
			pst.setString(7, objUser.getDiaChiNhaRieng());
			pst.setString(8, objUser.getDienThoaiNhaRieng());
			pst.setString(9, objUser.getEmail());
			pst.setString(9, objUser.getFax());
			pst.setString(10, objUser.getTaiKhoan());
			pst.setString(11, objUser.getMatKhau());
			pst.setInt(12, objUser.getIdLoaiTaiKhoan());
			pst.setInt(13, objUser.getIdKhoa());
			
			result = pst.executeUpdate();
			
	 
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public User getItem(int idUser) {
        conn = connectMySQLLibrary.getConnectMySQL();
        
        String sql = "select * from users where id_User = ?";
        User objUser = null;
        
        try {
			pst  =  conn.prepareStatement(sql);
			pst.setInt(1, idUser);
			rs  = pst.executeQuery();
			if(rs.next()){
				objUser = new User(
						   rs.getInt("id_User"),
						   rs.getString("ten_User"),
						   rs.getString("chuc_danh_khoa_hoc"), 
						   rs.getString("dia_chi_co_quan"), 
						   rs.getString("dien_thoai_co_quan"), 
						   rs.getString("hoc_vi"),  
						   rs.getString("nam_sinh"), 
						   rs.getString("dia_chi_nha_rieng"),  
						   rs.getString("dien_thoai_nha_rieng"), 
						   rs.getString("email"), 
						   rs.getString("fax"), 
						   rs.getString("ten_tai_khoan"), 
						   rs.getString("mat_khau"), 
						   rs.getInt("id_loai_tai_khoan"), 
						   rs.getInt("id_khoa")
						   );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return objUser;
	}

	public int editItem(User objUser) {
		 int result = 0;
         
         conn = connectMySQLLibrary.getConnectMySQL();

		String sql = "UPDATE user SET ten_User = ? , "
				+ "chuc_danh_khoa_hoc = ? , "
				+ "dia_chi_co_quan = ? , "
				+ "dien_thoai_co_quan = ? , "
				+ "hoc_vi = ? , "
				+ "nam_sinh = ? , "
				+ "dia_chi_nha_rieng = ? , "
				+ "dien_thoai_nha_rieng = ? , "
				+ "email = ? , fax = ? , "
				+ "ten_tai_khoan = ? , "
				+ "mat_khau = ? , "
				+ "id_loai_tai_khoan = ? , "
				+ "id_khoa = ? WHERE id_User = ?";
         
         try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, objUser.getTenUser());
			pst.setString(2, objUser.getChucDanhKhoaHoc());
			pst.setString(3, objUser.getDiaChiCoQuan());
			pst.setString(4, objUser.getDienThoaiCoQuan());
			pst.setString(5, objUser.getHocVi());
			pst.setString(6, objUser.getNamSinh());
			pst.setString(7, objUser.getDiaChiNhaRieng());
			pst.setString(8, objUser.getDienThoaiNhaRieng());
			pst.setString(9, objUser.getEmail());
			pst.setString(10, objUser.getTaiKhoan());
			pst.setString(11, objUser.getMatKhau());
			pst.setInt(12, objUser.getIdLoaiTaiKhoan());
			pst.setInt(4, objUser.getIdKhoa());
			pst.setInt(5, objUser.getIdUser());
			
			result = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		  return result;
	}

	public int delItem(int idUser) {
		int result = 0;
        conn = connectMySQLLibrary.getConnectMySQL();
        String sql = "delete from users where id_User = ? ";
        
        try {
			pst  = conn.prepareStatement(sql);
			pst.setInt(1, idUser);
			result = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pst.close();
				conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
		
		
	}

	public User checkUser(String username) {
	
         conn = connectMySQLLibrary.getConnectMySQL();
         
         String sql = "select * from users where username = ?";
         User objUser = null;
         try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			rs = pst.executeQuery();
			if(rs.next()){
				objUser = new User(
					   rs.getInt("id_User"),
					   rs.getString("ten_User"),
					   rs.getString("chuc_danh_khoa_hoc"), 
					   rs.getString("dia_chi_co_quan"), 
					   rs.getString("dien_thoai_co_quan"), 
					   rs.getString("hoc_vi"),  
					   rs.getString("nam_sinh"), 
					   rs.getString("dia_chi_nha_rieng"),  
					   rs.getString("dien_thoai_nha_rieng"), 
					   rs.getString("email"), 
					   rs.getString("fax"), 
					   rs.getString("ten_tai_khoan"), 
					   rs.getString("mat_khau"), 
					   rs.getInt("id_loai_tai_khoan"), 
					   rs.getInt("id_khoa")
					   );
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return objUser;
	}

	public User getUserLogin(User objUser) { //kiem tra tai khoan truoc khi dang nhap
        conn = connectMySQLLibrary.getConnectMySQL();
        
        String sql = "select * from users where username = ? and password = ?";
        
        User objUserResult = null;
        
        try {
			pst  =  conn.prepareStatement(sql);
			pst.setString(1, objUser.getTaiKhoan());
			pst.setString(2, objUser.getMatKhau());
			rs  = pst.executeQuery();
			
			if(rs.next()){
				objUserResult = new User(
						   rs.getInt("id"),
						   rs.getString("ten_User"),
						   rs.getString("chuc_danh_khoa_hoc"), 
						   rs.getString("dia_chi_co_quan"), 
						   rs.getString("dien_thoai_co_quan"), 
						   rs.getString("hoc_vi"),  
						   rs.getString("nam_sinh"), 
						   rs.getString("dia_chi_nha_rieng"),  
						   rs.getString("dien_thoai_nha_rieng"), 
						   rs.getString("email"), 
						   rs.getString("fax"), 
						   rs.getString("ten_tai_khoan"), 
						   rs.getString("mat_khau"), 
						   rs.getInt("id_loai_tai_khoan"), 
						   rs.getInt("id_khoa")
						   );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return objUserResult;
		
		
	}

	public int countUser() {
		int total = 0;
		conn = connectMySQLLibrary.getConnectMySQL();
		String sql = "select count(*) AS total from users ";
        try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()){
				total = rs.getInt("total");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			 try {
				rs.close();
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return total;

	}

	public ArrayList<User> getItemsByPage(int offset) {
		ArrayList<User> listUser = new ArrayList<>();
		conn = connectMySQLLibrary.getConnectMySQL();
		
		String sql = "select * FROM users ORDER BY id_User DESC LIMIT "+offset+","+define.ROW_COUNT;
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()){
			   User objUser = new User(
					   rs.getInt("id_User"),
					   rs.getString("ten_User"),
					   rs.getString("chuc_danh_khoa_hoc"), 
					   rs.getString("dia_chi_co_quan"), 
					   rs.getString("dien_thoai_co_quan"), 
					   rs.getString("hoc_vi"),  
					   rs.getString("nam_sinh"), 
					   rs.getString("dia_chi_nha_rieng"),  
					   rs.getString("dien_thoai_nha_rieng"), 
					   rs.getString("email"), 
					   rs.getString("fax"), 
					   rs.getString("ten_tai_khoan"), 
					   rs.getString("mat_khau"), 
					   rs.getInt("id_loai_tai_khoan"), 
					   rs.getInt("id_khoa")
					   );
               listUser.add(objUser);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listUser;

		
	}

	public User checkEmail(String email) {
         conn = connectMySQLLibrary.getConnectMySQL();
         
         String sql = "select * from users where email = ?";
         User objUser = null;
         try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			rs = pst.executeQuery();
			if(rs.next()){
			  objUser = new User(
					   rs.getInt("id_User"),
					   rs.getString("ten_User"),
					   rs.getString("chuc_danh_khoa_hoc"), 
					   rs.getString("dia_chi_co_quan"), 
					   rs.getString("dien_thoai_co_quan"), 
					   rs.getString("hoc_vi"),  
					   rs.getString("nam_sinh"), 
					   rs.getString("dia_chi_nha_rieng"),  
					   rs.getString("dien_thoai_nha_rieng"), 
					   rs.getString("email"), 
					   rs.getString("fax"), 
					   rs.getString("ten_tai_khoan"), 
					   rs.getString("mat_khau"), 
					   rs.getInt("id_loai_tai_khoan"), 
					   rs.getInt("id_khoa")
					   );
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return objUser;

		
	}

	public boolean checkEmail1(String email) {
		conn = connectMySQLLibrary.getConnectMySQL();
		
		String sql = "select * from users where email = "+email;
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				conn.close();
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return false;
	}
}
