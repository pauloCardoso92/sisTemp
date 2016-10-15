package br.com.sisTemp.vo;

import br.com.sisTemp.vo.contrato.AbstractVO;

/**
 * 
 * Classe VO para Acesso a aplicação <br>
 * Criada em 12/10/2016 01:06:14 
 *
 * @author Paulo Cardoso <paulo2118@gmail.com>
 * @version 0.0.1-SNAPSHOT
 */
public class AcessoVO extends AbstractVO {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	//http://www.semeru.com.br/blog/fazendo-parser-de-objetos-com-o-dozer/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AcessoVO other = (AcessoVO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
