package com.nortal.lazar.realestate.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.nortal.lazar.agency.entity.AgencyEntity;
import com.nortal.lazar.realestate.entity.RealEstateEntity;

public class RealEstateRepositoryImpl implements RealEstateRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(RealEstateEntity realEstateEntity) {
		em.persist(realEstateEntity);
		em.flush();
	}

	@Override
	public RealEstateEntity getRealEstate(int ID) {
		Query query = em.createQuery("select realEstate from RealEstateEntity as realEstate where id=:id");
		query.setParameter("id", ID);
		List<RealEstateEntity> resultList = query.getResultList();
		try {
			return resultList.get(0);
		} catch (IndexOutOfBoundsException exception) {
			return null;
		}
	}

	@Override
	public List<RealEstateEntity> getRealEstates(int agencyID, int userID, double price, double area, String structure, String city, String street, int number, int floor,
			String heating, boolean balcony, String type, boolean booked, String status, String mode, String description, String rooms) {
		StringBuffer buf = new StringBuffer();
		buf.append("SELECT real_estate ");
		buf.append("from RealEstateEntity as real_estate ");
		buf.append("WHERE (agency_id=:agency_id or :agency_id is null) ");
		buf.append("and (user_id=:user_id or :user_id is null) ");
		buf.append("and (price=:price or :price is null) ");
		buf.append("and (area=:area or :area is null) ");
		buf.append("and (structure=:structure or :structure is null) ");
		buf.append("and (city=:city or :city is null) ");
		buf.append("and (street=:street or :street is null) ");
		buf.append("and (number=:number or :number is null) ");
		buf.append("and (floor=:floor or :floor is null) ");
		buf.append("and (heating=:heating or :heating is null) ");
		buf.append("and (balcony=:balcony or :balcony is null) ");
		buf.append("and (type=:type or :type is null) ");
		buf.append("and (booked=:booked or :booked is null) ");
		buf.append("and (status=:status or :status is null) ");
		buf.append("and (mode=:mode or :mode is null) ");
		buf.append("and (description=:description or :description is null) ");
		buf.append("and (rooms=:rooms or :rooms is null) ");
		buf.append("and (conclusion=:conlusion or :conclusion is null) ");
		String queryText = buf.toString();
		Query query = em.createQuery(queryText);
		query.setParameter("agency_id", agencyID);
		query.setParameter("user_id", userID);
		query.setParameter("price", price);
		query.setParameter("area", area);
		query.setParameter("structure", structure);
		query.setParameter("city", city);
		query.setParameter("user_id", userID);
		query.setParameter("street", street);
		query.setParameter("number", number);
		query.setParameter("floor", floor);
		query.setParameter("heating", heating);
		query.setParameter("balcony", balcony);
		query.setParameter("type", type);
		query.setParameter("booked", booked);
		query.setParameter("status", status);
		query.setParameter("mode", mode);
		query.setParameter("description", description);
		query.setParameter("rooms", rooms);
		return (List<RealEstateEntity>) query.getResultList();
	}

}
