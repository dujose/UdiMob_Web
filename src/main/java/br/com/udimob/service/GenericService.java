package br.com.udimob.service;

import java.util.List;

import br.com.udimob.dto.Imovel;
import br.com.udimob.exceptions.UdimobGenericException;

/**
 * Interface da camada de serviço comum a todas as entidades
 */
public interface GenericService<T> {

	T save(T entity) throws UdimobGenericException;

	List<T> save(Iterable<T> entities) throws UdimobGenericException;

	T findOne(Integer id) throws UdimobGenericException;

	boolean exists(Integer id) throws UdimobGenericException;

	List<T> findAll() throws UdimobGenericException;

	List<T> findAll(Iterable<Integer> ids) throws UdimobGenericException;

	long count() throws UdimobGenericException;

	void delete(Integer id) throws UdimobGenericException;

	void delete(T entity) throws UdimobGenericException;

	void delete(Iterable<? extends T> entities) throws UdimobGenericException;

	void deleteAll() throws UdimobGenericException;

}
