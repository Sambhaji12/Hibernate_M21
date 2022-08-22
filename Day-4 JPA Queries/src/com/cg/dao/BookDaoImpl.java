package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entities.Book;


public class BookDaoImpl implements BookDao{

	private EntityManager em;
	public BookDaoImpl() {
		em=JPAUtil.getEntityManager();
		
		
	}

	@Override
	public Book getBookById(int id) {
		Book book =em.find(Book.class, id);
		return book;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		String qStr="SELECT book FROM Book book  WHERE  book.title =:ptitle ";
		TypedQuery<Book> query =em.createQuery(qStr ,Book.class);
		query.setParameter("ptitle","%" +title+ "%");
		return query.getResultList();
	}

	@Override
	public List<Book> getBookByAuthor(String Author) {
		String qStr="SELECT book FROM Book book   WHERE  book.author =:pAuthor ";
		TypedQuery<Book> query =em.createQuery(qStr ,Book.class);
		query.setParameter("pAuthor", Author );
		List<Book> booklist=query.getResultList();
		return booklist;
	}

	@Override
	public List<Book> getBookByPriceRange(double low, double high) {
		String qStr="SELECT book FROM Book book  WHERE  book.price Between :low and :high ";
		TypedQuery<Book> query =em.createQuery(qStr ,Book.class);
		query.setParameter("plow", low );
		query.setParameter("phigh", high );
		List<Book> booklist=query.getResultList();
		return booklist;
	}

	

	@Override
	public Long getBookCount() {
		String qStr="SELECT COUNT(book.id)FROM Book  book ";
		TypedQuery<Long> query =em.createQuery(qStr ,Long.class);
		Long count =query.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getAllBooks()
	{
		Query query=em.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List <Book> booklist=query.getResultList();
		return booklist;
	}

}
