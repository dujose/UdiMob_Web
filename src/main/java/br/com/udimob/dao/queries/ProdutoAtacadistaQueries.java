package br.com.udimob.dao.queries;

public class ProdutoAtacadistaQueries {

	public static final String FIND_PRODUTOS = 
			"select pa.* " + 
			"from produtos_atacadistas pa inner join produtos p on pa.id_produto = p.id_produto " +
			"where p.descricao_produto like concat('%',?1,'%'); ";
	
	public static final String FIND_PRODUTOS_MENOR_PRECO = 
			"select * " +
			"from produtos_atacadistas " +
			"where id_produto = ?1 " +
			"order by preco limit 5; ";
}
