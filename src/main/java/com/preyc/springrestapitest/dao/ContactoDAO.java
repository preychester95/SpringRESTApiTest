/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.preyc.springrestapitest.dao;

import com.preyc.springrestapitest.ent.Contacto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author prc
 */

@Service
@Transactional(readOnly = true)
public class ContactoDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Contacto> getAllContactos() {
        List<Contacto> contactosList = new ArrayList<Contacto>();
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Contacto> cq = cb.createQuery(Contacto.class);
        Root<Contacto> root = cq.from(Contacto.class);
        cq.select(root);
        Query<Contacto> query = session.createQuery(cq);
        contactosList = query.getResultList();
        return contactosList;
    }
}
