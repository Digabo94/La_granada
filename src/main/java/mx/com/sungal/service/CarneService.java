package mx.com.sungal.service;

import java.util.List;
import mx.com.sungal.data.CarneDao;
import mx.com.sungal.domain.Carne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Qualifier("CarneService")
public class CarneService implements IService {
    //En esta clase va la logica del negocio

    @Autowired
    CarneDao carneDao;

    @Override
    @Transactional(readOnly = true)
    public List<Object> listarObjeto() {
        List<Object> lista = (List) carneDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void agregarObjeto(Object obj) {
        Carne carne = (Carne) obj;
        carneDao.save(carne);
    }

    @Override
    @Transactional(readOnly = true)
    public Object encontrarObjeto(Object obj) {
        Carne carne = (Carne) obj;
        return carneDao.findById(carne.getIdCarne()).orElse(null);
    }

    @Override
    @Transactional
    public void borrarObjeto(Object obj) {
        Carne carne = (Carne) obj;
        carneDao.delete(carne);
    }

}
