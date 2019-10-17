package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hotelSunshine.models.Quarto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class QuartoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	

	public void create(Quarto quarto) {
		
		manager.persist(quarto);
	}
}
