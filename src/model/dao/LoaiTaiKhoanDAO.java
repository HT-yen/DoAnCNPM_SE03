package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import library.ConnectMySQLLibrary;
import model.bean.LoaiTaiKhoan;

public class LoaiTaiKhoanDAO {
	private ConnectMySQLLibrary connectMySQLLibrary;
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;
	
	public LoaiTaiKhoanDAO() {
		  connectMySQLLibrary = new ConnectMySQLLibrary();
	}
	
	public ArrayList<LoaiTaiKhoan> getItems(){
		ArrayList<LoaiTaiKhoan> listLoaiTaiKhoan = new ArrayList<>();
		conn = connectMySQLLibrary.getConnectMySQL();
		
		String sql = "select * FROM loai_tai_khoan ORDER BY id_LoaiTaiKhoan DESC";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()){
			   LoaiTaiKhoan objLoaiTaiKhoan = new LoaiTaiKhoan(
					   rs.getInt("id_LoaiTaiKhoan"),
					   rs.getString("ten_LoaiTaiKhoan")
					   );
               listLoaiTaiKhoan.add(objLoaiTaiKhoan);
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
		return listLoaiTaiKhoan;
		
	}

	public LoaiTaiKhoan getItem(int id) {
        conn = connectMySQLLibrary.getConnectMySQL();
        
        String sql = "select * from loai_tai_khoan where id_LoaiTaiKhoan = ?";
        LoaiTaiKhoan objLoaiTaiKhoan = null;
        
        try {
			pst  =  conn.prepareStatement(sql);
			pst.setInt(1, id);
			rs  = pst.executeQuery();
			if(rs.next()){
				objLoaiTaiKhoan = new LoaiTaiKhoan(
						   rs.getInt("id_LoaiTaiKhoan"),
						   rs.getString("ten_LoaiTaiKhoan")
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
        return objLoaiTaiKhoan;
	}
}
