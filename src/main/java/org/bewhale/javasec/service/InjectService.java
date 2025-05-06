package org.bewhale.javasec.service;

import org.bewhale.javasec.model.Admin;

import java.util.ArrayList;

public interface InjectService {

    ArrayList<Admin> where_string(String name);
    ArrayList<Admin> where_int(String id);

    ArrayList<Admin> orderBy(String field);

    Admin likeSearch(String username);

//    ArrayList<Admin> in(List<String> ids);
    ArrayList<Admin> in(String ids);
}
