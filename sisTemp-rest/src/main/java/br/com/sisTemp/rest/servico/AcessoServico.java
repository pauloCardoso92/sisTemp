package br.com.sisTemp.rest.servico;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.sisTemp.vo.AcessoVO;

/**
 * 
 * Classe de serviço para controle de acesso <br>
 * Criada em 12/10/2016 00:51:59
 *
 * @author Paulo Cardoso <paulo2118@gmail.com>
 * @since 0.0.1
 * @version 0.0.1
 */
@Path("/acesso")
@Produces(MediaType.APPLICATION_JSON)
public class AcessoServico {

	/**
	 * 
	 * Metodo responsavel por retornar os acessos <br>
	 * Criado em 12/10/2016 00:55:12
	 *
	 * example: http://localhost:8080/sisTemp-service/rest/acesso
	 *
	 * @author Paulo Cardoso <paulo2118@gmail.com>
	 * @version 0.0.1-SNAPSHOT
	 */
	@GET
	@Produces("application/json")
	public List<AcessoVO> getAcessos() {
		List<AcessoVO> acessoVOs = new ArrayList<>();

		AcessoVO acessoVO = new AcessoVO();
		AcessoVO acessoVO2 = new AcessoVO();

		acessoVO.setId(98L);
		acessoVO.setNome("teste");

		acessoVO2.setId(198L);
		acessoVO2.setNome("teste2");

		acessoVOs.add(acessoVO);
		acessoVOs.add(acessoVO2);

		return acessoVOs;
	}

}
