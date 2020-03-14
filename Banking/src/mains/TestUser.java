package mains;

import java.sql.SQLException;
import java.util.Scanner;

import dao.UsersDao;
import dto.Users;

public class TestUser {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		UsersDao usersdao = new UsersDao("jdbc:mysql://localhost:3306/assignments","root","root");
		DisplayMenu display = new DisplayMenu();
		display.showMenuOptions();
	}

}
