package cn.springcloud.book.hystrix.service;

import java.util.concurrent.Future;

import cn.springcloud.book.provider.model.Animal;

public interface ICollapsingService {
	public Future<Animal> collapsing(Integer id);
	public Animal collapsingSyn(Integer id);
	public Future<Animal> collapsingGlobal(Integer id);
	
}
