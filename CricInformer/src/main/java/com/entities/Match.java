package com.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cric_matches")
public class Match {
	@Id
	@GeneratedValue
	private int match_id;

	@Column
	private String teamHeading;
	@Column
	private String matchNumberVenue;
	@Column
	private String battingTeam;
	@Column
	private String battingTeamScore;
	@Column
	private String bowlTeam;
	@Column
	private String bowlTeamScore;
	@Column
	private String liveText;
	@Column
	private String matchLink;
	@Column
	private String textComplete;
	@Enumerated
	private MatchStatus match_status;
	@Column
	private Date match_date = new Date();

	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Match(int match_id, String teamHeading, String matchNumberVenue, String battingTeam, String battingTeamScore,
			String bowlTeam, String bowlTeamScore, String liveText, String matchLink, String textComplete,
			MatchStatus status, Date date) {
		super();
		this.match_id = match_id;
		this.teamHeading = teamHeading;
		this.matchNumberVenue = matchNumberVenue;
		this.battingTeam = battingTeam;
		this.battingTeamScore = battingTeamScore;
		this.bowlTeam = bowlTeam;
		this.bowlTeamScore = bowlTeamScore;
		this.liveText = liveText;
		this.matchLink = matchLink;
		this.textComplete = textComplete;
		this.match_status = status;
		this.match_date = date;
	}

	// set status of matchStatus according to textComplete
	public void setMatchStatus() {
		if (textComplete.isBlank()) {
			this.match_status = MatchStatus.Live;
		} else {
			this.match_status = MatchStatus.Completed;
		}
	}

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public String getTeamHeading() {
		return teamHeading;
	}

	public void setTeamHeading(String teamHeading) {
		this.teamHeading = teamHeading;
	}

	public String getMatchNumberVenue() {
		return matchNumberVenue;
	}

	public void setMatchNumberVenue(String matchNumberVenue) {
		this.matchNumberVenue = matchNumberVenue;
	}

	public String getBattingTeam() {
		return battingTeam;
	}

	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}

	public String getBattingTeamScore() {
		return battingTeamScore;
	}

	public void setBattingTeamScore(String battingTeamScore) {
		this.battingTeamScore = battingTeamScore;
	}

	public String getBowlTeam() {
		return bowlTeam;
	}

	public void setBowlTeam(String bowlTeam) {
		this.bowlTeam = bowlTeam;
	}

	public String getBowlTeamScore() {
		return bowlTeamScore;
	}

	public void setBowlTeamScore(String bowlTeamScore) {
		this.bowlTeamScore = bowlTeamScore;
	}

	public String getLiveText() {
		return liveText;
	}

	public void setLiveText(String liveText) {
		this.liveText = liveText;
	}

	public String getMatchLink() {
		return matchLink;
	}

	public void setMatchLink(String matchLink) {
		this.matchLink = matchLink;
	}

	public String getTextComplete() {
		return textComplete;
	}

	public void setTextComplete(String textComplete) {
		this.textComplete = textComplete;
	}

	/*
	 * public MatchStatus getStatus() { return status; }
	 * 
	 * public void setStatus(MatchStatus status) { this.status = status; }
	 */

	public Date getDate() {
		return match_date;
	}

	public void setDate(Date date) {
		this.match_date = date;
	}

	@Override
	public String toString() {
		return "Match [match_id=" + match_id + ", teamHeading=" + teamHeading + ", matchNumberVenue=" + matchNumberVenue
				+ ", battingTeam=" + battingTeam + ", battingTeamScore=" + battingTeamScore + ", bowlTeam=" + bowlTeam
				+ ", bowlTeamScore=" + bowlTeamScore + ", liveText=" + liveText + ", matchLink=" + matchLink
				+ ", textComplete=" + textComplete + ", status=" + match_status + ", date=" + match_date + "]";
	}

}
