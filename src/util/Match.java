package util;

import java.util.List;

public class Match {

	private String event, site, date,
				whitePlayer, blackPlayer, result,
				annotator, plyCount, timeControl,
				time, termination, mode, fen;
	
	private String moves;
	
	public Match() {
		
	}

	public String getEvent() {
		return event;
	}

	public String getSite() {
		return site;
	}

	public String getDate() {
		return date;
	}

	public String getWhitePlayer() {
		return whitePlayer;
	}

	public String getBlackPlayer() {
		return blackPlayer;
	}

	public String getResult() {
		return result;
	}

	public String getAnnotator() {
		return annotator;
	}

	public String getPlyCount() {
		return plyCount;
	}

	public String getTimeControl() {
		return timeControl;
	}

	public String getTime() {
		return time;
	}

	public String getTermination() {
		return termination;
	}

	public String getMode() {
		return mode;
	}

	public String getFen() {
		return fen;
	}
	
	public String getMoves() {
		return moves;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setWhitePlayer(String whitePlayer) {
		this.whitePlayer = whitePlayer;
	}

	public void setBlackPlayer(String blackPlayer) {
		this.blackPlayer = blackPlayer;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setAnnotator(String annotator) {
		this.annotator = annotator;
	}

	public void setPlyCount(String plyCount) {
		this.plyCount = plyCount;
	}

	public void setTimeControl(String timeControl) {
		this.timeControl = timeControl;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setTermination(String termination) {
		this.termination = termination;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public void setFen(String fen) {
		this.fen = fen;
	}
	
	public void setMoves(String moves) {
		this.moves = moves;
	}

}
