package com.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Match;
import com.services.MatchService;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {
   private MatchService matchService;

   public MatchController(MatchService matchService)
   {
      this.matchService = matchService;
   }

   @GetMapping("/live")
   public ResponseEntity<List<Match>> getLiveMatches()
   {
      return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
   }

   @GetMapping("/point-table")
   public ResponseEntity<?> PointTable()
   {
      return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
   }

   @GetMapping
   public ResponseEntity<List<Match>> getAllMatches()
   {
      return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
   }
}
