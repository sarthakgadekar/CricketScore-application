package com.services;

import java.util.List;

import com.entities.Match;


public interface MatchService {
	//get all matches
	List<Match> getAllMatches();
	
	//get live matches
	List<Match> getLiveMatches();
	
	//get cw2024 matches
	List<List<String>> getPointTable();
}
