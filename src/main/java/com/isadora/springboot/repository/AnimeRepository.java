package com.isadora.springboot.repository;

import java.util.List;

import com.isadora.springboot.domain.Anime;

public interface AnimeRepository {
	List<Anime> listAll();

}
