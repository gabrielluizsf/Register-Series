package com.gabrielluizsf.RegisterSeriesAPI.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_series")
public class Series {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private Long seasons;
private String episodes;




public Series() {
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Long getSeasons() {
	return seasons;
}

public void setSeasons(Long seasons) {
	this.seasons = seasons;
}

public String getEpisodes() {
	return episodes;
}

public void setEpisodes(String episodes) {
	this.episodes = episodes;
}

}
