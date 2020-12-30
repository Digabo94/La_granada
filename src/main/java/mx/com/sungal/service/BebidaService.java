package mx.com.sungal.service;

import java.util.List;
import org.springframework.stereotype.Service;
import mx.com.sungal.data.BebidaDao;
import org.springframework.beans.factory.annotation.Autowired;
import mx.com.sungal.domain.Bebida;
import mx.com.sungal.domain.Bebida;
import mx.com.sungal.service.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;


@Service
@Qualifier("BebidaService")
public class BebidaService implements IService {
//En esta clase va la logica del negocio
    
    @Autowired
    BebidaDao bebidaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Object> listarObjeto() {
        List<Object> list = (List) bebidaDao.findAll();
        return list;
    }

    @Override
    @Transactional
    public void agregarObjeto(Object obj) {
        Bebida bebida = (Bebida) obj;
        bebidaDao.save(bebida);
    }

    @Override
    @Transactional(readOnly = true)
    public Object encontrarObjeto(Object obj) {
        Bebida bebida = (Bebida) obj;
        return bebidaDao.findById(bebida.getIdBebida()).orElse(null);
    }

    @Override
    @Transactional
    public void borrarObjeto(Object obj) {
        Bebida bebida = (Bebida) obj;
        bebidaDao.delete(bebida);
    }
}
