package com.one.springpj.service;

import java.util.List;

import com.one.springpj.constant.JoinStatus;
import com.one.springpj.model.Joiner;

public interface JoinerService {
	public void insert(Joiner joiner);
	public List<Joiner> findJoinUserList(Long id, JoinStatus joinStatus);
}
