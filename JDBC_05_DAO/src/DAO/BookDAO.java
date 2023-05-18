package DAO;

import java.util.ArrayList;

import model.Book;

public class BookDAO implements DAOInterface<Book>{
	
	public static BookDAO getInstance() {
		return new BookDAO();
	}
	@Override
	public int add(Book t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Book t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Book t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Book> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book selectByID(Book t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> selectByCondition(Book t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
