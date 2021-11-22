package aula1118.mesadetrabalho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository repository;

    public List<PortfolioDTO> findAll(){

        List<PortfolioDTO> portfolios = repository.findAll().stream().map(PortfolioDTO::new).toList();
        return portfolios;

    }




}
