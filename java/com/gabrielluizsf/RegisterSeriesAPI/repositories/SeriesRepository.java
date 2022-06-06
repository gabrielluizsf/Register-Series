package com.gabrielluizsf.RegisterSeriesAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielluizsf.RegisterSeriesAPI.entities.Series;

public interface SeriesRepository extends JpaRepository<Series, Long> {

}
