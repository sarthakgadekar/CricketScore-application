package com.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer> {
   Optional<Match> findByTeamHeading(String teamHeading);
}

/*
 * In interface which extends JPARepository, why do we made the return type as
 * Optional<User>? why not only User?
 * 
 * Here's why Optional<Match> is preferred over Match
 * :
 * 
 * Avoiding NullPointerExceptions: If the queried entity is not found in the
 * database, returning null could lead to NullPointerExceptions if the calling
 * code doesn't handle the case properly. By using Optional<User>, you enforce a
 * clear contract that the result might be absent, prompting the caller to
 * handle this possibility explicitly. 
 * 
 * Expressing the Possibility of Absence:
 * Using Optional<Match> clearly communicates to the caller that the result might
 * be empty, making the code more self-explanatory and reducing ambiguity about
 * the return value.
 * 
 * 
 * 
 * 
 * 
 * 
 */