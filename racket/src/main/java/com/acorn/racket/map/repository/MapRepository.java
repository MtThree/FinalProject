package com.acorn.racket.map.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acorn.racket.map.domain.MapDTO;

@Component
public class MapRepository implements MapRepositoryI {
    
    @Autowired
    private SqlSession session;
    
    private static final String NAMESPACE = "test.MainMapper.";

    public List<MapDTO> getUniqueFacilities() {
        return session.selectList(NAMESPACE + "getUniqueFacilities");
    }
    
    public List<MapDTO> getRecommendedPosts() {
        return session.selectList(NAMESPACE + "getRecommendedPosts");
    }
    
    public List<MapDTO> getMarker() {
    	return session.selectList(NAMESPACE + "getMarker");
    }
    
    public MapDTO getFacilityById(String id) {
        return session.selectOne(NAMESPACE + "getFacilityById", id);
    }
}
